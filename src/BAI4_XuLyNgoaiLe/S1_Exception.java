package BAI4_XuLyNgoaiLe;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Admin
 */
public class S1_Exception {

    public static void main(String[] args) {
        Exception1();
        Exception2();
        UncheckedExcep();
        CheckedExcep();
    }

    static void Exception1() {
        int zero = 0, average = 10 / zero;
        System.out.println("Average" + average);
    }

    static void Exception2() {
        int a = Integer.parseInt("Dung");
        System.out.println(a);
    }

    static void UncheckedExcep() {
        String temp = null;
        System.out.println(temp.length());
    }

    static void CheckedExcep() {
        // FileReader f = new FileReader("File khong ton tai")
    }

    static void MotVaiViDu() {
        int a = 10 / 0;
        String temp = null;
        System.out.println(temp.length());
        int b = Integer.parseInt("Dung");
        int arr[] = new int[6];
        arr[6] = 50;
    }

    static void TryCatchNhieuCatch() {
        String[] arr = {"1", "a", null};
        try {
            int a = Integer.parseInt(arr[0]);
            String temp = null;
            System.out.println(temp.length());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NullPointerException nullPointerException) {
            System.out.println("NullPointerException");
        } catch (Exception exception) {
            System.out.println("Exception");
        }
    }
}
