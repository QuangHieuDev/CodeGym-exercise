package th;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputStrig = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i= 0; i< inputStrig.length(); i++){
            int ascii = (int) inputStrig.charAt(i);
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char charter = (char) 255;
        for(int j =0; j < 255; j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                charter = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + charter + "' with a frequency of " + max + " times");
    }
}
