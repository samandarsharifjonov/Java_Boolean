import java.util.Scanner;

public class bool10 {

    // STOPSHIP: 31/01/2023 .
    // Ikkita butun  A va B sonlari berilgan. Jumlani rostlikka tekshiring: “A va B sonlarning faqat bittasi toq son”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean bool = a % 2 == 0 && b % 2 != 0 || a % 2 != 0 && b % 2 == 0;

        System.out.println(bool);

    }

}