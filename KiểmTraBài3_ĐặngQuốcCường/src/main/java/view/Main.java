/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import controller.*;
import java.io.*;
import java.io.Serializable;
import java.util.stream.Collectors;
/**
 *
 * @author Đặng Cường
 */
public class Main extends javax.swing.JFrame{

    private List<CauThu> listCT;
    private List<ViTri> listVT;
    private List<BangPhanCong> listBPC;
    private DefaultTableModel tmCT,tmVT,tmBPC,tmTimKiem;
    private String fCT,fVT,fBPC;
    
    public Main() {
        initComponents();
        fCT="src/main/java/controller/CT.DAT";
        fVT="src/main/java/controller/VT.DAT";
        fBPC="src/main/java/controller/BPC.DAT";
        if(new File(fCT).exists()){
            listCT= IOFile.read(fCT);
        }
        else listCT= new ArrayList<>();
        
        if(new File(fVT).exists()){
            listVT= IOFile.read(fVT);
        }
        else listVT= new ArrayList<>();
        
        if(new File(fBPC).exists()){
            listBPC= IOFile.read(fBPC);
        }
        else listBPC= new ArrayList<>();
        
        tmCT= (DefaultTableModel) tbCT.getModel();
        tmVT= (DefaultTableModel) tbVT.getModel();
        tmBPC= (DefaultTableModel) tbBPC.getModel();
       // tmTimKiem = (DefaultTableModel) tbSearch.getModel();
        docCT();
        docVT();
        docBPC();
        setButtonCT(true);
        setButtonVT(true);
        
        eventCT();
        eventVT();
        eventBPC();
        thongkeBT.addActionListener(e -> {
            Map<String,Integer> sum = listBPC.stream().collect(
                    Collectors.groupingBy(BangPhanCong::vietTK,Collectors.summingInt(BangPhanCong::getThuNhap)));
            thongTxt.setText(sum.toString());
        });
//        seachQL.addActionListener(e->{
//            tmTimKiem.setRowCount(0);
//            String s = search.getText();
//            for(BangChamCong i : listBCC){
//                if(i.getCongNhan().getHoTen().contains(s) || i.getXuong().getTen().contains(s))
//                tmTimKiem.addRow(i.toObject());
//               
//            }
//        });
    }
    public boolean check(BangPhanCong a){
        for(BangPhanCong i : listBPC){
            if (i.getCauThu().getMa() == a.getCauThu().getMa() 
                    && i.getViTri().getMa() == a.getViTri().getMa()) return false;
        }
        return true;
    }
    private void docCT(){
        tmCT.setRowCount(0);
        for(CauThu i : listCT){
            tmCT.addRow(i.toObject());
        }
    }
    private void docBPC(){
        tmBPC.setRowCount(0);
        for(BangPhanCong i : listBPC){
            tmBPC.addRow(i.toObject());
        }
    }
    private void docVT(){
        tmVT.setRowCount(0);
        for(ViTri i : listVT){
            tmVT.addRow(i.toObject());
        }
    }
    
    private void setButtonCT(boolean b){
        themCTBT.setEnabled(b);
        cnCTBT.setEnabled(!b);
        bqCTBT.setEnabled(!b);
    }
    
    private void setButtonVT(boolean b){
        themVT.setEnabled(b);
        cnVT.setEnabled(!b);
        bqVT.setEnabled(!b);
    }
    
    
    private void eventCT(){
        themCTBT.addActionListener(e ->{
            maCT.setText(100+listCT.size()+"");
            tenCT.requestFocus();
            setButtonCT(false);
        });
        cnCTBT.addActionListener(e ->{
            try{
                if(!luongCT.getText().matches("\\d+")){
                    throw new ValidException("Muc luong nhap so");
                }
                if(!tuoiCT.getText().matches("\\d+")){
                    throw new ValidException("Tuoi nhap so");
                }
                CauThu c = new CauThu(Integer.parseInt(maCT.getText()),tenCT.getText(), tuoiCT.getText(),
                        bcCT.getSelectedItem().toString(),Integer.parseInt(luongCT.getText()));
                listCT.add(c);
                tmCT.addRow(c.toObject());
                setButtonCT(true);
            }catch(ValidException ex){
                JOptionPane.showMessageDialog(this,ex);
                luongCT.setText("");
                luongCT.requestFocus();
            }
            
        });
        suaCTBT.addActionListener(e ->{
            int row=tbCT.getSelectedRow();
            if(row>=0 && row <tbCT.getRowCount()){
               CauThu c = new CauThu(Integer.parseInt(maCT.getText()),tenCT.getText(), tuoiCT.getText(),
                        bcCT.getSelectedItem().toString(),Integer.parseInt(luongCT.getText()));
                listCT.set(row, c);
                tmCT.removeRow(row);
                tmCT.insertRow(row, c.toObject());
            }
            else {
                JOptionPane.showMessageDialog(this,"Chon dong de sua");
            }
        });
        luuCTBT.addActionListener(e ->{
            IOFile.write(fCT, listCT);
        });
        bqCTBT.addActionListener(e ->{
            setButtonCT(true);
        });
    }
    
    private void eventVT(){
        themVT.addActionListener(e ->{
            
            maVT.setText(100+listVT.size()+"");
            tenVT.requestFocus();
            setButtonVT(false);
        });
        cnVT.addActionListener(e ->{
            try{
                if(!hsVT.getText().matches("\\d+")){
                    throw new ValidException("He so nhap so");
                }
                ViTri x = new ViTri(Integer.parseInt(maVT.getText()),tenVT.getText(),
                        Integer.parseInt(hsVT.getText()));
                listVT.add(x);
                tmVT.addRow(x.toObject());
                setButtonVT(true);
            }catch(ValidException ex){
                JOptionPane.showMessageDialog(this,ex);
                hsVT.setText("");
                hsVT.requestFocus();
            }
        });
        xoaVT.addActionListener(e ->{
            
            
            int row=tbVT.getSelectedRow();
            if(row>=0 && row <tbVT.getRowCount()){
                listVT.remove(row);
                tmVT.removeRow(row);
            }
            else {
                JOptionPane.showMessageDialog(this,"Chon dong de xoa");
            }
        });
        luuVT.addActionListener(e ->{
            IOFile.write(fVT, listVT);
        });
        bqVT.addActionListener(e ->{
            setButtonVT(true);
        });
    }
    private int getSoNgay(int maCN){
        int so=0;
        for(BangPhanCong i : listBPC){
            if(i.getCauThu().getMa()==maCN){
                so+=1;
            }
        }
        return so;
    }
    private CauThu getCauThu(int ma){
        for(CauThu i : listCT){
            if(i.getMa()==ma){
                return i;
            }
        }
        return null;
    }
    private ViTri getViTri(int ma){
        for(ViTri i : listVT){
            if(i.getMa()==ma){
                return i;
            }
        }
        return null;
    }
    
    private void eventBPC(){
        lamtuoiBT.addActionListener(e ->{
            maCTCB.removeAllItems();
            for(CauThu i: listCT){
                maCTCB.addItem(i.getMa()+"");
            }
            maVTCB.removeAllItems();
            for(ViTri i: listVT){
                maVTCB.addItem(i.getMa()+"");
            }
        });
        themBCC.addActionListener(e ->{
            try{
                if(!ngayChoi.getText().matches("^\\d{1,2}/\\d{1,2}/\\d{4}")){
                    throw new ValidException("Nhap ngay khong hop le");
                }
                
                int maCT = Integer.parseInt(maCTCB.getSelectedItem().toString());
                int maVT = Integer.parseInt(maVTCB.getSelectedItem().toString());
                String ngaychoi = ngayChoi.getText();           
                
                    BangPhanCong tmp = new BangPhanCong(getCauThu(maCT), getViTri(maVT),ngaychoi);
                    if(!check(tmp)){
                        JOptionPane.showMessageDialog(this,"Mot cau thu khong the xuat hien 2 lan trong bang ma choi cung ngay!");
                    }else{
                        listBPC.add(tmp);
                        tmBPC.addRow(tmp.toObject());

                    }
            }catch(ValidException ex){
                JOptionPane.showMessageDialog(this, ex);
                ngayChoi.setText("");
                ngayChoi.requestFocus();
            }
        });
        
        luuBCB.addActionListener(e->{
            IOFile.write(fBPC, listBPC);
        });
        sxBT.addActionListener(e->{
            int index = sxCB.getSelectedIndex();
            if(index == 0){
                listBPC.sort(new Comparator<BangPhanCong>(){
                    @Override
                    public int compare(BangPhanCong o1, BangPhanCong o2) {
                        String [] t1=o1.getCauThu().getHoTen().split("\\s+");
                        String [] t2=o2.getCauThu().getHoTen().split("\\s+");
                        String ten1=t1[t1.length-1]+o1;
                        String ten2=t2[t2.length-1]+o2;
                        return ten1.compareTo(ten2);
                    }
                    
                });
            }
            if(index==1){
               listBPC.sort(new Comparator<BangPhanCong>(){
                    @Override
                    public int compare(BangPhanCong o1, BangPhanCong o2) {
                        return o1.getCauThu().getMucLuong()-o2.getCauThu().getMucLuong();
                    }
                    
                }); 
            }
            tmBPC.setRowCount(0);
            for(BangPhanCong i : listBPC){
                tmBPC.addRow(i.toObject());
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCT = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maCT = new javax.swing.JTextField();
        tenCT = new javax.swing.JTextField();
        tuoiCT = new javax.swing.JTextField();
        luongCT = new javax.swing.JTextField();
        bcCT = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        themCTBT = new javax.swing.JButton();
        cnCTBT = new javax.swing.JButton();
        bqCTBT = new javax.swing.JButton();
        suaCTBT = new javax.swing.JButton();
        luuCTBT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVT = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        maVT = new javax.swing.JTextField();
        tenVT = new javax.swing.JTextField();
        hsVT = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        themVT = new javax.swing.JButton();
        cnVT = new javax.swing.JButton();
        bqVT = new javax.swing.JButton();
        xoaVT = new javax.swing.JButton();
        luuVT = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBPC = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        maVTCB = new javax.swing.JComboBox<>();
        maCTCB = new javax.swing.JComboBox<>();
        ngayChoi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        sxCB = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        themBCC = new javax.swing.JButton();
        luuBCB = new javax.swing.JButton();
        sxBT = new javax.swing.JButton();
        lamtuoiBT = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        thongTxt = new javax.swing.JTextArea();
        thongkeBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ma cau thu", "Ho Va Ten", "Tuoi", "Bang Cap", "Muc luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCT);

        jLabel1.setText("Ma");

        jLabel2.setText("Ho Va Ten");

        jLabel3.setText("Tuoi");

        jLabel4.setText("Bang cap");

        jLabel5.setText("Muc luong");

        maCT.setEditable(false);
        maCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maCTActionPerformed(evt);
            }
        });

        bcCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "đại học", "cao đẳng ", "sơ cấp" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tenCT, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(tuoiCT)
                            .addComponent(maCT, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(bcCT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(luongCT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tenCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tuoiCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bcCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(luongCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        themCTBT.setText("Them Moi");

        cnCTBT.setText("Cap Nhat");

        bqCTBT.setText("Bo Qua");

        suaCTBT.setText("Sua");

        luuCTBT.setText("Luu file");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(themCTBT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaCTBT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luuCTBT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bqCTBT, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnCTBT))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themCTBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnCTBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bqCTBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suaCTBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luuCTBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cau Thu", jPanel1);

        tbVT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ma", "Ten vi tri", "He So Thuong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVT);

        jLabel11.setText("Ma");

        jLabel12.setText("Ten Vi tri");

        jLabel15.setText("He so thuong");

        maVT.setEditable(false);
        maVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maVTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenVT, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(maVT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hsVT))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(maVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tenVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(hsVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        themVT.setText("Them Moi");

        cnVT.setText("Cap Nhat");

        bqVT.setText("Bo Qua");

        xoaVT.setText("Xoa");

        luuVT.setText("Luu file");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(themVT, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(cnVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bqVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(luuVT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themVT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnVT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bqVT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xoaVT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luuVT)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vi Tri", jPanel2);

        tbBPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã cầu thủ", "Họ tên cầu thủ", "Mức lương", "Mã vị trí", "Ngày chơi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbBPC);

        jLabel13.setText("Mã cầu thủ");

        jLabel14.setText("Mã vị trí");

        jLabel16.setText("Ngày chơi");

        maVTCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        maCTCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ngayChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayChoiActionPerformed(evt);
            }
        });

        jLabel17.setText("Sắp xếp");

        sxCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên cầu thủ", "Mức lương cầu thủ" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sxCB, 0, 0, Short.MAX_VALUE)
                            .addComponent(ngayChoi, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maVTCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maCTCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(maVTCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(maCTCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(ngayChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(sxCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        themBCC.setText("Them moi");

        luuBCB.setText("Luu file");

        sxBT.setText("Sap xep");

        lamtuoiBT.setText("Lam tuoi 2 ma");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lamtuoiBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(luuBCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themBCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sxBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themBCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lamtuoiBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(luuBCB)
                .addGap(12, 12, 12)
                .addComponent(sxBT)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bang Phan Cong", jPanel3);

        thongTxt.setEditable(false);
        thongTxt.setColumns(20);
        thongTxt.setRows(5);
        jScrollPane4.setViewportView(thongTxt);

        thongkeBT.setText("Thong ke thu nhap");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(thongkeBT)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(thongkeBT)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong ke", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maCTActionPerformed

    private void maVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maVTActionPerformed

    private void tbVTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVTMouseClicked
        // TODO add your handling code here:
//        int row = tbVT.getSelectedRow();
//        if(row >=0 && row <tbVT.getRowCount()){
//            maVT.setText(tmXuong.getValueAt(row, 0).toString());
//            tenVT.setText(tmXuong.getValueAt(row, 1).toString());
//            for(int i=0;i<hesoXuong.getItemCount();i++){
//                if(hesoXuong.getItemAt(i).equals(tmXuong.getValueAt(row,2).toString())){
//                    hesoXuong.setSelectedIndex(i);
//                }
//            }
//        }
    }//GEN-LAST:event_tbVTMouseClicked

    private void ngayChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayChoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayChoiActionPerformed

    private void tbCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCTMouseClicked
        int row = tbCT.getSelectedRow();
        if(row >=0 && row <tbCT.getRowCount()){
            maCT.setText(tmCT.getValueAt(row, 0).toString());
            tenCT.setText(tmCT.getValueAt(row, 1).toString());
            tuoiCT.setText(tmCT.getValueAt(row, 2).toString());
            
            for(int i=0;i<bcCT.getItemCount();i++){
                if(bcCT.getItemAt(i).equals(tmCT.getValueAt(row,3).toString())){
                    bcCT.setSelectedIndex(i);
                }
            }
            luongCT.setText(tmCT.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_tbCTMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bcCT;
    private javax.swing.JButton bqCTBT;
    private javax.swing.JButton bqVT;
    private javax.swing.JButton cnCTBT;
    private javax.swing.JButton cnVT;
    private javax.swing.JTextField hsVT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton lamtuoiBT;
    private javax.swing.JTextField luongCT;
    private javax.swing.JButton luuBCB;
    private javax.swing.JButton luuCTBT;
    private javax.swing.JButton luuVT;
    private javax.swing.JTextField maCT;
    private javax.swing.JComboBox<String> maCTCB;
    private javax.swing.JTextField maVT;
    private javax.swing.JComboBox<String> maVTCB;
    private javax.swing.JTextField ngayChoi;
    private javax.swing.JButton suaCTBT;
    private javax.swing.JButton sxBT;
    private javax.swing.JComboBox<String> sxCB;
    private javax.swing.JTable tbBPC;
    private javax.swing.JTable tbCT;
    private javax.swing.JTable tbVT;
    private javax.swing.JTextField tenCT;
    private javax.swing.JTextField tenVT;
    private javax.swing.JButton themBCC;
    private javax.swing.JButton themCTBT;
    private javax.swing.JButton themVT;
    private javax.swing.JTextArea thongTxt;
    private javax.swing.JButton thongkeBT;
    private javax.swing.JTextField tuoiCT;
    private javax.swing.JButton xoaVT;
    // End of variables declaration//GEN-END:variables
}