import java.util.Random;

public class temperature {
    public static void main(String[] args) {
        int temperature = new Random().nextInt(-20, 20);
        System.out.println(temperature);
        if (temperature > -5)
            System.out.println("Warm");
        if (temperature < -5 && temperature > -20)
            System.out.println("Normal");
        if (temperature > -20)
            System.out.println("Cold");

    }
}
