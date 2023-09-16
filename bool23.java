
import java.util.Scanner;

public class bool23 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        int r1 = a % 10;
        int r10 = a / 10 % 10;
        int r100 = a / 100;

        boolean bool = ( r1 == r100);
        System.out.println(bool);

    }
}