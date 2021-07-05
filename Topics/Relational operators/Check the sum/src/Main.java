import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        boolean result = false;
        
        if (first + second == 20) {
            result = true;
        }
        if (first + third == 20) {
            result = true;
        }
        if (second + third == 20) {
            result = true;
        }
        
        System.out.println(result);
    }
}
