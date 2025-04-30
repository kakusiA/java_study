package javaTest.cardGame;

import java.util.*;

public class Game {
    public static void rankCheck(Player[] players) {
        for (int x = 0; x < players.length; x++) {
            int[] count = new int[14];
            int maxcard =players[x].getCard()[0].getCardNumber();
            boolean str = true;
            int rank = 0;
            int[] aa = new int[6];
            int sum = 0;
            for (int i = 0; i < players[x].getCard().length; i++) {
                if (players[x].getCard()[i].getCardNumber() > maxcard) {
                    maxcard = players[x].getCard()[i].getCardNumber();
                }
                count[players[x].getCard()[i].getCardNumber()]++;
                if (!(players[x].getCard()[0].getKind().equals(players[x].getCard()[i].getKind()))) {
                    str = false;
                }
            }
            //        System.out.println(Arrays.toString(count));
            for (int i = 0; i < count.length; i++) {
                if (count[i] >= 1) {
                    rank++;
                    if (rank == 5) {
                        break;
                    }
                } else rank = 0;
                if (count[i] == 2) {
                    sum += i;
                    aa[2]++;
                    if (aa[2] == 2) {
                        players[x].score = 35 + sum;
                    }
                    else {
                        players[x].score = 20 + sum;
                    }
                } else if (count[i] == 3) {
                    aa[3]++;
                    players[x].score =  60 + i;//3카드
                } else if (count[i] == 4) {
                    aa[4]++;
                    players[x].score =  80 + i;//4카드
                }
            }

            if (aa[3] == 1 && aa[2] == 1) {
                players[x].score =  113;//풀하우스
            } else if (aa[2] == 1) {
            } else if (aa[2] == 2) {
            } else if (aa[3] == 1) {
            } else if (aa[4] == 1) {
            } else if (rank == 5 && str) {
                players[x].score =  120;//스트레이트 플러시
            } else if (rank == 5) {
                players[x].score =  111;//스트레이트
            } else if (str) {
                players[x].score =  112;//플러시
            }
            else players[x].score = maxcard;//페어X
        }
    }

    public static Player[] ga(Card card,Player[] players){//player.length*5개의 카드를 뽀아서 각각의 플레이어에게 넣는 메서드
        Set<CardNum> cardSet = new HashSet<>();
        while(true){
            if(cardSet.size()==players.length*5){
                break;
            }
            cardSet.add(card.cardarr[(int)(Math.random()*card.cardarr.length)]);
        }
        CardNum[] cardNums = cardSet.toArray(new CardNum[cardSet.size()]);
        for(int i=0;i<players.length;i++){
            players[i].setCard(Arrays.copyOfRange(cardNums,i*5,i*5+5));
        }
        return players;
    }
}
