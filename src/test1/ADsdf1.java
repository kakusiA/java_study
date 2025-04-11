package test1;

import java.util.Arrays;

public class ADsdf1 {

}
class Solution {
    public static void main(String[] args) {
        int s = solution(54321);
    }
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(int i = 0; i<str.length(); i ++){
            System.out.println(str.charAt(i));
            answer += (int)(str.charAt(i) -'0');
        }
        System.out.println(answer);
        return answer;
    }
}
class Solution1 {
    public static void main(String[] args) {
        int[] a = solution("hi12392");
        System.out.println(Arrays.toString(a));
    }
    public static int[] solution(String my_string) {
        int[]a = new int[10];
        int count = 0;
        for(int i  = 0; i<my_string.length(); i++){
            char ch = (char)my_string.charAt(i);
            if(ch >= '0' && ch<='9'){
                a[(int)(ch-'0')] ++;
                count ++;
            }
        }
        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i<10; i++){
            if(a[i] == 0) continue;
            else {
                for(int j = 0; j < a[i]; j++){
                    answer[count] = i;
                    count ++;
                }
            }
        }
        return answer;
    }
}