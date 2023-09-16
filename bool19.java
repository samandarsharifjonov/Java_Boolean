import java.util.Scanner;

public class bool19 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean bool = ( a == -b || b == -c || c == -a);

        System.out.println(bool);


    }
}