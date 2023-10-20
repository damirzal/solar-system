public class sun 
{
    public SolarSystem sol;
    public double diameter;
    public double angle;
    public double distance;
    public String col;
    public String name;

    public sun(double diameter, double angle, double distance, String col)
    {
        this.diameter = diameter;
        this.angle = angle;
        this.distance = distance;
        this.col = col;
        
    }

    public void drawsun(SolarSystem sol)
    {
        sol.drawSolarObject(distance, angle, diameter, col);
    }



}