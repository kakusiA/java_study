package ch.ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01{
    public static void main(String[] args) {
        //컬렉션으로부터 스트림 생성
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> integerStream = list.stream();//스트림 선언
        //배열로부터 스트림 생성
        Stream<String> stringStream1 = Stream.of("a","b","c");//가변인자.
        Stream<String> stringStream2 = Stream.of(new String[]{"a","b","c"});//생성
        Stream<String> stringStream3 = Arrays.stream(new String[]{"a","b","c"});//생성
        Stream<String> stringStream4 = Arrays.stream(new String[]{"a","b","c"},0,3);//0에서 3까지
        //특정 범위를가진 요소 만들기
        IntStream intStream1 = IntStream.range(1,100);//1~99
        IntStream intStream2 = IntStream.rangeClosed(1,100);//1~100

        //난수를 요소로 갖는 스트림 생성
        IntStream intStreamRand1 = new Random().ints();//난수 무한 스트림 ints,lons
        IntStream intStreamRand3 = new Random().ints(0,100);//0~100사이의 난수
        intStreamRand3.limit(1000).forEach(System.out::println);
        intStreamRand1.limit(5).forEach(System.out::println);//리미트조정후 출력
        IntStream intStreamRand2 = new Random().ints(5);//난수 5길이의 스트림 생성 유한 스트림
        intStreamRand2.forEach(System.out::println);
        //람다식을 소스로 하는 스트림 생성
        Stream<Integer> stream1 = Stream.iterate(1,i -> i*2);//2의배수제곱근
        stream1.limit(5).forEach(System.out::println);
        Stream<Double> stream2 = Stream.generate(Math::random);//double타입의 랜덤값
        stream2.limit(5).forEach(System.out::println);
        Stream<Integer> stream3 = Stream.generate(() -> 1);//값이 1
        stream3.limit(5).forEach(System.out::println);

        //파일을 소스로 하는 스트림 생성
        Path dir = Paths.get("src");
        try {
            Stream<Path> Fstream = Files.list(dir);//해당 경로 내의 디렉토리 또는 파일을 보여줌
            Fstream.forEach(System.out::println);
        }
        catch (IOException e){}
    }
}

class Stream02{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,1,2,2,3,4,5,6,7,7,8);
        Stream<Integer> intStream =  list2.stream();
        Stream<Integer> intStream1 =  list2.stream();
        Stream<Integer> stream1 = Stream.iterate(1,i -> i*2);//2의배수제곱근
        Stream<Integer> stream2 = Stream.iterate(1,i -> i*2);//2의배수제곱근
        Stream<Integer> stream3 = Stream.iterate(1,i -> i*2);//2의배수제곱근
        Stream<Integer> stream4 = Stream.iterate(1,i -> i*2);//2의배수제곱근
        list.stream().skip(3).forEach(System.out::println);//앞 3개 건너뜀
        System.out.println("+++++++++++++++++++++++++++++++");
        stream1.limit(10).forEach(System.out::println);//10개이후요소는 잘라냄
        System.out.println("+++++++++++++++++++++++++++++++");
        stream2.limit(10).skip(5).forEach(System.out::println);//10개중에 5개 스킵 길이 5
        System.out.println("+++++++++++++++++++++++++++++++");
        stream3.skip(5).limit(10).forEach(System.out::println);//5개 스킵후 10개 가져옴 길이 10
        System.out.println("+++++++++++++++++++++++++++++++");
        stream4.filter(i -> i%10 ==0).limit(10).forEach(System.out::println);//if문 제약조건
        System.out.println("+++++++++++++++++++++++++++++++");
        intStream.distinct().forEach(System.out::println);//중복제거
        System.out.println("+++++++++++++++++++++++++++++++");
        intStream1.filter(i -> i<5).distinct().forEach(System.out::println);
    }
}