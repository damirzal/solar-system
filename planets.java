

public class planets
{
    public SolarSystem sol;
    public double diameter;
    public double angle;
    public double distance ;
    public String col;
    public double speed;
    public double time;
    public double distance1;
    public double comdistance;

    public planets(double diameter, double distance, String col, double speed, double time)
    {
       this.diameter = diameter;
       this.distance = distance;
       this.col = col;
       this.speed = speed;
       this.time = time;
       
    }
    public void calculations()
    {
        distance1 = (distance + (7/speed));
        angle = (angle + (speed*time));
    }
       
    public void drawplanets(SolarSystem sol)
    {   
        calculations();
        sol.drawSolarObject(distance1, angle, diameter, col);
    }
}