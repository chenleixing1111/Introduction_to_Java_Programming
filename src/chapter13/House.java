package chapter13;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{

    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public int compareTo(House o) {
        if(this.area > o.getArea()){
            return 1;
        }else if(this.area < o.getArea()){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        House house = (House) super.clone();
        house.whenBuilt = (Date) this.whenBuilt.clone();
        return house;
    }

    public static void main(String[] args){
        try{
            House h1 = new House(1, 1750.50 );
            House h2 = (House) h1.clone();
            System.out.println(h1 == h2);
            System.out.println(h1.whenBuilt == h2.whenBuilt);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
