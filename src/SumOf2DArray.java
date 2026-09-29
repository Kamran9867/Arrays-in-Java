public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] numArr= {{1,2,3},{1,2,3}};
        int sum=0;

        for(int i  =0;i< numArr.length; i++){
            for(int col=0;col<=numArr[i].length-1;col++){
                int value= numArr[i][col];
                sum+=value;
            }
        }
        System.out.println(sum);
    }
}
