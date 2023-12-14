
package com.mycompany.studentrecordapp;
import java.sql.*;
import com.mycompany.studentrecordapp.DBConnection.*;

public class Start extends javax.swing.JFrame {

   
    public Start() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGIN = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passWordText = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        AuthErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        LOGIN.setFont(new java.awt.Font("Long Shot", 0, 48)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(203, 255, 44));
        LOGIN.setText("LOGIN");

        userNameLabel.setFont(new java.awt.Font("Stolzl", 0, 12)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(203, 255, 44));
        userNameLabel.setText("KTUID");

        passWordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordTextActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Stolzl", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(203, 255, 44));
        password.setText("Password");

        LoginButton.setBackground(new java.awt.Color(203, 255, 44));
        LoginButton.setFont(new java.awt.Font("Rexlia Rg", 0, 12)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        AuthErrorLabel.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        AuthErrorLabel.setForeground(new java.awt.Color(255, 153, 153));
        AuthErrorLabel.setVisible(false);
        AuthErrorLabel.setText("Error Label");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passWordText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LoginButton)
                    .addComponent(AuthErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passWordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(18, 18, 18)
                .addComponent(LoginButton)
                .addGap(18, 18, 18)
                .addComponent(AuthErrorLabel)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        String ktuid=userNameText.getText();
        if(isValid(ktuid,"user")){
            try{
                String password=passWordText.getText();
                Connection con=DBConnection.connectDB();
                PreparedStatement pst=con.prepareStatement("SELECT * from user where ktuid=?;");
                pst.setString(1, ktuid);
                ResultSet rs= pst.executeQuery();
                rs.next();
                if(rs.getString("password").equals(password)){
                    dispose();
                    MainFrame m=new MainFrame();
                    m.setVisible(true);
                    rs.close();
                    pst.close();
                    con.close();
                }
                else{
                    AuthErrorLabel.setText("Invalid Password");
                    AuthErrorLabel.setVisible(true);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            AuthErrorLabel.setText("Invalid KTUID");
            AuthErrorLabel.setVisible(true);

        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void passWordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordTextActionPerformed
    
    private boolean isValid(String id,String table){
        boolean ret=false;
        int count=0;
        try{
        Connection con=DBConnection.connectDB();
        String sql="SELECT COUNT(*) FROM table WHERE ktuid=?;";
        sql=sql.replace("table", table);
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1, id);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            count=rs.getInt(1);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(count>0){
            ret=true;
        }
        return ret;
    }
        public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
        
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthErrorLabel;
    private javax.swing.JLabel LOGIN;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passWordText;
    private javax.swing.JLabel password;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
