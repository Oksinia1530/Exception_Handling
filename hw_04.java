package seminar_1;

public class hw_04 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {2, 4, 6};
        
        int[] result = divArrays(array1, array2);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
    public static int[] divArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Array lengths are not equal");
        }
        
        int[] result = new int[array1.length];
        
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] / array2[i];
        }
        
        return result;
    }
}
