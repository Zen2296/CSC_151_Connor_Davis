/*
@author: Connor Davis
@date: 02/10/2025
@purpose: Physics problems for implementation
*/
package labs.example.physics;

import java.lang.Math;

public class Physics {
    final static double GRAVITY = 9.81;

    public double getDistance(double v, double t){
        double x = v * t;
        return x;
    }

    public double getVelocity(double x, double t){
        double v = x / t;
        return v;
    }

    public double getMomentum(double m, double v){
        double p = m * v;
        return p;
    }

    public double getForce(double m, double a){
        double f = m * a;
        return f;
    }

    public double getWork(double f, double d){
        double w = f * d;
        return w;
    }

    public double getKineticEnergy(double m, double v){
        double ke = ((1/2)*m)*(v*v);
        return ke;
    }

    public double getPotentialEnergy(double m, double g, double h){
        double pe = m * g * h;
        return pe;
    }
    
    public double getTheta(){
           //Establishing variables for the distance of the mammal walked
        int South = 3;
        int East = 4;
    // Calculating the distance between the starting point and the ending point with pathagorean theorem
    int distancesquare = (South * South) + (East * East);
    int distance = (int)Math.sqrt(distancesquare);
    // Aquiring angle of the triangle that was made with the distances
    double angle = Math.atan2(South, East);
    // Printing out the final answers
    System.out.println("The distance between the staring point and ending point is: " + distance + " miles");
    System.out.println("The the angle of the triangle made by these distances is: "+ Math.toDegrees(angle) +" degrees");
    // Returning the value distance
    return angle;
    }

    public double getLightSpeedInMPH(){
        double lightspeed = 186282;
        double secondsinhour = 3600;
        double hourslightspeed = lightspeed / secondsinhour;
        return hourslightspeed;
    }

    public double getKnownDistancetoEarth(){
        double knowndistance = 92947266.72;
        return knowndistance;
    }

    public double getTimeFromSunToEarthInHours(){
        double lightspeedhour = getLightSpeedInMPH();
        double distancetoearth = 92947266.72;
        double distanceinhours = distancetoearth / lightspeedhour;
        return distanceinhours;
    }
    
    public void logEarthtoSunInvalidDistance(){
        System.out.println("This distance is invalid due to already known distance not equaling it.");
    }

    public void logInvalidAngleInfo(double theta){
        System.out.println("logging the angle " + theta + " degrees. This is not a right angle");
    }

    public void logValidAngleInfo(double theta){
        System.out.println("logging the angle " + theta + " degrees. This is a valid 3-4-5 triangle");
    }
}