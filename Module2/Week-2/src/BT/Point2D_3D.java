package BT;

public class Point2D_3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,1);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3,4,2);
        System.out.println(point3D);
    }
}

class Point2D{
    private float x;
    private float y;
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getX(){
        return this.x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getY(){
        return this.y;
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
        return "{x: "+this.x+",y:"+this.y+"}";
    }
}
class Point3D extends Point2D{
    private float z;
    public Point3D(){
        super();
        this.z=1.0f;
    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public double getZ(){
        return this.z;
    }
    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] myArr=new float[3];
        myArr[0]=super.getX();
        myArr[1]=super.getY();
        myArr[2]=this.z;
        return myArr;
    }
    @Override
    public String toString(){
        return "{x: "+super.getX()+", y: "+super.getY()+", z:"+this.z+" }";
    }
}
