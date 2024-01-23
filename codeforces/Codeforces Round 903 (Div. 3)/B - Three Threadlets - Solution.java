import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int t = scanner.nextInt(); // Number of test cases
 
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int min, mid, max;
 
            // Find minimum, middle, and maximum values without using Math functions
            if (a <= b && a <= c) {
                min = a;
                if (b <= c) {
                    mid = b;
                    max = c;
                } else {
                    mid = c;
                    max = b;
                }
            } else if (b <= a && b <= c) {
                min = b;
                if (a <= c) {
                    mid = a;
                    max = c;
                } else {
                    mid = c;
                    max = a;
                }
            } else {
                min = c;
                if (a <= b) {
                    mid = a;
                    max = b;
                } else {
                    mid = b;
                    max = a;
                }
            }
 
            if (mid % min == 0 && max % min == 0) {
                if(((mid / min) - 1) + ((max / min) - 1) <= 3){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}