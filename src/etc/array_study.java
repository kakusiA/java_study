package etc;

//배열 연습
public class array_study {
    public static void main(String[] args) {
        //배열 선언1
        int a[] = new int[5];
        //벼열 선언2
        int[]  b;
        b = new int [4];
        //배열 값추가1
        int [] z = new int []{1,2,3,4,5};
        //배열값추가2
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        a[2] = 100;
        System.out.println(a[2]);
        //2차원 배열
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i+j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int score[][]= {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
        };
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j]*10 + " ");
            }
            System.out.println();
        }
        //가변 배열
        int[][]a2 = new int[5][];
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                a2[i] = new int[5];
            }
            else{
                a2[i] = new int[]{1,2,3};
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
        //배열 카피
        int q1[] = {1,2,3,4,5};
        int q2[] = new int[5];
        //q1배열에 0번째 값읋 q2에 0번쨰 값으로 q1의 길이만큼 복사
        System.arraycopy(q1,0,q2,0,q1.length);
        for(int i=0;i<q2.length;i++){
            System.out.println(q2[i]+" ");
        }

    }
}
