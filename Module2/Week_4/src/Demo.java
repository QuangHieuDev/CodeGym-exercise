import java.io.*;
import java.util.regex.Pattern;

public class Demo {
//    public static void main(String[] args) throws IOException {
//
//        try {
//            File inFile = new File("Temp/Test.txt");
////            File files = new File("text.txt");
////            files.createNewFile();
////            System.out.println(files.getAbsoluteFile());
////            files.delete();
//            //System.out.println(inFile.getAbsoluteFile());
//
//            if (!inFile.exists()) {
//                inFile.createNewFile();
//            }//kiểm tra xem file đã tồn tại chư nếu không tạo file ms
//
//            FileReader fileReader = new FileReader(inFile);
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            String line = null;
//            while((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("...");
//    }
}

class Table {
    synchronized void printTable(int n){
            for (int i = 1; i <= 5; i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
}
//class MyThread1 extends Thread {
//    Table t;
//    MyThread1(Table t) {
//        this.t = t;
//    }
//    public void run() {
//        t.printTable(5);
//    }
//}
//class MyThread2 extends Thread {
//    Table t;
//    MyThread2(Table t) {
//        this.t = t;
//    }
//    public void run() {
//        t.printTable(100);
//    }
//}

class TestSynchronizedBlock1{
    public static void main(String[] args) {
        final Table obj = new Table();
//        MyThread1 t1 = new MyThread1(obj);
//        MyThread2 t2 = new MyThread2(obj);
//        t1.start();
//        t2.start();

       Thread t1 = new Thread(){
           public void run() {
               obj.printTable(5);
           }
       };
       Thread t2 = new Thread(){
           public void run() {
               obj.printTable(100);
           }
       };
//       t1.start();
//       t2.start();
       System.gc();
        System.out.println(Pattern.matches(".[a]", "sa"));
        System.out.println("Java Java Java".replaceAll("J\\w", "wi"));
    }
}
