package ch.ch09;

import java.util.ArrayList;

public class Ch09_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(10); //자동으로 컴파일이
        list.add(new Integer(10));//으로 병경으로해줌
        System.out.println(list);
        int i = list.get(0);//도 자동으로
        int i1 = list.get(0).intValue();//로 자동으로 변경해줌

    }
}
