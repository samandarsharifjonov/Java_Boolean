

import java.util.Scanner;
        public class bool32 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                float a = scanner.nextFloat();

                float b = scanner.nextFloat();

                float c = scanner.nextFloat();
                System.out.println((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b));
            }


            }

