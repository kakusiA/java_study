package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class CardTest {
    public String rankCheck(Card[] cardArr) {
        int[]count = new int[13];
        boolean str = true;
        int rank = 0;
        int[]aa = new int[6];
        for(int i=0;i<cardArr.length;i++){
            count[cardArr[i].num] ++;
            if(!(cardArr[0].kind.equals(cardArr[i].kind))){
                str = false;
            }
        }
//        System.out.println(Arrays.toString(count));
        for(int i=0;i<count.length;i++){
            if(count[i]>=1){
                rank++;
                if(rank == 5){
                    break;
                }
            }
            else rank = 0;
            if(count[i]==2){
                aa[2]++;
            }
            else if(count[i]==3){
                aa[3]++;
            }
            else if(count[i]==4) {
                aa[4]++;
            }
        }

        if (aa[3] == 1 && aa[2] == 1) {
            return "FULL HOUSE";
        }
        else if(aa[2] == 1){
            return "1 FAIR";
        }
        else if(aa[2] == 2){
            return "2 FAIR";
        }
        else if(aa[3] == 1){
            return "THREE CARD";
        }
        else if(aa[4] == 1){
            return "FOUR CARD";
        }
        else if(rank == 5 && str == true){
            return "STRAIGHT FLUSH";
        }
        else if(rank == 5){
            return "STRAIGHT";
        }
        else if(str == true){
            return "FLUSH";
        }
        return "No Rank";
    }
    @Test
    public void FourCardTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(1,"H"),new Card(1,"H"),
                new Card(1,"H"),new Card(3,"D")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("FOUR CARD"));
    }


    @Test
    public void fullHouseTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(1,"H"),new Card(1,"H"),
                new Card(3,"H"),new Card(3,"D")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("FULL HOUSE"));
    }

    @Test
    public void flushTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(8,"H"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("FLUSH"));
    }

    @Test
    public void straightTest() {
        // 조건
        Card[] cardArr = {
                new Card(1,"H"),new Card(2,"D"),new Card(3,"H"),
                new Card(4,"H"),new Card(5,"H")};

        // 테스트
        String result = rankCheck(cardArr);

        // 확인
        assertTrue(result.equals("STRAIGHT"));
    }

}

class Card {
    int num;
    String kind;

    Card(int num, String kind){
        this.num = num;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Card [num=" + num + ", kind=" + kind + "]";
    }
}