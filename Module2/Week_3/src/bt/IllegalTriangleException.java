package bt;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(){
    }
    public IllegalTriangleException(String gripe){
        super(gripe);
    }
}

class Run{
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a= in.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b= in.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c= in.nextDouble();
        if(isNegative(a) || isNegative(b) || isNegative(c) ){
            throw new IllegalTriangleException("Số bạn nhập không là cạnh của một tam giác.");
        }else if(check(a,b,c)){
            throw new IllegalTriangleException("Ba cạnh là không là của tam giác");
        }else{
            System.out.println("Ba cạnh là của tam giác");
        }

    }
    public static boolean isNegative(double inputNumber){
        if (inputNumber < 0) return true;
        return false;
    }
    public static  boolean check(double a,double b,double c) {
        if ((a + b < c) || (a + c < b) || (c + b < a)) return true;
        else return false;
    }
}
