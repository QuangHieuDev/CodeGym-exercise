import BT.MyList;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    public static void main(String[] args) throws Exception {
        MyList<String> myArrayList=new MyList<String>();
        System.out.println(myArrayList.getDEFAULT_SIZE());
        myArrayList.add(0,"Long");
        myArrayList.add("HN");
        myArrayList.add("30");
        myArrayList.add("IT");

        myArrayList.add(2,"VN");

        myArrayList.remove(2);

        for (int i =0 ; i< myArrayList.getDEFAULT_SIZE()-1;i++){
            System.out.println(myArrayList.get(i));
        }


        System.out.println(myArrayList.getDEFAULT_SIZE());
    }

}