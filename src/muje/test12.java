package muje;

public class test12 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int[] total_sum = new int[10];
        int tt_sum = 0;
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 81 + (int) (Math.random() * 20);
            }
        }
        for (int i = 0; i <a.length; i++) {
            System.out.println("학생" + (i+1)+  "의 성적 = " + (i+1));
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            total_sum[i] = sum;
            tt_sum += sum;
        }
        for (int i = 0; i < total_sum.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수는 = " + total_sum[i]);
            System.out.println("학생" + (i + 1) + "의 평균은 = " + total_sum[i] / (float)a.length);
        }
        System.out.println("전체 학생의 평균은 = "+ tt_sum/100.0);
    }
}
