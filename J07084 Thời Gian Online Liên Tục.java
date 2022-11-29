
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Main {
    private String hoTen;
    private long time;
    private Date ThoiGianBD,ThoiGianKT;

    public Main(String hoTen, Date ThoiGianBD, Date ThoiGianKT) {
        this.hoTen = hoTen;
        this.ThoiGianBD = ThoiGianBD;
        this.ThoiGianKT = ThoiGianKT;
        time=(ThoiGianKT.getTime()-ThoiGianBD.getTime())/(1000*60);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Date ThoiGianBD) {
        this.ThoiGianBD = ThoiGianBD;
    }

    public Date getThoiGianKT() {
        return ThoiGianKT;
    }

    public void setThoiGianKT(Date ThoiGianKT) {
        this.ThoiGianKT = ThoiGianKT;
    }
    public static void main(String[] args) throws FileNotFoundException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );
        Scanner sc = new Scanner(new File("ONLINE.in"));
        try {
            List<Main> list = new ArrayList<>();
            
            int n=Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                String ten=sc.nextLine();
                String ngay1=sc.nextLine();
                String ngay2=sc.nextLine();
                Date d1 = df.parse(ngay1);
                Date d2 = df.parse(ngay2);
                list.add(new Main(ten, d1, d2));
            }
            Collections.sort(list,new Comparator<Main>(){
                @Override
                public int compare(Main o1, Main o2) {
                    if(o1.time > o2.time){
                        return -1;
                    }
                    else if(o1.time < o2.time){
                        return 1;
                    }
                    else return  o1.getHoTen().compareTo(o2.getHoTen());
                }
                
            });
            for(Main x : list){
                System.out.println(x.getHoTen()+" "+x.time);
            }
        } catch (Exception e) {
        }
    }
}
//3
//Do Viet Anh
//11/12/2021 16:35:00
//11/12/2021 17:35:00
//Le Tuan Anh
//11/12/2021 16:45:00
//11/12/2021 18:15:00
//Nguyen Tuan Anh
//11/12/2021 17:00:00
//11/12/2021 19:15:00