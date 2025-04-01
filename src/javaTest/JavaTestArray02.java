package javaTest;

public class JavaTestArray02 {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,2,5,1,2,3,2,5};
        int [] counting = new int[10];
        for(int i = 0;i < arr.length;i++){
            counting[arr[i]]++;
        }
        //중복 제거
        System.out.print("중복제거 : ");
        for(int i = 0;i < counting.length;i++){
            if(counting[i] > 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //정렬
        System.out.print("정렬 : ");
        for (int i = 0; i < counting.length; i++) {
            for (int j = 0; j < counting[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
