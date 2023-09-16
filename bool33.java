
import java.util.Scanner;
public class bool33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean bool = ( a + b > c && b + c > a && c + a > b);
        System.out.println(bool);



    }

}