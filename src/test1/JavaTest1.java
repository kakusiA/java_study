package test1;


import java.util.Arrays;
import java.util.Scanner;

class CoustomException extends Exception{
    CoustomException(String s){
        super(s);
    }
}

class Student{
    private String name;
    private Integer score;
    public void setName(String name){
        this.name = name;
    }
    public void setScore(Integer score) throws CoustomException{
        if (score >100 || score<0){
            throw new CoustomException("100을 초과했습니다.");
        }
        this.score = score;
    }

    @Override
    public String toString(){
        return "이름: " + name + ", 점수 : "+ score;
    }
}
public class JavaTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하시오. : ");
        int a = sc.nextInt();
        Student[] st = new Student[a];
        for (int i = 0; i<a;i++){

            st[i] = new Student();
            System.out.print("학생" + (i+1) + "이름: ");
            st[i].setName(sc.next());
            try {
                System.out.print("학생" + (i+1) + "점수: ");
                st[i].setScore(sc.nextInt());
            }
            catch (CoustomException e){
                System.out.println(e.getMessage());
            }
            Arrays.sort(st );
        }
        System.out.println(st[0]);
    }
}
