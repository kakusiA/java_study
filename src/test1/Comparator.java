package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(12393);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3412);
        arr.add(123);
        arr.add(9);
        System.out.println(arr);
        arr.sort((s1,s2) -> s1-s2);//오름차순
        System.out.println(arr);
        arr.sort((s1,s2) -> s2-s1);//오름차순
        System.out.println(arr);//내림차순

    }
}
class Student2 {
    String name;
    int kor,eng,math;
    int sum;

    Student2(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        sum = (kor +eng + math)/3;
    }

    @Override
    public String toString(){
        return name + ":" + sum;
    }

}
class Student1 implements Comparable<Student1>{
    String name;
    int kor,eng,math;
    int sum;

    Student1(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        sum = (kor +eng + math)/3;
    }
    @Override
    public int compareTo(Student1 std){//정렬 기준을 오버라이등
        return sum - std.sum;
    }

    @Override
    public String toString(){
        return name + ":" + sum;
    }

}
class St21{
    public static void main(String[] args) {
        List<Student1> starr = new ArrayList<>();
        starr.add(new Student1("a",90,80,70));
        starr.add(new Student1("b",90,20,60));
        starr.add(new Student1("c",10,70,70));
        starr.add(new Student1("d",20,100,70));
        starr.add(new Student1("e",90,80,70));

        Collections.sort(starr);
        System.out.println(starr);
    }
}