public abstract class HeavenlyBody
{
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final static String[] bodyTypes = {"STAR", "PLANET", "MOON", "ASTEROID", "COMET"};
    private final BodyKey bodyKey;

    public HeavenlyBody(String name, double orbitalPeriod, int bodyType)
    {
        this.bodyKey = new BodyKey(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public BodyKey getBodyKey()
    {
        return bodyKey;
    }


    public double getOrbitalPeriod()
    {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite)
    {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites()
    {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj instanceof HeavenlyBody)
        {
            HeavenlyBody object = (HeavenlyBody) obj;
            return this.bodyKey.equals(object.getBodyKey());
        }

        return false;
    }

    @Override
    public final int hashCode()
    {
        return this.bodyKey.hashCode();
    }

    @Override
    public String toString()
    {
        return this.bodyKey.name + ", " + this.bodyKey.getBodyType() + ", orbital period: " + this.getOrbitalPeriod();
    }

    public static BodyKey makeKey(String name, int bodyType){
        return new BodyKey(name, bodyType);
    }

    public static final class BodyKey{
        private String name;
        private String bodyType;

        public BodyKey(String name, int bodyType)
        {
            this.name = name;
            this.bodyType = bodyTypes[bodyType];
        }

        public String getName()
        {
            return name;
        }

        public String getBodyType()
        {
            return bodyType;
        }

        private int getBodyTypeIndex(String bodyType)
        {
            int index = 0;
            while (index < bodyTypes.length)
            {
                if (bodyTypes[index].equals(bodyType))
                {
                    return index;
                }
                index++;
            }

            return -1;
        }

        @Override
        public int hashCode()
        {
            return this.name.hashCode() + this.getBodyTypeIndex(this.bodyType) + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj)
        {
            BodyKey key = (BodyKey) obj;
            if(this.name.equals(key.getName())){
                return this.bodyType == key.getBodyType();
            }

            return false;
        }

        @Override
        public String toString()
        {
            return this.name + ": " + this.getBodyType();
        }
    }

}