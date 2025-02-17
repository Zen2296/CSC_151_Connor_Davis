/* 
@author: Connor Davis
@date: 02/10/2025
@purpose: the main class for the physics class
*/
package labs.example.physics;
import java.text.DecimalFormat;

public class Main{
     public static void main(String[] args){
        Physics physics = new Physics();
        double distance = physics.getDistance(6,5);
        System.out.println(distance);
        System.out.println(physics.getVelocity(5,6) + " mph");
        System.out.println(physics.getMomentum(5,6) + " kg m/s");
        System.out.println(physics.getForce(5,6) + " kg m/s^2");
        System.out.println(physics.getWork(5,6) + " Joules");
        System.out.println(physics.getKineticEnergy(5,6) + " Joule");
        System.out.println(physics.getPotentialEnergy(5,6,5) + " Joule");
        double distancetosunfromearth = physics.getDistance(physics.getLightSpeedInMPH(),physics.getTimeFromSunToEarthInHours());
        double distanceknown = physics.getKnownDistancetoEarth();

        DecimalFormat decimalformat = new DecimalFormat("#,###.##");

        if (distancetosunfromearth != distanceknown){
            physics.logEarthtoSunInvalidDistance();
        }
        System.out.println("The sun is " + decimalformat.format(distancetosunfromearth) + " miles from earth");

        double angle = physics.getTheta();
        if (angle > 37 || angle < 36.87){
            physics.logInvalidAngleInfo(angle);
        }
        else{
            physics.logValidAngleInfo(angle);
        }



        }


        
    









}