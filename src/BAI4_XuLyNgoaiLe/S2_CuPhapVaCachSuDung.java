
package BAI4_XuLyNgoaiLe;

/**
 *
 * @author Admin
 */
public class S2_CuPhapVaCachSuDung {

    public static void main(String[] args) {
        Finally();
    }

    static void CuPhaTryCatch() {
        // try {
        // code co the nem ra ngoai le
        // } catch (Exception e) {
// code xu ly ngoai le
        // }
        try {
            int zero = 0, average = 10 / zero;
            System.out.println("Average" + average);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Thong bao loi: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Ket thuc duoc ham");
        ;
    }
    static void Finally() {
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
        }finally{
            System.out.println("chay vao finaly");
        }
        System.out.println("Phuong thuc chay den cuoi");
}
    static void LuuY(){
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
            //return;// Neu co dung return thif Finally van duoc thuc thi va cac doan code duoi cua Try se khong thuc thi
            System.exit(0);// khoi finally khong duoc thuc thi
        } catch (Exception exception) {
            System.out.println("Exception");
        }finally{
            System.out.println("chay vao finally");
        }
        System.out.println("chay den cuoi cung");
    }

}
