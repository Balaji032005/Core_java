package ashokk;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the alpha value");
        long alpha = scan.nextLong();
        long beta = alpha;

        alpha+=15;
        System.out.println("alpha += value ="+alpha);
        beta -=5;
        System.out.println("beta -= value ="+beta);



    }
}
