import java.util.Arrays;

public class ArrayHW4_1 {
        public static int[] remove(int[] a, int key)
        {
            return Arrays.stream(a)    // IntStream
                    .filter(val -> val != key)
                    .toArray();
        }

        public static void main(String[] args)
        {
            int[] a = { 1, 2, 3, 2, 4, 2, 4, 5 };
            int key = 2;

            a = remove(a, key);
            System.out.println(Arrays.toString(a));
        }
    }
