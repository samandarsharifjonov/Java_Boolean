import java.util.Scanner;

public class bool12 {

    // STOPSHIP: 31/01/2023 Uchta A, B, C butun sonlar berilgan. Jumlani rostlikka tekshiring: “A, B, C sonlarning har biri musbat”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean bool = (a > 0 && b > 0 && c > 0);

        System.out.println(bool);


    }
}