
public class ForEachLoop {
    public static void main(String[] args) {
        int arr [] = {5, 10, 20, 50, 100, 200};
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("Sum is "+ sum);
    }
}
