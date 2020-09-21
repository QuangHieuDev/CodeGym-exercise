package BT;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch(){
        this.startTime= LocalDateTime.now();
    }
    public void start(){
        this.startTime=LocalDateTime.now();
    }
    public void stop(){
        this.endTime=LocalDateTime.now();
    }
    public int getElapseTime(){
        Calendar cldStart= Calendar.getInstance();
        Calendar cldEnd= Calendar.getInstance();
        cldStart.set(this.startTime.getYear(),this.startTime.getMonthValue(),this.startTime.getDayOfMonth(), this.startTime.getHour(),this.startTime.getMinute(),this.startTime.getSecond());
        cldEnd.set(this.endTime.getYear(),this.endTime.getMonthValue(),this.endTime.getDayOfMonth(),this.endTime.getHour(),this.endTime.getMinute(),this.endTime.getSecond());
        return (int)cldEnd.getTimeInMillis() - (int)cldStart.getTimeInMillis();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StopWatch myWatch= new StopWatch();

        System.out.print("Nhập vào chiều dài của mảng :");
        int length= in.nextInt();
        int[] myArr=generateArray(length);

        myWatch.start();
        int[] sortArray=selectionSort(myArr);
        myWatch.stop();
        int ellapseTime= myWatch.getElapseTime();
        System.out.println("Thời gian để sắp xếp mảng với thuật toán section sort là: "+ellapseTime+" ms");
        System.out.println(Arrays.toString(sortArray));

    }
    public static int[] selectionSort(int[] myArr){
        int max=myArr[0];
        for (int i =0; i<myArr.length;i++){
            for (int j=i+1; j<myArr.length;j++){
                if(myArr[i] > myArr[j]){
                    int temp = myArr[i];
                    myArr[i]=myArr[j];
                    myArr[j]=temp;
                }
            }
        }
        return myArr;
    }

    public static int[] generateArray(int length){
        int[] myArr=new int[length];
        for (int i=0;i < length;i++){
            myArr[i]=(int)Math.floor(Math.random()*10000);
        }
        return myArr;
    }
}

