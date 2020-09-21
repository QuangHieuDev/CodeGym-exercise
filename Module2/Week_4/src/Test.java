import java.util.Scanner;
import java.util.regex.Pattern;

public class Test implements Runnable {

    private int budget = 1000;

    public int getBudget() {
        return budget;
    }


    @Override
    public synchronized void run() {
        try{
            budget -= 10;
            if (budget >= 0){
                System.out.println(budget +"  "+ System.currentTimeMillis());
            } else{
                // ngắt
                Thread.currentThread().interrupt();
            }
            Thread.sleep(50);
        } catch (Exception e) {
        }
    }
//    private String j ;
//    private long time = System.currentTimeMillis();
//    public Test(String j){
//        this.j = j;
//    }
//
//    public synchronized void run() {
//        try {for (int i =0; i <= 5; i++) {
//            time = System.currentTimeMillis();
//            System.out.println(this.j + i + "  " +time);
//            Thread.sleep(500);
//        }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

}
class Run{
    public static void main(String[] args) {
//        Test ts = new Test();
//        for (int i = 0; i <= 60; i++){
//            Thread st1 = new Thread(ts);
//            Thread st2 = new Thread(ts);
//            st1.start();
//            st2.start();
//        }

        StringBuilder stringBuilder = new StringBuilder("");

        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        stringBuilder.append("d");
        stringBuilder.append("00", 0,1);

        //.indexOf tìm kiếm trong chuỗi trả về index nếu ko trả về -1
        //System.out.println(stringBuilder +"  "+stringBuilder.indexOf("1") + "  "+ "aadv".compareTo("aa"));


        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String number = input.next();
        //System.out.println(number.matches("(0|[+])[0-9]{9,10}"));
        boolean pattern = Pattern.matches(number,"(0|[+])[0-9]{9,11}");
//        boolean check = number.matches("(0|[+])[0-9]{9,11}");
//        if (!check) System.out.println("Số điện thoại không đúng.");
//        else System.out.println("Nhập số thành công.");

    }

//    public static void main(String[] args) {
//        Test a = new Test("a");
//        Thread t = new Thread(a);
//        //t.setPriority(Thread.MAX_PRIORITY);
//        Thread g = new Thread(a);
//        //g.setPriority(Thread.MAX_PRIORITY);
//        Thread z = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i =0; i <= 5; i++){
//                    System.out.println("z" + i);
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        t.start();
//        g.start();
//        //z.start();
//    }
}
