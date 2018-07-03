/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shrey
 */
public class editGUI extends javax.swing.JFrame {
     pPhone[] p=new pPhone[10];
     pEmail[] e=new pEmail[10];
     int np=1,yp;
     int ne=1,ye;
     String s1;
    /**
     * Creates new form editGUI
     * @param s1
     */
    public editGUI(String s1) {
        this.s1=s1;
        initComponents();
        p[0]=pPhone1;
        e[0]=pEmail1;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book", "root", "shrey");
        Statement stmt=con.createStatement();
        String query="Select * from contact where phone like '"+s1+"%'";
        ResultSet rs=stmt.executeQuery(query);
        if(rs.next()){
         String name=rs.getString("Name");
         fFName.setText(name.substring(0,name.indexOf("\n")));
         fLName.setText(name.substring(name.indexOf("\n")+1));
         String job=rs.getString("job");
         fCompany.setText(job.substring(0,job.indexOf("\n")));
         fJobTitle.setText(job.substring(job.indexOf("\n")+1));
             String phone=rs.getString("phone");
             String tempp;
             np=0;
             tempp=phone.substring(0,phone.indexOf("\n"));
             phone=phone.substring(phone.indexOf("\n")+1);
             p[np].fCode.setText(tempp.substring(0,3));
             p[np].fNumber.setText(tempp.substring(4,tempp.lastIndexOf("-")));
             p[np].fPType.setSelectedItem(tempp.substring(tempp.lastIndexOf("-")+1));
             np++;
             
             while(phone.length()>=1){
                  p[np]=new pPhone();
                  yp=np*60;
                  jPanel2.add(p[np],new org.netbeans.lib.awtextra.AbsoluteConstraints(120, p[0].getY()+(yp), -1, -1));
                  Dimension d1=new Dimension(800,jPanel2.getPreferredSize().height+60);
                  Dimension d2=new Dimension(800,jPanel3.getPreferredSize().height+60);
                  //jPanel2.setPreferredSize(d1);
                  jPanel3.setPreferredSize(d2);
                  jPanel1.setPreferredSize(d2);
                  tempp=phone.substring(0,phone.indexOf("\n"));
                  phone=phone.substring(phone.indexOf("\n")+1);
                  p[np].fCode.setText(tempp.substring(0,3));
                  p[np].fNumber.setText(tempp.substring(4,tempp.lastIndexOf("-")));
                  p[np].fPType.setSelectedItem(tempp.substring(tempp.lastIndexOf("-")+1));
                  np++;
                  if(np>9)jButton1.setEnabled(false);
             }    
             String email=rs.getString("email");
             String tempe;
             ne=0;
             tempe=email.substring(0,email.indexOf("\n"));
             email=email.substring(email.indexOf("\n")+1);
             e[ne].fEmail.setText(tempe.substring(0,tempe.lastIndexOf("-")));
             e[ne].fEType.setSelectedItem(tempe.substring(tempe.lastIndexOf("-")+1));
             ne++;
             System.out.println(" "+jPanel1.getPreferredSize());
             while(email.length()>0){
                  e[ne]=new pEmail();
                  ye=ne*60;
                  jPanel4.add(e[ne],new org.netbeans.lib.awtextra.AbsoluteConstraints(120, e[0].getY()+(ye), -1, -1));
                  Dimension d1=new Dimension(800,jPanel4.getPreferredSize().height+60);     
                  Dimension d2=new Dimension(800,jPanel3.getPreferredSize().height+60);     
                  jPanel4.setPreferredSize(d1);
                  jPanel3.setPreferredSize(d2);
                  jPanel1.setPreferredSize(d2);
                  System.out.println(jPanel1.getPreferredSize());
                  tempe=email.substring(0,email.indexOf("\n"));
                  email=email.substring(email.indexOf("\n")+1);
                  e[ne].fEmail.setText(tempe.substring(0,tempe.lastIndexOf("-")));
                  e[ne].fEType.setSelectedItem(tempe.substring(tempe.lastIndexOf("-")+1));
                  ne++;
                  if(ne>9){jButton2.setEnabled(false);}
             }
             String path=rs.getString("image");
             ImageIcon icon;
             if(path==null){
             path="/home/shrey/NetBeansProjects/Address Book/src/main/Webp.net-resizeimage.png";
             }
             if(path.startsWith("/home/home")){
             path=path.substring(5);
             }
             if(path.startsWith("/home"))path=path;
             else path="/home"+path;
             
             while(path.contains("%20"))
             path=path.substring(0,path.indexOf("%20"))+" "+path.substring(path.indexOf("%20")+3);
             System.out.println(path);
             icon=new ImageIcon(path);
             icon.getImage().flush();
             lImage.setIcon(icon);        
        
        }
        }
        catch(Exception ex){
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ppName = new javax.swing.JPanel();
        lFName = new javax.swing.JLabel();
        fFName = new javax.swing.JTextField();
        lImage = new javax.swing.JLabel();
        fCompany = new javax.swing.JTextField();
        lCompany1 = new javax.swing.JLabel();
        fJobTitle = new javax.swing.JTextField();
        lJobTitle = new javax.swing.JLabel();
        fLName = new javax.swing.JTextField();
        lLName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lPhone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pPhone1 = new main.pPhone();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pEmail1 = new main.pEmail();
        jButton2 = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        jLabel1.setText("   Edit Contact");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 80));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 385));

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 400));

        ppName.setPreferredSize(new java.awt.Dimension(800, 180));
        ppName.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lFName.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lFName.setText("First Name");
        ppName.add(lFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 250, 30));

        fFName.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        ppName.add(fFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 250, 50));

        lImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Webp.net-resizeimage.png"))); // NOI18N
        ppName.add(lImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        fCompany.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        ppName.add(fCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 50));

        lCompany1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lCompany1.setText("Company");
        ppName.add(lCompany1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 250, 30));

        fJobTitle.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        ppName.add(fJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 250, 50));

        lJobTitle.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lJobTitle.setText("Job Title");
        ppName.add(lJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 250, 30));

        fLName.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        ppName.add(fLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 250, 50));

        lLName.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lLName.setText("Last Name");
        ppName.add(lLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 250, 30));

        jPanel3.add(ppName);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lPhone.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        lPhone.setText("                        Phone");
        lPhone.setPreferredSize(new java.awt.Dimension(800, 30));
        jPanel2.add(lPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel2.setPreferredSize(new java.awt.Dimension(120, 150));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 80));

        pPhone1.setPreferredSize(new java.awt.Dimension(610, 50));
        jPanel2.add(pPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 610, 50));

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButton1.setText("+");
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 50, 50));

        jPanel3.add(jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Email");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 250, 30));
        jPanel4.add(pEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 50, 50));

        jPanel3.add(jPanel4);

        jPanel1.add(jPanel3);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 400));

        bCancel.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        getContentPane().add(bCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 100, 50));

        bSave.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 100, 50));

        bDelete.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 100, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p[np]=new pPhone();
        yp=np*60;
        jPanel2.add(p[np],new org.netbeans.lib.awtextra.AbsoluteConstraints(120, p[0].getY()+(yp), -1, -1));
        Dimension d1=new Dimension(800,jPanel2.getHeight()+60);
        Dimension d2=new Dimension(800,jPanel3.getHeight()+60);
        jPanel2.setPreferredSize(d1);
        jPanel3.setPreferredSize(d2);
        jPanel1.setPreferredSize(d2);
        np++;
        if(np>9)jButton1.setEnabled(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        e[ne]=new pEmail();
        ye=ne*60;
        jPanel4.add(e[ne],new org.netbeans.lib.awtextra.AbsoluteConstraints(120, e[0].getY()+(ye), -1, -1));
        Dimension d1=new Dimension(800,jPanel4.getHeight()+60);
        Dimension d2=new Dimension(800,jPanel3.getHeight()+60);
        jPanel4.setPreferredSize(d1);
        jPanel3.setPreferredSize(d2);
        jPanel1.setPreferredSize(d2);
        ne++;
        if(ne>9)jButton2.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bCancelActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        String name="",job="",email="",phone="",image="";
        try{
            name=fFName.getText()+" \n";}
        catch(Exception e1){

        }
        try{
            job=fCompany.getText()+" \n";}
        catch(Exception e1){

        }
        try{
            name+=fLName.getText();}
        catch(Exception e1){
            name+=" ";
        }
        try{
            job+=fJobTitle.getText();}
        catch(Exception e1){
            job+=" ";
        }
        try{
            for(int i=0;i<10;i++){
                phone+=p[i].fCode.getText().trim()+"-"+p[i].fNumber.getText()+"-"+p[i].fPType.getSelectedItem()+"\n";}
        }
        catch(Exception e1){
        }
        try{
            for(int i=0;i<10;i++){
                email+=e[i].fEmail.getText()+"-"+e[i].fEType.getSelectedItem()+"\n";}
        }
        catch(Exception e1){
        }
        image=lImage.getIcon().toString().substring(5);
        if("/home/shrey/NetBeansProjects/Address Book/src/main/Webp.net-resizeimage.png".equals(image))image=null;
     
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book","root","shrey");
            Statement stmt=con.createStatement();
            String query="update contact set Name='"+name+"',job='"+job+"',phone='"+phone+"',email='"+email+"',image='"+image+"' where phone like '"+s1+"%'";
            stmt.executeUpdate(query);}
        catch(ClassNotFoundException | SQLException e2){
            System.out.print(e2);} 
        this.dispose();

    }//GEN-LAST:event_bSaveActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        int sure=JOptionPane.showConfirmDialog(this, "Sure to delete");
         if(sure==JOptionPane.YES_OPTION){try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book","root","shrey");
            Statement stmt=con.createStatement();
            String query="Delete from contact where phone like '"+s1+"%'";
            stmt.executeUpdate(query);}
        catch(ClassNotFoundException | SQLException e2){
            System.out.print(e2);} 
        this.dispose();
}// TODO add your handling code here:
    }//GEN-LAST:event_bDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(editGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new editGUI(s1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bSave;
    private javax.swing.JTextField fCompany;
    private javax.swing.JTextField fFName;
    private javax.swing.JTextField fJobTitle;
    private javax.swing.JTextField fLName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCompany1;
    private javax.swing.JLabel lFName;
    private javax.swing.JLabel lImage;
    private javax.swing.JLabel lJobTitle;
    private javax.swing.JLabel lLName;
    private javax.swing.JLabel lPhone;
    private main.pEmail pEmail1;
    private main.pPhone pPhone1;
    private javax.swing.JPanel ppName;
    // End of variables declaration//GEN-END:variables
}
