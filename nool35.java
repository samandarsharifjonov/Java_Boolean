import java.util.Scanner;

public class nool35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();

        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();

        int y2 = scanner.nextInt();
        boolean birXil = (((x1 + y1) % 2 == 1) && ((x2 + y2) % 2 == 1)) || (((x1 + y1) % 2 == 0) && ((x2 + y2) % 2 == 0));
        System.out.println(birXil);
    }
}
