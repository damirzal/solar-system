public class Main 
{

    public static void main(String[] args)
{
    double time = 1.00;
    
    SolarSystem sol = new SolarSystem(1000, 1000);
    planets Mercury = new planets(6.00, 70.00, "#8c8c94", 6.00, time);
    planets Venus = new planets (10.00,83.00,"#a57c1b", 4.00, time);
    planets Earth = new planets(12.00, 100.00, "#6b93d6", 2.5, time);
    planets Mars = new planets (8,120.00,"#c1440e", 2, time);
    planets Jupiter = new planets(45,185.00, "#a59186", 0.35, time);
    planets Saturn = new planets (38,260.00,"#c99039", 0.2, time);
    planets Uranus = new planets (17, 300.00, "#4FD0E7", 0.11, time);
    planets Neptune = new planets (15,350.00,"#274687", 0.08, time);
    planets Pluto = new planets (8,255.00,"#361d1d", 0.029, time );
    
    
    moons Ganymede = new moons (5.00, 185.00,"#8b7d82", 0.35, 36.00, 12, time );
    moons lo = new moons (3.00, 185.00,"#f0c420", 0.35, 27.00, 20, time );
    moons Europa = new moons (3.00, 185.00,"#44a9f0", 0.35, 31.00, 17, time );
    moons Callisto = new moons (4.80, 185.00,"3c3c3c", 0.35, 42.00, 8, time );
    moons Moon = new moons(3.00, 100.00, "WHITE", 2.5, 8.00, 30, time);
    moons Titan = new moons(5.00, 260.00,"#354a60",  0.2, 39.00, 10.00 , time);
    moons Triton = new moons(2.50, 350.00,"#d9c4ae",  0.08, 16.00, 20.00 , time);
    moons Asteroids1 = new moons(5.00,260.00,"#ffff99", 0.2,28.00, 18.00, time);
    moons Asteroids2 = new moons(3.00,260.00,"#ffff99", 0.2,33.00, 18.00, time);
    sun Sun = new sun(120.00, 0.00, 0.00, "yellow");
    



     while(true)
     {

        Mercury.drawplanets(sol);
        Venus.drawplanets(sol);
       
        Moon.drawmoons(sol);
        Earth.drawplanets(sol);
        
        Mars.drawplanets(sol);
       
        Jupiter.drawplanets(sol);
        Ganymede.drawmoons(sol);
        lo.drawmoons(sol);
        Europa.drawmoons(sol);
        Callisto.drawmoons(sol);

        Saturn.drawplanets(sol);
        Titan.drawmoons(sol);

        Uranus.drawplanets(sol);
        
        Neptune.drawplanets(sol);
        Triton.drawmoons(sol);
        Asteroids1.asteroids(150, sol);
        Asteroids2.asteroids(150, sol);
        
        Pluto.drawplanets(sol);
        Sun.drawsun(sol);
        sol.finishedDrawing();
     }
}
}