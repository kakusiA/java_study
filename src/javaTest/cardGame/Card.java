package javaTest.cardGame;
class CardNum{
    private final int CARD_NUMBER;
    private final String KIND;
    CardNum(int cardNumber, String kind) {
        CARD_NUMBER = cardNumber;
        KIND = kind;
    }
    int getCardNumber() {
        return CARD_NUMBER;
    }
    String getKind() {
        return KIND;
    }
    public String toString() {
        return "[" + KIND + " " + CARD_NUMBER + "]";
    }
}



public class Card {
    final String[] strings = {"Spade","Clover","Heart","Diamond"};
    CardNum [] cardarr = new CardNum[52];
    Card(){
        int count = 0;
        String str = null;
        for (int i = 0; i < 52; i++) {
            if(i%13 ==0){
                str = strings[count++];
            }
            cardarr[i] = new CardNum(i%13+1,str);
        }
    }
    public String toString(){
        String result = "";
        for (int i = 0; i < 52; i++) {
            result += cardarr[i].toString() + "\n";
        }
        return result;
    }
}
