public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr= {3,2,-5,21,10};

        int min=arr[0];

        // compare maxValue ko array ke har elements ke sath
        for(int i =0; i<arr.length; i++){
            if(arr[i]< min){
                //update max
                min = arr[i];
            }
        }
        System.out.println("the minimum element in array is: "+ min);
    }
}
