package With_IDE;

public class OutputNumber {
    public static void main(String[] args) {
        int i,j;
        int a=6;
        for (i = 1; i <= a; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}
