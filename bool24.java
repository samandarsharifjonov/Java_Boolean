import java.util.Scanner;

public class bool24 {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            float d = b * b - 4 * a * c;
            System.out.println(d >=0);
        }
}
