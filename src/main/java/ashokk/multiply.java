package ashokk;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the alpha value");
        int alpha = scan.nextInt();
        System.out.println("enter the beta value");
        int beta = scan.nextInt();
        int result = alpha * beta;
        System.out.println("Result" +result);

    }

}
