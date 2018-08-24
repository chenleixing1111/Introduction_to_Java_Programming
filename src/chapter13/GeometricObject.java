package chapter13;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    @Override
    public String toString(){
        return "Created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
