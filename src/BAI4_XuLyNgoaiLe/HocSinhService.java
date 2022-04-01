/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_XuLyNgoaiLe;

/**
 *
 * @author Admin
 */
public class HocSinhService {
   public void checkTuoiLayVo(int tuoi) throws LayVoException{
       if (tuoi<18) {
           throw new LayVoException("Ban chua du tuoi lay vo");
       } else {
           System.out.println("Ban da du tuoi lay vo");
       }
   }
}
