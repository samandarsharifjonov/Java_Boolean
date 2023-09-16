import java.util.Scanner;

public class bool16 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean bool = ( a >= 10 && a <=99 && a % 2 == 0);

        System.out.println(bool);


    }
}