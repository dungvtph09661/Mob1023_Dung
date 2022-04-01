/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_XuLyNgoaiLe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class S3_ThrowVaThows {

    public static void main(String[] args) {
        kiemTraTuoiLayVo(17);
       // try {
       //     FileReader fileReader = new FileReader("");
       // } catch (FileNotFoundException fileNotFoundException) {
       // }
        try {
            methodlDungvt();
        } catch (IOException iOException) {
         
        }
    }

    static void kiemTraTuoiLayVo(int tuoi) {
        if (tuoi < 18) {
            throw new NumberFormatException("Ban chua du tuoi lay vo");
        } else {
            System.out.println("Ban da duoc phep lay vo");
        }
       
    }
    static void methodlDungvt() throws IOException{
        throw new IOException("loi roi");
    }
    
}
