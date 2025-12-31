package Module1;
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 array elements");

        int array[] = new int[5];
        for(int i = 0; i < 5 ; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < 5 ; i++){
            System.out.println("Array element is " + array[i]);
        }
        System.out.println("Reverse the array");
        for(int i = 4; i>=0; i--){
            System.out.println(array[i]);
        }

    }
}
