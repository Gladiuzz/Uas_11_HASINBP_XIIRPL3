/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_Hasinbp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SMKN4
 */
public class pengembalian1 extends javax.swing.JFrame {

    /**
     * Creates new form Data_peminjaman
     */
    DefaultTableModel dtm;
    Connection connection = DatabaseConnection.getConnection();
    ResultSet rs;
    Statement stmt;
    int baris;
    public pengembalian1() {
        initComponents();
        viewPengembalian();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        wat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama_user = new javax.swing.JLabel();
        nama_user1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pengembalian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wat.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Pengembalian");

        nama_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nama_user.setForeground(new java.awt.Color(255, 255, 255));
        nama_user.setText("Nama");
        nama_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nama_userMouseClicked(evt);
            }
        });

        nama_user1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nama_user1.setForeground(new java.awt.Color(255, 255, 255));
        nama_user1.setText("level");
        nama_user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nama_user1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout watLayout = new javax.swing.GroupLayout(wat);
        wat.setLayout(watLayout);
        watLayout.setHorizontalGroup(
            watLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(watLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 689, Short.MAX_VALUE)
                .addGroup(watLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama_user)
                    .addComponent(nama_user1))
                .addGap(116, 116, 116))
        );
        watLayout.setVerticalGroup(
            watLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(watLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(watLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(watLayout.createSequentialGroup()
                        .addComponent(nama_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_user1))
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(wat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 1060, 90));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/test5.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        tbl_pengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pengembalian);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1110, 480));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 70, -1));

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, -1));

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nama_userMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda ingin logout ?");
        if (confirm == JOptionPane.YES_OPTION) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_nama_userMouseClicked

    private void nama_user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nama_user1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_user1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
                int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda ingin logout ?");
        if (confirm == JOptionPane.YES_OPTION) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
        }        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        viewPengembalian();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id_pengembalian = tbl_pengembalian.getValueAt(baris, 1).toString();
        Manage_dataPeminjaman tambahData = new Manage_dataPeminjaman(this,true,"Edit",id_pengembalian);
        tambahData.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pengembalianMouseClicked
        // TODO add your handling code here:
                        baris = tbl_pengembalian.getSelectedRow();
    }//GEN-LAST:event_tbl_pengembalianMouseClicked

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
            java.util.logging.Logger.getLogger(pengembalian1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalian1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalian1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalian1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalian1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nama_user;
    private javax.swing.JLabel nama_user1;
    private javax.swing.JTable tbl_pengembalian;
    private javax.swing.JPanel wat;
    // End of variables declaration//GEN-END:variables

    public void viewPengembalian(){
       
        String[] kolom = {"NO","id_peminjaman","tanggal_peminjaman","tanggal_kembali","status_peminjaman","id_pegawai"};
        dtm = new DefaultTableModel(null, kolom);
        
        try {
            stmt = connection.createStatement();
            String query = "SELECT * FROM peminjaman WHERE status_peminjaman = 'dikembalikan'";
            rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                String id_peminjaman = rs.getString("id_peminjaman");
                String tanggal_peminjaman = rs.getString("tanggal_pinjam");
                String tanggal_kembali = rs.getString("tanggal_kembali");
                String status_peminjaman = rs.getString("status_peminjaman");
                String pegawai = rs.getString("id_pegawai");
                dtm.addRow(new String[] {no+"",id_peminjaman,tanggal_peminjaman,tanggal_kembali,status_peminjaman,pegawai});
                no++;
                
                tbl_pengembalian.setModel(dtm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(){
        String pilihan = tbl_pengembalian.getValueAt(baris, 0).toString();
        try {
            Statement stmt = connection.createStatement();
            String query = "DELETE FROM penminjaman WHERE id_peminjaman = "+pilihan+";";
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                dtm.getDataVector().removeAllElements();
            } else{
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }





}