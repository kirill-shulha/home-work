public class ArrayHW5_4 {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        int sum = 0;
        //Заполняем массив данными
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }
        //Считаем все элементы двумерного массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов двумерного массива = " + sum);
    }
}