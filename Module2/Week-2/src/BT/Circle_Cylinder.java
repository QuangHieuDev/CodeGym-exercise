package BT;

public class Circle_Cylinder {
    public static void main(String[] args) {
        Cylinder colin= new Cylinder(5.1,"blue",5.7);
        double volumeOfCylinder= colin.getVolume();
        System.out.println(volumeOfCylinder);
    }
}

class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color="Green";
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        super();
        this.height=1.0;
    }
    public Cylinder(double height){
        super();
        this.height=height;
    }
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }
    public double getVolume(){
        double radius= super.getRadius();
        return Math.PI*Math.pow(radius,2)*this.height;
    }
}
