import java.util.*;

public class InputInArray {
    public static void main(String[] args) {
        int a [] = new int [5];
        int sum = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any 5 numbers");
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum is " + sum);
    }
}
