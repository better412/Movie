/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enter;

import static Enter.Login.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pay2 extends javax.swing.JFrame {

    /**
     * Creates new form Pay2
     */


public static final String url="jdbc:mysql://localhost/Better2?user=root&password=1234";
    public Pay2() {

this.setLocation(400,150);
        initComponents();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conn=DriverManager.getConnection(url);
 
    String s = "select * from Movie4";
    PreparedStatement pr = conn.prepareStatement(s);
    ResultSet rs =pr.executeQuery();
    
   int i=0;
   while(rs.next())
   {
       if(rs.getString("Movie_TF").equals("1"))
       {
           i++;
       }
       int j;
       j=45*i;
       jLabel2.setText(j+" ");
   }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabelc1 = new javax.swing.JLabel();
        jButtonc1 = new javax.swing.JButton();
        jButtonc2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBounds(280, 120, 130, 40);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelc1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabelc1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelc1.setText("payment:");
        jLabelc1.setBounds(150, 120, 96, 29);
        jLayeredPane1.add(jLabelc1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonc1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonc1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButtonc1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonc1.setText("ok");
        jButtonc1.setBorder(null);
        jButtonc1.setBorderPainted(false);
        jButtonc1.setOpaque(false);
        jButtonc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonc1ActionPerformed(evt);
            }
        });
        jButtonc1.setBounds(310, 230, 80, 40);
        jLayeredPane1.add(jButtonc1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonc2.setBackground(new java.awt.Color(0, 0, 0));
        jButtonc2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jButtonc2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonc2.setText("cancel");
        jButtonc2.setBorder(null);
        jButtonc2.setBorderPainted(false);
        jButtonc2.setOpaque(false);
        jButtonc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonc2ActionPerformed(evt);
            }
        });
        jButtonc2.setBounds(450, 230, 120, 40);
        jLayeredPane1.add(jButtonc2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter/c.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, -2, 660, 420);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonc1ActionPerformed
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                java.sql.Connection conn=DriverManager.getConnection(url);
                java.sql.Connection con = DriverManager.getConnection(url);
               String s2 = "delete  from Movie4";
               ps=con.prepareStatement(s2);
               ps.executeUpdate();
    
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        new BuySuccful().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonc1ActionPerformed

    private void jButtonc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonc2ActionPerformed
        new seat().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonc2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Pay2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonc1;
    private javax.swing.JButton jButtonc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelc1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
