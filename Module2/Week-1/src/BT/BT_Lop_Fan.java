package BT;

public class BT_Lop_Fan {
    public static class Fan {
        public static final int SLOW=1,MEDIUM=2,FAST=3;
        private int speed= SLOW;
        private boolean on=false;
        private double radius=5.0;
        private String color = "blue";

        public Fan(){

        }
        public String fanInfo(){
            return "Fan speed: "+this.speed+", fan radius: "+this.radius+", fan color: "+this.color;
        }

        public void setSpeed(int speed){
            this.speed=speed;
        }
        public void setOn(){
            this.on=true;
        }
        public void setRadius(double radius){
            this.radius=radius;
        }
        public void setColor(String color){
            this.color = color;
        }
//        public int getSpeed(){
//            return this.speed;
//        }
//        public boolean getStatus(){
//            return this.on;
//        }
//        public double getRadius(){
//            return this.radius;
//        }
//        public String getColor(){
//            return this.color;
//        }
        @Override
        public String toString(){
            if(this.on){
                return this.fanInfo() + " fan is on";
            }else{
                return this.fanInfo()+ " fan is off";
            }
        }

    }

    public static class Main {
        public static void main(String[] args) {
            Fan fan1= new Fan();
            Fan fan2= new Fan();

            fan1.setOn();
            fan1.setSpeed(Fan.FAST);
            fan1.setRadius(10);
            fan2.setSpeed(Fan.MEDIUM);
            fan2.setRadius(5);
            fan1.setColor("yellow");
//            fan2.setColor("red");
//
//            String str1= fan1.toString();
//            String str2= fan2.toString();
            System.out.println(fan1);
            System.out.println(fan2);
        }
    }
}
