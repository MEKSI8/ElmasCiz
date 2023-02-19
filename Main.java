import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();



        for (int i = 0; i <= n ; i++) {
            int boslukSay=n-i;

            System.out.println(" ".repeat(boslukSay)+"*".repeat((2*n+1)-(2*boslukSay))+" ".repeat(boslukSay));
        }
        for (int i = n-1; i >= 0 ; i--) {
            int boslukSay=n-i;

            System.out.println(" ".repeat(boslukSay)+"*".repeat((2*n+1)-(2*boslukSay))+" ".repeat(boslukSay));
        }

    }
}