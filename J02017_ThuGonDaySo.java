
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int i = 0;
        while(i < list.size()-1){
            if((list.get(i) + list.get(i+1)) % 2 == 0){
                list.remove(i+1);
                list.remove(i);
                i-=2;
            }
            i++;
            if(i < 0) i = 0;
        }
        System.out.println(list.size());
    }
}
