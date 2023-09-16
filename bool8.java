import java.util.Scanner;

public class bool8 {

    // STOPSHIP: 31/01/2023  Ikkita butun A va B sonlari berilgan. Jumlani rostlikka tekshiring: “A va B sonlari toq sonlar”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean bool = a % 2 != 0 && b % 2 !=0 ;
        System.out.println(bool);

    }

    }