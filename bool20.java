import java.util.Scanner;

public class bool20 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int r1, r10, r100;

        r1 = n % 10;
        r10 = n % 10 / 10;
        r100 = n / 100;

        boolean bool = r1 != r10 && r10 != r100 && r100 != r1;

        System.out.println(bool);



    }
}
