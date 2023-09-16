import java.util.Scanner;

public class bool4 {

    public static void main(String[] args) {

        // STOPSHIP: 31/01/2023  Ikkita butun A va B sonlari berilgan. Jumlani rostlikka tekshiring: “A>2 va B<=3” 

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a = scanner.nextInt();

        System.out.println("");
        int b = scanner.nextInt();

        boolean bool = (a > 2) && ( b <= 3);
        System.out.println(bool);



    }


}
