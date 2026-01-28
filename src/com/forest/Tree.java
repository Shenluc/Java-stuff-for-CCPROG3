
package com.forest;

public class Tree {
    private String name;
    private double size;
    private resident Owl;

    public Tree(){
        this.name="Oak";
        this.size=50.0;
    }

    public String getName(){
        return this.name;
    }

    public double getSize() {
        return this.size;
    }

    public Owl getResident(){
        return this.resident;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSize(double size){
        this.size=size;
    }


}


