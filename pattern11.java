package Pattern;

public class pattern11 {
    public static void main(String[] args) {
        // int n = 15;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 && j > 0 && j < (n - 1) / 2 || j == 0 && i > 0 || i == n - 1 && j
        // < (n - 1) / 4 // G
        // || j == (n - 1) / 4 && i > (n - 1) / 2
        // || i == (n - 1) / 2 && j > (n - 1) / 4 && j < (n - 1) / 2
        // || j == (n - 1) / 2 && i > (n - 1) / 2
        // || j == (n - 1) / 2 && i < (n - 1) / 4) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i - j == 0 && i <= (n - 1) / 2 || i + j == n - 1) { //Y
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) /
        // 2
        // || j == (n - 1) / 2 && i < (n - 1) / 2 && i > 0
        // || j == (n - 1) / 2 && i > (n - 1) / 2 && i < (n - 1) || i == n - 1 && j < (n
        // - 1) / 2) {// B
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j == 0 || i == 0 && j <= (n - 1) / 2 || i == (n - 1) / 2 && j <= (n - 1)
        // / 2
        // || i == n - 1 && j <= (n - 1) / 2) {// E
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j == 0 || i == 0 && j <= (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) /
        // 2) {// F
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1) / 2 || j - i == (n - 1) / 2 || i == (n - 1) / 2) {//
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
