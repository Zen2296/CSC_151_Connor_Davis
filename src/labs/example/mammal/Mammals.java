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