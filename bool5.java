import java.util.Scanner;

public class bool5 {

    public static void main(String[] args) {

        // STOPSHIP: 31/01/2023 kkita butun A va B sonlari berilgan. Jumlani rostlikka tekshiring:
        //“A >= 0 yoki B < -2”

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a = scanner.nextInt();

        System.out.println("");
        int b = scanner.nextInt();

        boolean bool = (a >= 0) || ( b < -2);
        System.out.println(bool);



    }


}