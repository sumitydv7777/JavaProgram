package D_2;

import java.util.Scanner;

public class alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no rows");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
