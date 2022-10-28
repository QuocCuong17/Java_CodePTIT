
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class Main {
    public static void main(String[] args) {
        Matrix m = null;
        Xau x= null;
        HaiSoThuc hst=null;
        while (true) {   
            System.out.println("<---------MENU--------->"); 
            System.out.println("1. Nhap vao 1 xau");
            System.out.println("2. Kiem tra ma sinh vien");
            System.out.println("3. Tach cac tu trong xau");
            System.out.println("4. Chuan hoa doan van ban");
            System.out.println("5. Nhap vao ma tran chu nhat");
            System.out.println("6. Viet ra ma tran chuyen vi");
            System.out.println("7. Dua ra cac hang chi co cac so nguyen to");
            System.out.println("8. Nhap vao x va epsilon");
            System.out.println("9. Tinh gia tri bieu thuc da cho");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon tu (0-9): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    System.out.print("Nhap xau: ");
                    String s1=sc.nextLine();
                    x= new Xau(s1);
                    break;
                case 2:
                    System.out.print("Nhap xau: ");
                    String s2=sc.nextLine();
                    x= new Xau(s2);
                    x.KTMSV();
                    break;
                case 3:
                    System.out.print("Nhap xau: ");
                    String s3=sc.nextLine();
                    x= new Xau(s3);
                    x.TachTu();
                    break;
                case 4:
                    System.out.print("Nhap xau: ");
                    String s4=sc.nextLine();
                    x= new Xau(s4);
                    x.ChuanHoa();
                    break;
                case 5:
                    System.out.print("So hang: ");
                    int r=sc.nextInt();
                    System.out.print("So cot: ");
                    int c=sc.nextInt();
                    m = new Matrix(r,c);
                    m.input();
                    
                    break;
                case 6:
                    m.ChuyenVi();
                    break;
                case 7:m.HangNT();
                    break;
                case 8:
                    System.out.print("Nhap vap x: ");
//                    Double x1= Double.parseDouble(sc.nextLine());
                    Double x1=sc.nextDouble();
                    System.out.print("Nhap vao epsilon: ");
                    Double ep=sc.nextDouble();
                    hst=new HaiSoThuc(x1,ep);
                    break;
                case 9:
                    System.out.print("Gia tri bieu thuc la: ");
                    hst.KQCos();
                    break;
                case 0:
                    System.out.println("Bye, Hen gap lai ban sau!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban chi chon tu(0-9)");
                    break;
            }
        }
    }
}
