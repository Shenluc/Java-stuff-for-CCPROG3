package com.forest;

//Owl Properties
public class Owl {
    private double size;
    private String name;
    private String color;
    private boolean sated;


    public void hoot() {System.out.println("Hoot?");
    }

    public Owl(){
        this.name="Owl";
        this.color="Mottled";
        this.size=1.0;
        this.sated=false;
    }

    // Owl Methods, and not functions
    public void grow (){
        this.size++;
        System.out.println(this.size);
    }

    public void hoot(int Hooters){
        for(int i = 0; i<Hooters;i++)
        {System.out.println("Hoot?");}
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public double getSize(){
        return this.size;
    }

    public boolean isSated(){
        return sated;
    }

    //Setters, allow things to change values

    public void setSize(double size){
        this.size=size;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setSated(boolean sated){
        this.sated=sated;
    }
    
    public void fly(){
        System.out.println("I'm Flying Twin");
        for(int i=0;i<4;i++){
            this.hoot();
        }

}


