package BT;

public class Point_MoveablePoint {
    public static void main(String[] args) {
        MovablePoint myObj= new MovablePoint(50,50,5,4);
        myObj=myObj.move(myObj);
        float newX= myObj.getX();
        float newY=myObj.getY();

        System.out.println("X position os: "+newX);
        System.out.println("Y position os: "+newY);
    }
}

class Point {
    private float x;
    private float y;
    public Point(){
        this.x=0.0f;
        this.y =0.0f;
    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] myArr= new float[2];
        myArr[0]=this.x;
        myArr[1]=this.y;
        return myArr;
    }
    @Override
    public String toString(){
        return "(x:"+this.x+" , y: "+this.y+" )";
    }
}
class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(x: " + super.getX() + ",y: " + super.getY() + "), speed= (xs: " + this.xSpeed + ",ys: " + this.ySpeed + ")";
    }

    public MovablePoint move(MovablePoint obj) {
        float x = super.getX() + this.xSpeed;
        float y = super.getY() + this.ySpeed;
        obj.setXY(x, y);
        return obj;
    }
}

