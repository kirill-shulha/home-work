import java.util.Scanner;

public class ArrayHW4_0 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size massive - 10");
        int N = in.nextInt();
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number in massive - 5");
            int a = in.nextInt();
            mass[i] = a;
        }
        int temp = 0;
        System.out.print("Enter number - 5");
        int m = in.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if (m == mass[i]) {
                temp = mass[i];
                break;
            }
        }
        System.out.print("Число вошедшее в массив - " + temp);

    }
}
