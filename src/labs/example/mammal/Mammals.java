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
      System.out.println("The " + this.name + " is now eating....")
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

    public void sit(){
        
    }
}