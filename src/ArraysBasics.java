import java.util.Scanner;

public class ArraysBasics{
    public static void main(String[] args) {

//        // declaration
//        int arr[];
//        //allocation
//        arr = new int[5];
//        //initialisation
//        int[]brr = {1,2,3};
//        for(int index=0; index< brr.length; index++){
//            System.out.println(brr[index]);
//        }

//        int[] arr= new int [5];
//        Scanner input = new Scanner(System.in);
//
//        for(int index=0; index< arr.length; index++){
//            System.out.println(" enter the elements of array of index " + index+ " :");
//            arr[index] = input.nextInt();
//        }

        int []arr = {2,3,4};
        int sum=1;

        for(int i=0;i< arr.length; i++){
          int value=arr[i];
          sum*=value;

        }
        System.out.println(sum);
    }
}