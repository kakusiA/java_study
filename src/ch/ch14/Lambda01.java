package ch.ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface MyFuntion{
    int max(int a, int b);
}
public class Lambda01 {
    int a = 10;
    int b =20;
    public static void main(String[] args) {
        //기본
//        int max(int a, int b){
//            return a>b ? a:b;
//        }
        //메서드의 이름과 반환타입제거
//        MyFuntion f = (int a,int b) -> { return a>b? a:b;};
        //반환값이 있는경우 식만 작성
//        (int a, int b)-> a>b?a:b;
        //매개변수의 타입이 추론가능하면 생략
//        (a,b) -> a>b ? a:b;
    }
}

class Lambda011 {
    public static void main(String[] args) {
        MyFuntion f = new MyFuntion() {//익명클래스
            @Override
            public int max(int a, int b) {
                return a>b?a:b;
            }
        };
        MyFuntion f1 =(a,b) -> a>b?a:b;//람다식
        int a = f.max(4,5);
        System.out.println(f1.max(123,3213));
        System.out.println(a);
    }
}
class test1{
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface MyFuntion1{
    void myMethod();
}
class Lambda012{
    public static void main(String[] args) {
        MyFuntion1 m1 = ()-> System.out.println("myMethod");
        aMethod(m1);//정의된 메서드 호출

    }
    static void aMethod(MyFuntion1 f){
        f.myMethod();
    }
}
interface MyFuntion2{
    int srqt(int a);

}
class lambda31{
    public static void main(String[] args) {
        MyFuntion2 my2 = a -> a*a;
        System.out.println(my2.srqt(5));
        List<String> list = Arrays.asList("abc","aaa","bbb","dddd");
        Collections.sort(list,(s1,s2)-> s2.compareTo(s1));
        System.out.println(list);
    }
}
class lambda012{
    public static void main(String[] args) {
        Supplier<Integer> a = () ->(int)(Math.random()*10) +1;//매개변수 X 값 O
        System.out.println(a.get());
        Consumer<Integer> consumer = (Integer z) -> System.out.println(z);//매개변수 O 값 X
        consumer.accept(51234);
        Function<String,String> function = (str1) -> str1 +"1234";//매개변수 1개 값 1개
        String str = function.apply("apple");
        System.out.println(str);
        Predicate<Integer> predicate = integer -> integer > 5;//매개변수 O 반환타입 X
        Predicate<Integer> asda = integer -> integer%2  == 0;
        System.out.println(predicate.test(10));//bool
        System.out.println(predicate.and(asda).test(99));//and
        //매개변수2개 ->Bi
        BiConsumer<String,String> biConsumer = (str1,str2) -> System.out.println(str1 + str2);
        biConsumer.accept("as","wqe332");
        UnaryOperator<Integer> unaryOperator= i -> i*i;
        System.out.println(unaryOperator.apply(5));//매개변수와 반환타입이 같을떄
        BinaryOperator<Long> binaryOperator = (l,l1) -> l*l1;
        System.out.println(binaryOperator.apply(417893L,1312445624L));//매개변수 2개랑 반환타입이같을때
        List<String> list = Arrays.asList("abc","aaa","bbb","dddd");
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("1");
        collection.add("6");
        collection.add("5");
        collection.add("4");
        collection.add("3");
        System.out.println(collection);
        collection.removeIf(str1 -> str1.equals("1"));//람다식으로 삭제
        System.out.println(collection);
        list.replaceAll(str1 -> "1324");//모든요소 벼경
        System.out.println(list);
        Iterator<String> iterator = collection.iterator();
        iterator.next();
        iterator.forEachRemaining(str1 -> System.out.println(str1+ "123451"));//수행
        HashMap<Integer,String > hashMap = new HashMap<>();
        hashMap.put(0,"a");
        hashMap.put(1,"b");
        hashMap.put(2,"c");
        hashMap.put(3,"d");
        hashMap.put(4,"e");
        hashMap.put(5,"f");
        System.out.println(hashMap);
        hashMap.compute(0,(k,v1) -> "apple");//키의값 변경
        hashMap.computeIfAbsent(6,(k)-> "sda");//키가없으면 작업을수행
        hashMap.computeIfPresent(4,(i,v) -> i+v );//키가 있으면 작업수행
        System.out.println(hashMap);
        hashMap.merge(0,"1234",(v1,v2)-> v1 + "+"+v2);//해당 인덱스에 값을 병합
        System.out.println(hashMap);
        hashMap.forEach((k,v)-> System.out.println("k= " + k + "|v= " +v));//모든 요소 action
        hashMap.replaceAll((k,b) -> "null");//모든 값치환
        System.out.println(hashMap);
        IntToLongFunction intToLongFunction = i -> i*101321L;//AtoB함수
        System.out.println(intToLongFunction.applyAsLong(1234124454));
        ToIntFunction<Double> toIntFunction = d -> d.intValue();//제네릭에서 double
        System.out.println(toIntFunction.applyAsInt(1312.1324));
        IntFunction<Float> intFunction = i -> (float)i;//int에서 제네릭
        System.out.println(intFunction.apply(1324));
        ObjIntConsumer<String> objIntConsumer = (str1,i)-> System.out.println(str1 + "," + i);
        objIntConsumer.accept("1234",312);//매개변수 제네릭 +int 출력 X;
    }
}
class Lambda013{
    public static void main(String[] args) {
        Function<String,Integer> function1 = str -> Integer.parseInt(str,16);
        System.out.println(Integer.parseInt("123",10));
        System.out.println(function1.apply("abc"));
        Function<Integer,String> function2 = i -> Integer.toBinaryString(i);
        Function<String,String>  function3 = function1.andThen(function2);//람다식 합성 a.andthen(b) = a->b
        Function<String,String> function4 = function2.compose(function1);//a.compose(b) b->a
        System.out.println(function3.apply("abc"));
        System.out.println(function4.apply("abc"));

        Predicate<Integer> p = i -> i<100;
        Predicate<Integer> q = i -> i<200;
        Predicate<Integer> r = i -> i%2 ==0;
        Predicate<Integer> a1 = p.negate();// i>=100
        Predicate<Integer> a2 = a1.and(q).or(r);// i>100 && i<200 || i%2 == 0
        Predicate<Integer> a3 = a1.and(q.or(r));// i>100 && (i<200 || i%2 ==0 )
        System.out.println(a2.test(2));
        System.out.println(a3.test(2));
        String str1 = "123";
        String str2 = "123";
        Predicate<String> predicate1 = Predicate.isEqual(str1);
        System.out.println(predicate1.test(str1));
    }
}
class MyClass{
    String a;
    MyClass(){}
    MyClass(String a ){
        this.a = a;
    }
}
class Lambda4{
    public static void main(String[] args) {
        Function<String,Integer> function1 = str ->Integer.parseInt(str);//하나의 메서드만 호출하는 람다식은
        Function<String,Integer> function2 = Integer::parseInt;//아래와 같이 변경가능

        String str0 = "string";
        Function<String,Boolean> function3 =str -> str0.equals(str);
        // ==
        Function<String,Boolean> function4 = str0::equals;

        Supplier<MyClass> supplier1 = () -> new MyClass();
        // ==
        Supplier<MyClass> supplier2 = MyClass::new;

        Function<String, MyClass> function5 = str -> new MyClass(str);
        // ==
        Function<String, MyClass> function6 = MyClass::new;
        MyClass my = function6.apply("1234");
        System.out.println(my.a);

        Function<Integer,int[]> function7 = i -> new int[i];
        // ==
        Function<Integer,int[]> function8 = int[]::new;
    }
}



