import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int t = scanner.nextInt(); // number of test cases
 
        while (t-- > 0) {
            int n = scanner.nextInt(); // length of x
            int m = scanner.nextInt(); // length of s
 
            scanner.nextLine(); // consume the newline character
 
            String x = scanner.nextLine();
            String s = scanner.nextLine();
 
            int result = minOperations(x, s);
            System.out.println(result);
        }
    }
    private static int minOperations(String x, String s) {
        int result = -1;
        StringBuilder current = new StringBuilder(x);
        int operations = 0;
 
        while (current.length() < s.length()) {
            current.append(current);
            operations++;
        }
 
        if (current.toString().contains(s)) {
            result = operations;
        } else {
            current.append(current);
            operations++;
            if (current.toString().contains(s)) {
                result = operations;
            }
        }
        return result;
    }
}