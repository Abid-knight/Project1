package Project1;

import java.util.Arrays;

public class T10 {
    public static void main(String[] args) {
String[] a={"A","B","C","D","E","F","A","B"};

        for (int i = 0; i < a.length; i++) {
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }

        }
    }
}
