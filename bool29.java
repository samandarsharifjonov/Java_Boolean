import java.util.Scanner;

public class bool29 {

    public static void main(String[] args) {


    Scanner Scanner = new Scanner( System.in );

    int x = Scanner.nextInt();
    int y = Scanner.nextInt();
    int x1 = Scanner.nextInt();
    int y1 = Scanner.nextInt();
    int x2 = Scanner.nextInt();
    int y2 = Scanner.nextInt();

    boolean bool =  (x > x1 && x < x2) && (y < y1 && y > y2);
        System.out.println(bool);





}
}