public class moons extends planets
{
    public double distanceabout;
    public double angleabout;
    public double speedabout;
    public double distanceabout1;

    public moons(double diameter, double distance, String col, double speed, double distanceabout, double speedabout, double time)
    {  super(diameter,  distance,  col,  speed,  time);

       this.distanceabout = distanceabout;
       this.speedabout = speedabout;
       
    }

    public void asteroids(int amountofasteroids, SolarSystem sol)
    {   
        super.calculations();
        distanceabout1 = (distanceabout + (7/(speedabout)));
        angleabout = (angleabout + (speedabout*time));
    
            for(int i = 0; i < amountofasteroids; i++)
            {  
               angleabout = angleabout+5;
               sol.drawSolarObjectAbout(distance1, angle, diameter, col, distanceabout1, angleabout);   
            }
            
    }

    public void drawmoons(SolarSystem sol)
    {     
        
        super.calculations();
        distanceabout1 = (distanceabout + (7/(speedabout)));
        angleabout = (angleabout + (speedabout*time));
        sol.drawSolarObjectAbout(distance1, angle, diameter, col, distanceabout1, angleabout);
    }
}