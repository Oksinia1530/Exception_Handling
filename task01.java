package seminar_1;
/*?????????? ?????, ??????????? ? ???????? ?????????
????????????? ??????.
???? ????? ??????? ?????? ?????????? ????????? ????????,
????? ?????????? -1, ? ???????? ???? ??????, ????? - ?????
???????. 
2. ???? ??????? ??????? ?? ??????, ????? ?????? -2 ? ???????? ???? ??????.
3. ???? ?????? ??????? ?????? null, ????? ?????? -3
4. ?????????? ???? ???????? ?????????????? ???????? ? ??????? ???????????????
???? ??????.

public class task01 {

    public static void main(String[] args) {
        int[] arr = {1,2,5,7};
        int min_length = 2;   
        System.out.println(checkArrayLength(arr,min_length));     
    }
    public static int checkArrayLength(int[] arr, int min_length){
        if (arr.length < min_length){
            return -1;
            } else{
                return arr.length;
            }
    }
}

*/



import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class task01 {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        int a=10, b=0;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-10);
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        FileInputStream fis = new FileInputStream("1.txt");
        fis.read();

        if(fis.available() > 0) throw new RuntimeException();
        int num = callMethod4("124O");
        return a/b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 1; i <= strings.length; i++){
            strings[i] = s;
        }
    }
}