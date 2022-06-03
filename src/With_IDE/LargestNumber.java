package With_IDE;


public class LargestNumber {
    public static void main(String[] args) {
        int num[] = {23,24,12,78,62};
        int largest = 0;
        for (int i = 0; i < num.length; i++) {
            if (largest<num[i]){
                largest = num[i];
            }
            System.out.println();
        }
        System.out.println("largest Number is "+largest);
    }
}
