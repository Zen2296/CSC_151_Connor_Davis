/* 
@author: Connor Davis
@date: 02/10/2025
@purpose: the main class for the physics class
*/

package labs.example.physics;

public class Main {
    public static void main(String[] args) throws Exception{
        Physics phy = new Physics();
        System.out.println(phy.getDistance(6,5) + " miles");
        System.out.println(phy.getVelocity(5,6) + " mph");
        System.out.println(phy.getMomentum(5,6) + " kg m/s");
        System.out.println(phy.getForce(5,6) + " kg m/s^2");
        System.out.println(phy.getWork(5,6) + " Joules");
        Sytem.out.println(phy.getKineticEnergy(5,6) + " Joule");
        Sytem.out.println(phy.getPotentialEnergy(5,6,5) + " Joule");
    }









}