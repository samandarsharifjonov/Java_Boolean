import java.util.Scanner;

public class bool34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();


        boolean bool =  ( x1 + y1) % 2 == 1;

        System.out.println(bool);

    }


}
