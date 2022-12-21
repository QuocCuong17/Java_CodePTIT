
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J03038_DanhDauChuCai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Set<String> se = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            se.add(s.charAt(i) + "@");
        }
        System.out.println(se.size());
    }
}
