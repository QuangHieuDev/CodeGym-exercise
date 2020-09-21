package BT;

class Squares extends BT.Rectangle implements BT.Colorable {


    public Squares(double side){
        super(side,side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "The Square with side: "+this.getSide()+" - subclass of"+super.toString();
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four side");
    }
}

public class interface_Colorable {
    public static void main(String[] args) {
        Squares[] shapes = new Squares[4];
        shapes[0] = new Squares(5.2);
        shapes[1] = new Squares(5.8);
        shapes[2] = new Squares(7);
        shapes[3] = new Squares(2.4);

        //System.out.println(shapes[1]);

        for (Squares myShapes : shapes) {
            if (myShapes instanceof BT.Colorable) {
                Squares theShape = (Squares) myShapes;
                theShape.howToColor();
                System.out.println(myShapes.getArea());
            }
        }
    }
}
