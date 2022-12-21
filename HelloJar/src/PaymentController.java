/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import view.*;
import vn.edu.ptit.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Đặng Cường
 */
public class PaymentController {
    private Invoice in = null; 
    Scanner sc= new Scanner(System.in);

    public PaymentController() {
    }
    
    public Invoice getInvoice()
    {   Student st = new Student(sc.nextLine(),sc.nextLine());
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> sbj= new ArrayList<>();
        for(int i = 0 ; i < t; i++)
        {
            Subject s = new Subject(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            String ss = s.getCode();
            String sss = s.getName();
            s.setName(ss);
            s.setCode(sss);
            sbj.add(s);
            //System.out.println(sbj.get(i).getCode());
            
        }
          Rule r = new Rule(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()));
          in = new Invoice(r);
          in.setSt(st);
          in.setAlSubject(sbj);
          t =0;
          for(int i = 0; i < sbj.size(); i++)
          {
              t += sbj.get(i).getCredit();
          }
          in.setAmount(t * r.getCreditPrice());
        return in;
    }
    
}
