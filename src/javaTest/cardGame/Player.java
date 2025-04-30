package javaTest.cardGame;

import java.util.Arrays;

public class Player {
    String nickname;
    int score;
    int win,lose,money;
    private CardNum [] deck;

    {
        this.money = 10000;
    }
    Player(String nickname){
        if(nickname.length()>20){
            System.out.println("닉제임이 20자가 넘어갑니다 다시 설정해주세요. ");
            throw new RuntimeException();
        }
        this.nickname = nickname;
    }
    void setCard(CardNum[] cardNums){ //5개의 카드가 들어옴
        deck = cardNums;
    }
    CardNum[] getCard(){
        return deck;
    }
    public void getCardString(){
    }
    public String toString(){
        return "이름: " + nickname + "    우승: " +win +"   패배: " + lose + "   돈: " + money;
    }
}
