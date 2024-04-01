import java.util.*;

public class TakingSizeOfArrayFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of an array");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter "+num+" number");
        int sum =0;
        for (int i=0; i<a.length; i++ ){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum is "+ sum);
    }
}
