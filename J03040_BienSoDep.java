/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J03040_BienSoDep {

    public static int Check(String s) {
        if (s.charAt(1) > s.charAt(0) && s.charAt(2) > s.charAt(1) && s.charAt(3) > s.charAt(2) && s.charAt(4) > s.charAt(3)) {
            return 1;
        }
        if (s.charAt(1) == s.charAt(0) && s.charAt(2) == s.charAt(1) && s.charAt(4) == s.charAt(3)) {
            return 1;
        }
        for (int i = 0; i < 5; i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') {
                return 0;
            }
        }
        return 1;
    }
}
