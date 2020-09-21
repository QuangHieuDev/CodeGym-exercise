package th;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise {
    static void ch(){
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        String string = input.nextLine();
        for (int i= 0; i < string.length(); i++){
            if (list.size() > 1
                    && string.charAt(i) <= list.getLast()
                    && list.contains(string.charAt(i)) ){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max) System.out.print(ch);
        System.out.println();
    }

    static void ch1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ch();
        System.out.println();
        ch1();
    }

}
