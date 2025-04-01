package classStudy;

public class Hello {
    public static void main(String[] args) {
        // 11차원 배열 선언 (각 차원의 크기는 b)\
        int b = 10;
        int[][][][][][][][][][][] a = new int[b][b][b][b][b][b][b][b][b][b][b];

        // 배열에 값을 할당하는 11중 for문
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < b; k++) {
                    for (int l = 0; l < b; l++) {
                        for (int m = 0; m < b; m++) {
                            for (int n = 0; n < b; n++) {
                                for (int o = 0; o < b; o++) {
                                    for (int p = 0; p < b; p++) {
                                        for (int q = 0; q < b; q++) {
                                            for (int r = 0; r < b; r++) {
                                                for (int s = 0; s < b; s++) {
                                                    a[i][j][k][l][m][n][o][p][q][r][s] = b;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // 별도의 for문을 사용하여 출력하는 부분
        // 예제에서는 a[0][0][0][0][0][0][0][0][0][0][*] 슬라이스를 출력
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < b; k++) {
                    for (int l = 0; l < b; l++) {
                        for (int m = 0; m < b; m++) {
                            for (int n = 0; n < b; n++) {
                                for (int o = 0; o < b; o++) {
                                    for (int p = 0; p < b; p++) {
                                        for (int q = 0; q < b; q++) {
                                            for (int r = 0; r < b; r++) {
                                                for (int s = 0; s < b; s++) {
                                                    System.out.print(a[i][j][k][l][m][n][o][p][q][r][s]);
                                                }
                                                System.out.println();
                                            }
                                            System.out.println();
                                        }
                                        System.out.println();
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Hello2 {}
class Hello3 {}
