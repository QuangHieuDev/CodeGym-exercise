package bt;

import java.util.TreeMap;

public class dem_so_lan_lap_tu_sd_map {
    public static void main(String[] args) {
        String myString= "Đếm số lần xuất hiện của mỗi từ trong một chuỗi sử dụng Map.".toLowerCase();
        TreeMap<String, Integer> myTreeMap= new TreeMap<>();

        for (int i =0; i< myString.length();i++){

            String letter= String.valueOf(myString.charAt(i));
            if(!letter.equals(" ")){
                if(myTreeMap.containsKey(letter)){
                    myTreeMap.put(letter,myTreeMap.get(letter)+1);
                }else{
                    myTreeMap.put(letter,1);
                }
            }

        }

        System.out.printf(String.valueOf(myTreeMap));
    }
}
