import java.util.Scanner;

public class bool11 {

    // STOPSHIP: 31/01/2023 .
    //Ikkita butun  A va B sonlari berilgan. Jumlani rostlikka tekshiring: “A va B sonlarining har ikkalasi ham yoki toq son yoki juft son”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        boolean bool = ( a % 2 == 0 && b % 2 == 0 ) || ( a % 2 != 0 && b % 2 != 0);

        System.out.println(bool);

    }

}