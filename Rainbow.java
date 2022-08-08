import java.util.Random;

public class Rainbow {
    public static void main(String[] args) {
        int randomValue = new Random().nextInt(7);

        System.out.println(++randomValue);
        switch (randomValue) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
        }
    }
}