/* 
@author: Connor Davis
@Date: 1/27/2025
@Purpose: implemented mammal class given the base methods and properties

*/
package labs.example.mammals;

public class Mammals {

    protected String hairColor;
    protected String eyeColor;
    protected String bodyTemp;
    protected String legLength;
    protected String eyeSize;
    protected String tongueTexture;
    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public void run(){
       
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


    public void eat(){
      System.out.println("The " + this.name + " is now eating....");
    }

    public void sleep(){
       
    }

    public void fight(){

    }

    public void drink(){
      
    }

    public void blink(){
     
    }

    public void sniff(){

    }

    public void sit() throws Exception{
        System.out.println("The " + this.name + " is now sitting.....");

        Thread.sleep(15000);

        System.out.println("The " + this.name + " is now standing up....");
        System.out.println("WOOF!!! WOOF!!! WOOF!!!");
    }
    public void getMammalDetails(){
        System.out.println(this.hairColor);
        System.out.println(this.eyeColor);
        System.out.println(this.bodyTemp);
        System.out.println(this.legLength);
        System.out.println(this.eyeSize);
        System.out.println(this.tongueTexture);
        System.out.println(this.name);
    }
}