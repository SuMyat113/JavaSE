package With_IDE;

public class TwoDimensionalArray {
    public static void main(String[] args) {

    int a[][] = {
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {7, 8, 9, 1, 5, 7, 7},
    };
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.print(a[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
