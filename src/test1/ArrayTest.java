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

class Stack1{
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(10);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.search(10));
    }
}
class Queue1{
    public static void main(String[] args) {
//        Queue q = new Queue();//인터페이스
        Queue q = new ArrayDeque();
        q.add(5);//오류 발생
        q.offer(4);//오류 발생 X
        q.remove();//오류발생
        q.poll();//오류발생 X
        q.offer(13);
        q.offer(13);
        q.offer(13);
        q.offer(321);
        System.out.println(q.peek());
        System.out.println(q);
    }
}

class Itera{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(145);
        al.add(451);
        al.add(134);
        al.add(5461);
        al.add(2311);
        al.add(1241);
        al.add(1123);
        al.add(213);
        Iterator it = al.iterator();//이터레이터 선언
        while (it.hasNext()){//없을때까지 true
            System.out.println(it.next());//요소 읽어오기
        }
        System.out.println("+++++++++++++++");
        for(Object i : al){
            System.out.println(i);
        }
    }
}

class Arr{
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,43,12,4,1,3412,31,24,231};
        System.out.println(Arrays.toString(arr));
        int[] arr2 =Arrays.copyOf(arr,arr.length);//~까지 카피
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOfRange(arr,0,4);//~에서~까지 카피
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = new int[10];
        Arrays.fill(arr4,9);//값을 모두 9로 채움
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr2);//정렬
        System.out.println(Arrays.toString(arr2));
        int idx = Arrays.binarySearch(arr2,31);//값으 인덱스 찾음 반드시 정렬필
        System.out.println(idx);
    }
}

class ad {
    public static void main(String[] args) {
        int[] a = new int[10000000];
        Long sum = 0L;
        for (int i = 0; i<a.length; i++){
            a[i] = (int)(Math.random()*10000);
        }
        Arrays.sort(a);
        int count = 0;
        for (int i : a){
            sum += i;
            count ++;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println(count);

    }
}

class aqwe{
    public static void main(String[] args) {
        int [] al = {1,23,2,4,5};
        LinkedList La = new LinkedList();
        La.add(4);
        La.add(4);
        La.add(4);
        La.add(4);
        System.out.println(Arrays.toString(La.toArray()));
        System.out.println(La.toArray());
        System.out.println(al);
        System.out.println(al[1]);
        System.out.println(al[0]);
    }
}
interface AB{
    void print();
}
class B{
    int x;
    int y;
}

class A extends B{
    int z;
}

class C extends B{
    int c;
}

class Box<T extends B> implements AB{//제네릭스
    T a;
    void prq(){
        if(a instanceof A){
            A aa = (A)a;
            aa.z =30;
            System.out.println(aa.z);
        }
        else if(a instanceof C){
            C cc =(C)a;
            cc.c=60;
            System.out.println(cc.c);
        }
        else System.out.println(a.x);
    }
    Box(T t){
        this.a =t;
    }
    public void print(){
        System.out.println(a.x);
        System.out.println(a.y);
    }
}

class dasd{
    public static void main(String[] args) {
        Box<? extends B> az = new Box<>(new C());
        az.a.x =10;
        az.a.y =20;
        az.print();
        az.prq();
    }
}

