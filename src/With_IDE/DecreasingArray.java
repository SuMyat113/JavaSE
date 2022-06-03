package With_IDE;

public class DecreasingArray {
    public static void main(String[] args) {
        int num[] = {5,4,1,8,9,6};
        int num1;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j <num.length ; j++) {
                if (num[i]>num[j]){
                    num1=num[i];
                    num[i]=num[j];
                    num[j]=num1;
                }

            }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }
}
