public class Lamp
{

    private String colour;
    private boolean isOn;
    private String bulbType;

    public Lamp(String colour, boolean isOn, String bulbType)
    {
        this.colour = colour;
        this.isOn = isOn;
        this.bulbType = bulbType;
    }

    public String getColour()
    {
        return colour;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public String getBulbType()
    {
        return bulbType;
    }

    public void pressPowerSwitch()
    {
        if (isOn)
        {
            isOn = false;
        }
        else
        {
            isOn = true;
        }

        System.out.println("Lamp.pressPowerSwitch() - Lamp on = " + isOn);
    }

}