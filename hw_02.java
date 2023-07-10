package seminar_1;
public class hw_02 {
    public static void main (String[] args){
        String[][]arr = {{3,4},{5,6},{3,5}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][]arr){
        int sum = 0;
        for (int i = 0;i<arr.length;i++) {
            for (int j=0;j<5;j++){ // array out of bounds
                int val = Integer.parseInt(arr[i][j]);// parsing error
                sum+=val;

    
            }
        }
        return sum;
    }

    }
    
}
