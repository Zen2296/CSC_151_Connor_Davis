/*
@author: Connor Davis
@date: 1/29/2025
@Purpose: Dog class to go along with mammal class
*/

package labs.example.mammals;

public class Dog extends Mammals{


    public void Dog(){

    }

    public void bark(){
        System.out.println("woof........woof........woof");
    }

    public void fetch(){

    }

    public void pant(){
        
    }

    public int walk() throws Exception{
       //Establishing variables for the distance of the mammal walked
        int South = 3;
        int East = 4;
    // Printing out the visual aspect of the walk
    System.out.println("The "+ this.name + " walks 3 miles south....");
    Thread.sleep(3000);
    System.out.println("The "+ this.name + " turns right and walks another 4 miles east....");
    Thread.sleep(4000);
    // Calculating the distance between the starting point and the ending point with pathagorean theorem
    int distancesquare = (South * South) + (East * East);
    int distance = (int)Math.sqrt(distancesquare);
    // Aquiring angle of the triangle that was made with the distances
    double angle = Math.atan2(South, East);
    // Printing out the final answers
    System.out.println("The distance between the staring point and ending point is: " + distance + " miles");
    System.out.println("The the angle of the triangle made by these distances is: "+ Math.toDegrees(angle) +" degrees");
    // Returning the value distance
    return distance;
    }

    public void whine(){

    }

    public void growl()[
        System.out.println("GRRRRRRRR....");
    ]
}
