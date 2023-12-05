package Project1;

public class T9 {
    public static void main(String[] args) {
        int[] num={4,7,3,4,2,5,9,3};
        int max = num[0];
        int min =num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            else if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("maximum temperature is "+max);
        System.out.println("minimum temperature is "+min);
    }
}
