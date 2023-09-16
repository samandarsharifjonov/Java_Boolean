import java.util.Scanner;

public class bool17 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean bool = ( a > 99 && a <= 999 && a % 2 != 0 );
        System.out.println(bool);


    }
}