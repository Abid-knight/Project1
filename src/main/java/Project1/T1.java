package Project1;

public class T1 {
    public static void main(String[] args) {

        int[] temp={45,56,23,11,45,64,21};
        int max = temp[0];
        int min = temp[0];

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
            else if (temp[i] < min) {
                min = temp[i];
            }
        }

        System.out.println("maximum temperature is "+max);
        System.out.println("minimum temperature is "+min);

    }
}
