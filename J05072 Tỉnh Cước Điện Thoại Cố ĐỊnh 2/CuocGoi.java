/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05072;

/**
 *
 * @author Đặng Cường
 */
public class CuocGoi {

    private String thueBao, tStart, tEnd;
    private ThanhPho T;

    public CuocGoi(String thueBao, String tStart, String tEnd) {
        this.thueBao = thueBao;
        this.tStart = tStart;
        this.tEnd = tEnd;
    }
        
    public String getThueBao() {
        return thueBao;
    }
    
    public int getTG() {
        String a[]=tStart.split(":");
        String b[]=tEnd.split(":");
        if(thueBao.charAt(0)=='0'){
            return Integer.parseInt(b[0])*60+Integer.parseInt(b[1])-Integer.parseInt(a[0])*60-Integer.parseInt(a[1]);
        }
        else{
            return (int) Math.round((double)(Integer.parseInt(b[0])*60+Integer.parseInt(b[1])-Integer.parseInt(a[0])*60-Integer.parseInt(a[1]))/3);
        }
    }
    
    public int getTien() {
        int h=0;
        if(thueBao.charAt(0)=='0'){
            h+=getTG()*T.getGia();
        }
        else h+=getTG()*800;
        return h;
    }
    
    public String getMaCG() {
        String a = thueBao.substring(1,3);
        return a;
    }

    public void setThueBao(String thueBao) {
        this.thueBao = thueBao;
    }

    public String gettStart() {
        return tStart;
    }

    public void settStart(String tStart) {
        this.tStart = tStart;
    }

    public String gettEnd() {
        return tEnd;
    }

    public void settEnd(String tEnd) {
        this.tEnd = tEnd;
    }

    public ThanhPho getT() {
        return T;
    }

    public void setT(ThanhPho T) {
        this.T = T;
    }

}
