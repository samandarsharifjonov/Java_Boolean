import java.util.Scanner;

public class bool38 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();

        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();

        int y2 = scanner.nextInt();
        boolean fil = ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2)));
        System.out.println(fil);
    }








}
