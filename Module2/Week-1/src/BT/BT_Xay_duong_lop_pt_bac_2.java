package BT;

public class BT_Xay_duong_lop_pt_bac_2 {
    public static class Quadratic<result> {
        double a, b, c;
        double delta;

        public Quadratic() {

        }

        public Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public String display() {
            return "Quadratic: " + a + "*X2 + " + b + "*X + " + c;
        }

        public String getDiscriminant() {
            delta =b*b - 4*a*c;
            if (delta == 0) {
                return "Phương trình có nghiệm kép: "+ getRoot1();
            } else if (delta > 0) {
                return "Nghiệm thứ nhất của phương trình là: " + getRoot1() +"\n"+ "Nghiệm thứ hai của phương trình là: " + getRoot2();
            } else return "Phương trình vô nghiệm.";
        }

        public double getRoot1() {
            return (-b + Math.sqrt(delta))/(2*a);
        }

        public double getRoot2() {
            return (-b - Math.sqrt(delta))/(2*a);
        }
    }

    public static void main(String[] args) {
        Quadratic out = new Quadratic(1,2,1);

        System.out.println(out.getDiscriminant());
    }
}
