package seminar_1;

public class hw_03 {
    public int[] subArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Array lengths are not equal");
            return null;
        }
        
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        
        return result;
    }
}
