import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.BodyKey, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args)
    {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon); //

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getBodyKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getBodyKey(), temp);
        planets.add(temp);

        System.out.println("Planets:");
        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet);
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", 1));
        System.out.println("Moons of " + body.getBodyKey());
        for(HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getBodyKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("Moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon);
        }

        HeavenlyBody pluto = new Star("Pluto", 842);
        planets.add(pluto);

        System.out.println("Planets:");
        for(HeavenlyBody planet : planets){
            System.out.println("\t" + planet);
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println("Earth1 = Earth2: " + earth1.equals(earth2));
        System.out.println("Earth2 = Earth1: " + earth2.equals(earth1));
        System.out.println("Earth1 = Pluto: " + earth1.equals(pluto));
        System.out.println("Pluto = Earth1: " + pluto.equals(earth1));

        solarSystem.put(pluto.getBodyKey(), pluto);
        System.out.println(solarSystem.get((HeavenlyBody.makeKey("Pluto", 1))));
        System.out.println(solarSystem.get((HeavenlyBody.makeKey("Pluto", 0))));

        System.out.println();
        System.out.println("Solar System:");
        for(HeavenlyBody celestialBody : solarSystem.values()){
            System.out.println("\t" + celestialBody);
        }

    }
}