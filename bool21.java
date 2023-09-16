import java.util.Scanner;

public class bool21 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int r1 = a % 10;
        int r10 = a / 10 %10;
        int r100 = a/100;

        boolean bool = r100 < r10 && r10 < r1 || r1 < r10 && r10 < r100;


            // 123


        System.out.println(bool);


    }
}