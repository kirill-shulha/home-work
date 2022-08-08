import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int a = 1; a > 0; --a) {System.out.println("enter a positive number up to 100 and at least 1:");
            int x = scanner.nextInt();
            if (x>100 || x<=0){
                System.out.println("Range of numbers");
                ++a;

                break;
            }
        }
    }
}