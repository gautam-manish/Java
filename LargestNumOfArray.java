// Find the largest number from given array

import java.util.*;

public class LargestNumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp =0;
        for (int i =0; i<arr.length; i++){
            for (int j = 0; j<arr.length; j++){
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The largest number in a given array is "+ arr[size-1]);
    }
}
