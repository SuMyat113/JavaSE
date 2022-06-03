package With_IDE;

public class DuplicateArray {
    public static void main(String[] args) {
        int num[] = {1,3,4,5,2,6,7,3,4,5};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                    if(num[i]==num[j]){
                        System.out.println(num[j]);
                    }
            }
        }
    }
}
