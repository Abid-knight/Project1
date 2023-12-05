package Project1;

public class T3 {
    public static void main(String[] args) {
        int[][] numbers={
                {4,5,2,5,4,8},
                {7,8,3,0,6,},
                {5,7,3,2,7,-1},
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();

        }
    }
}
