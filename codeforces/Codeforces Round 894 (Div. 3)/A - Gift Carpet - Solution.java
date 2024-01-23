import java.util.Scanner;
 
public class GiftCarpet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            char[][] carpet = new char[n][m];
            for (int j = 0; j < n; j++) {
                String line = scanner.nextLine();
                for (int k = 0; k < m; k++) {
                    carpet[j][k] = line.charAt(k);
                }
            }
            
            char[] target = {'v', 'i', 'k', 'a'};
            boolean found = checkCarpet(carpet, target);
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean checkCarpet(char[][] carpet, char[] target) {
        int targetPos = 0;
        boolean columnContainsLetters = false;
        for (int col = 0; col < carpet[0].length; col++) {
            for (int row = 0; row < carpet.length; row++) {
                if (carpet[row][col] == target[targetPos]) {
                    targetPos++;
                    break;
                }
            }
            if(targetPos == target.length) return true;
        }
        return false;
    }
}