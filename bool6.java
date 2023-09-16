import java.util.Scanner;

public class bool6 {

    // STOPSHIP: 31/01/2023  Uchta A, B, C butun sonlar berilgan. Jumlani rostlikka tekshiring:
    //“A<= B <= C”

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean bool = a <= b && b <= c;

        System.out.println(bool);
        
        
        
    }

}
