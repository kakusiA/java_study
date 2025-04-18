package ch.ch12;
enum DAY {MON,TUE,WED,THU,FRI,SAT,SUN}
enum SEASON {
    SPRING("봄"),
    SUMMER("여름"),
    AUTUMN("가을"),
    WINTER("겨울");


    private String season;
    SEASON(String season) {//생성자 싱글턴
        this.season = season;
    }
    public String getSeason() {
        return season;
    }
}

public class Enum01 {
    public static void main(String[] args) {
        DAY day = null;
        day = DAY.MON;
        String mon = DAY.MON.name();
        System.out.println(day == DAY.MON);//객체이기떄문에 주소가 같음
        System.out.println(day.equals(DAY.MON));
        System.out.println(day);
        System.out.println(mon);
        System.out.println(SEASON.SPRING);
        System.out.println(SEASON.SPRING.getSeason());
    }
}
