import java.util.Scanner;

public class bool26 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();


        boolean bool = (x < 0 && y < 0) || ( y > 0 && y > 0);


        System.out.println(bool);

    }
}