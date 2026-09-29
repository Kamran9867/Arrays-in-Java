public class MaxValueInArray {
    public static void main(String[] args) {

        int[] arr= {3,2,-5,21,10};

        int max=arr[0];

        // compare maxValue ko array ke har elements ke sath
        for(int i =0; i<arr.length; i++){
            if(arr[i]> max){
                //update max
                max = arr[i];
            }
        }
        System.out.println("the maximum element in array is: "+ max);
    }
}
