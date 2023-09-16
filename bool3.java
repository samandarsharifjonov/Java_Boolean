import java.util.Scanner;

public class bool3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean bool = (a % 2 == 0 && a != 0);

        System.out.println(bool);

    }

}



