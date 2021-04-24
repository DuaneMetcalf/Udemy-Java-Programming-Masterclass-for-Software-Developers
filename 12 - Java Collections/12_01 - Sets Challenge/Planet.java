public final class Planet extends HeavenlyBody
{

    public Planet(String name, double orbitalPeriod)
    {
        super(name, orbitalPeriod, 1);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite)
    {
        if (satellite.getBodyKey().getBodyType().equals("MOON"))
        {
            return super.addSatellite(satellite);
        }
        else
        {
            return false;
        }
    }
}