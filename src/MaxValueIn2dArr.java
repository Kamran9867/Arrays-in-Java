public class MaxValueIn2dArr {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{21,21,50}};
        int maxValue = arr[0][0];

        for(int i=0; i< arr.length; i++){
            for(int j =0; j<=arr[i].length-1; j++){
                if(maxValue< arr[i][j]){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println(maxValue);

    }
}
