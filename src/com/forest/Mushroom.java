package com.forest;

public class Mushroom {
    private String name;
    private double size;

    public Mushroom(){
        this.name="Button";
        this.size=3.0;
    }

    public String getName(){
        return this.name;
    }

    public double getSize() {
        return this.size;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSize(double size){
        this.size=size;
    }

}
