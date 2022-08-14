public class ArrayHW5_1 {
    public static void main(String[] args) {
        //3D Array
        int[][][] testArray = {{{1,2,3},{10,20,30}},{{500, 600}}};
        //цикл for...each проходит по элементам трехмерного массива
        for (int[][] arrayMiddle: testArray){
            for (int[]arrayInternal: arrayMiddle){
                for (int item: arrayInternal){
                    System.out.println(item+" ");
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}