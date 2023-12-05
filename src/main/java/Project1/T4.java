package Project1;

public class T4 {
    public static void main(String[] args) {
        int[][] numbers={
                {4,5,2,5,4,8},
                {7,8,3,0,6,},
                {5,7,3,2,7,-1},
        };
int sum1=0;
int sum2=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    sum1=sum1+numbers[i][j];

                }else if (numbers[i][j]%22!=0){
                    sum2=sum2+numbers[i][j];
                }
                
            }
        }
        System.out.println("sum of even numbers is "+sum1);
        System.out.println("sum of odd numbers is "+sum2);
        System.out.println(sum1+sum2);
    }
}
