import java.util.Scanner;

public class bool27 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextInt();
        float y = scanner.nextInt();


        boolean bool =  (x < 0 && y < 0) || ( y > 0 && y > 0);


        System.out.println(bool);

    }
}