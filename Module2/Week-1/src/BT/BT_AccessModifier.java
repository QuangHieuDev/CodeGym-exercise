package BT;

public class BT_AccessModifier {
    public static class Circle {
        private double radius=1.0;
        private String color = "red";
        public Circle(){

        }
        public Circle(double radius){
            this.radius=radius;
        }
        public double getRadius(){
            return this.radius;
        }
        double getArea(){
            return Math.PI*this.radius*this.radius;
        }
    }

    public static class Main {
        public static void main(String[] args){
            Circle circle= new Circle(20.0);
            double a=circle.getArea();
            System.out.println("Area: "+a);
        }
    }
}
