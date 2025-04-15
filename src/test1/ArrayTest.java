package test1;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList a = new ArrayList(100);
        for(int i = 0; i<100; i = i+4){
            a.add(i);
        }
        System.out.println(a.size());
        System.out.println(Arrays.toString(a.toArray()));
        a.addFirst(100);
        System.out.println(a.size());//객체의 크기
        System.out.println(Arrays.toString(a.toArray()));
        a.addLast(103);//추가
        System.out.println(Arrays.toString(a.toArray()));
        a.removeLast();
        a.set(3,10);//3번 인덱스에 10추가
        a.removeLast();//마지막 인덱스 삭제
        a.removeFirst();
        a.removeFirst();//첫번쨰 인덱스 삭제
        a.remove(10);
        a.add(2,5);
        a.add(10,10);
        System.out.println(a.size());
        System.out.println(a.contains(72));//값 유무
        System.out.println(a.indexOf(10));//첫번째 요소의 인덱스를 찾음
        System.out.println(Arrays.toString(a.toArray()));
        System.out.println(a.subList(4,10));//4에서 10까지 인덱스를 반환
        System.out.println(a);
        //Map
        Map<Integer,String > map = new LinkedHashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(1));
//        System.out.println(map.getClass());
        System.out.println(map.entrySet());
        System.out.println(map);

        Set<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(10);
        s.add(11);
        s.add(10);
        s.add(10);
        s.add(15);
        s.add(14);
        s.add(13);
        s.add(13);
        s.add(12);
        int [] in3 = {1,3,5,6,4,8,7,687,8,7,756,6};
        Set<Integer> v = new TreeSet<>();
        for(int i =0; i<in3.length; i++){
            v.add(in3[i]);
        }
        System.out.println(v);
        System.out.println(s.size());
        System.out.println(s.hashCode());
    }
}
