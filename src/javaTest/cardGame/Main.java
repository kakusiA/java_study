package javaTest.cardGame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int totalCount =0;
    public static void main(String[] args) {
        Card card = new Card();
        Scanner sc = new Scanner(System.in);
        System.out.print("몇명에서 게임합니까?(2~4): ");
        int playerCount =0;
        try{
            playerCount= sc.nextInt();
            if(playerCount<2 || playerCount>4){
                throw new RuntimeException();
            }
        }catch (Exception e){
            System.out.println("값이 이상합니다.");
            System.exit(0);
        }

        Player[] players = new Player[playerCount];
        int count = 0;
        while(playerCount>count){
            try {
                System.out.print((count+1)+"번 유저의닉네임을 작성해주세요: ");
                String nickname = sc.next();
                players[count] = new Player(nickname);
            }
            catch(RuntimeException e){
                continue;
            }
            count++;
        }
        System.out.print("몇번 반복하나요?");
        int num = sc.nextInt();

        for(int ia = 0; ia < num; ia++) {
            Game.ga(card, players);
            Game.rankCheck(players);
            print(players);
        }
        System.out.println("++++++++++++++++++++++++++++++");
        for(Player p : players){
            System.out.println(p.toString());
        }
        System.out.println("총카운트 :" + totalCount);
        System.out.println("퍼센트 :" + (float)totalCount/num/100);
    }
    static void print(Player[] players){
        int max = players[0].score;
        String nickname = players[0].nickname;
        for (int i = 0; i < players.length; i++) {
//            System.out.println("유저: " + players[i].nickname + "    점수: " + players[i].score);
            if (players[i].score > max) {
                max = players[i].score;
            }
        }
//        System.out.println("최대값: " + maxCheak(max));
        int count = 0;
        for(int i = 0; i < players.length; i++){
            if(players[i].score == max){
                count++;
                players[i].win++;
                players[i].money += 100;
            }
            else{
                players[i].lose++;
            }
        }
        if(count == 2){
//            for(int i = 0; i < players.length; i++){
//                if(players[i].score ==  max){
//                    System.out.println("user :" + players[i].nickname +"    score :"+ players[i].score);
//                }
//            }
            totalCount ++;
//            System.out.println("동점 발생");
        }
    }
    static String maxCheak(int a){
        if(a>0&&a<20) {
            return "노랭크";
        }
        else if(a>60&&a<80){
            return "3카드";
        }
        else if(a>80&&a<100){
            return "4카드";
        } else if (a>20&&a<35) {
            return "1페어";
        }
        else if (a>35&&a<=60) {
            return "2페어";
        }
        else if (a == 113) {
            return "풀 하우스";
        }
        else if (a == 111) {
            return "스트레이트";
        }
        else if (a == 112) {
            return "플러시";
        }
        else if (a == 120) {
            return "스트레이트 플러시";
        }
        else return  "<UNK> <UNK>";
    }
}