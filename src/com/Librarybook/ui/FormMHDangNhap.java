/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.ui;

import com.Librarybook.DAO.NhanVienDAO;
import com.Librarybook.entity.NhanVien;
import com.Librarybook.util.Auth;
import com.Librarybook.util.MsgBox;
import java.awt.Cursor;

/**
 *
 * @author user
 */
public class FormMHDangNhap extends javax.swing.JDialog {

    /**
     * Creates new form FormMHDangNhap
     */
    public FormMHDangNhap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblforgetpassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Đăng Nhập");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 52));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtUsername.setBackground(new java.awt.Color(108, 122, 137));
        txtUsername.setText("nv3");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/user.png"))); // NOI18N
        jLabel3.setText("User name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/padlock.png"))); // NOI18N
        jLabel2.setText("PassWord");

        btnlogin.setBackground(new java.awt.Color(242, 38, 19));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/man.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(34, 167, 240));
        txtreset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtreset.setForeground(new java.awt.Color(255, 255, 255));
        txtreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/xoa.png"))); // NOI18N
        txtreset.setText("Reset");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(108, 122, 137));
        txtPassword.setText("123");

        lblforgetpassword.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblforgetpassword.setText("Bạn Quên Mật Khẩu ?");
        lblforgetpassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblforgetpasswordMouseMoved(evt);
            }
        });
        lblforgetpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblforgetpasswordMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblforgetpassword)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(txtreset))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txtPassword)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnlogin)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblforgetpassword)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(txtreset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        this.Login();
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        this.Canel();
    }//GEN-LAST:event_txtresetActionPerformed

    private void lblforgetpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgetpasswordMousePressed
        // TODO add your handling code here:
//        CheckMail cm = new CheckMail();
//        this.setVisible(false);
//        cm.setVisible(true);
    }//GEN-LAST:event_lblforgetpasswordMousePressed

    private void lblforgetpasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgetpasswordMouseMoved
        // TODO add your handling code here:
        lblforgetpassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblforgetpasswordMouseMoved

//    void Opencheckemail(){
//        new CheckEmail(null, true).setVisible(true);        
//    }
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
            java.util.logging.Logger.getLogger(FormMHDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMHDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMHDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMHDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMHDangNhap dialog = new FormMHDangNhap(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblforgetpassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO dao = new NhanVienDAO();

    void init() {
        this.setLocationRelativeTo(null);
    }

    void Canel() {
        if (MsgBox.confirm(this, "Bạn Có Muốn Kết Thúc Không !"));
        {
            System.exit(0);
        }
    }

    void Login() {
        String MaNV = txtUsername.getText();
        String MatKhau = new String(txtPassword.getPassword());
        NhanVien nv = dao.selectById(MaNV);
        if (nv == null) {
            MsgBox.alert(this, "Sai Tên Đăng Nhập !");
        } else if (!MatKhau.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Sai Mật Khẩu !");
        } else {
            Auth.user = nv; //authentication Hỗ Trợ Quản Lí Thông Tin Đăng Nhập  
            this.dispose();
        }
    }
}
