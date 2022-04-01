/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_XuLyNgoaiLe;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        HocSinhService hs = new HocSinhService();
        try {
            hs.checkTuoiLayVo(15);
        } catch (LayVoException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
