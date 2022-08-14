public class ChessBoard {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];

        for (int i = 0; i < arr.length;i++) {
            for (int y = 0; y < arr[i].length;y++) {
               // arr[i][y] = y;
                if ((i+y)%2==0){arr[i][y] = "B";}
                else {arr[i][y] = "W";}



                System.out.print(arr[i][y]+" ");
            }
            System.out.println();
        }
    }
}
