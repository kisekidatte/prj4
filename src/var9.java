import java.util.InputMismatchException;
import java.util.Scanner;

public class var9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        try{
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Fill in the array:");
            for(int i = 0;i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int inMin = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++){
                if(arr[i]<0){
                    count++;
                }
            }
            if (count != 0){
                for (int i = 0; i < arr.length; i++){
                    if(arr[i]< min){
                        inMin = i;
                        min = arr[i];
                    }
                }
                System.out.println("Min = " + min);
            }
            else{throw new RuntimeException("Нет отрицательных чисел.");}
        }
        catch (InputMismatchException im){
            System.out.println("Ввод строки вместо числа.");
        }
    }
}