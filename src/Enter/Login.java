package Enter;



import Enter.Register;
import java.awt.*;  
import java.awt.event.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;  
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        
        this.setTitle("Login");
        this.setLocation(400, 150);
        initComponents();
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
        a14 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JTextField();
        a13 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a15 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        a14.setBackground(java.awt.Color.white);
        a14.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a14.setForeground(new java.awt.Color(255, 255, 255));
        a14.setText("Password");
        a14.setBounds(110, 250, 96, 29);
        jLayeredPane1.add(a14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a11.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a11.setForeground(new java.awt.Color(255, 255, 255));
        a11.setText("UserName");
        a11.setBounds(110, 170, 96, 29);
        jLayeredPane1.add(a11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a12.setBackground(new java.awt.Color(0, 0, 0));
        a12.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a12.setForeground(new java.awt.Color(255, 255, 255));
        a12.setOpaque(false);
        a12.setBounds(250, 170, 320, 39);
        jLayeredPane1.add(a12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a13.setBackground(new java.awt.Color(51, 51, 51));
        a13.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a13.setForeground(new java.awt.Color(255, 255, 255));
        a13.setText("NewUser");
        a13.setBorder(null);
        a13.setBorderPainted(false);
        a13.setOpaque(false);
        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });
        a13.setBounds(590, 170, 130, 29);
        jLayeredPane1.add(a13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a17.setBackground(new java.awt.Color(0, 0, 0));
        a17.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a17.setForeground(new java.awt.Color(255, 255, 255));
        a17.setText("Exit");
        a17.setBorder(null);
        a17.setBorderPainted(false);
        a17.setOpaque(false);
        a17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a17ActionPerformed(evt);
            }
        });
        a17.setBounds(250, 360, 100, 29);
        jLayeredPane1.add(a17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a18.setBackground(new java.awt.Color(0, 0, 0));
        a18.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a18.setForeground(new java.awt.Color(255, 255, 255));
        a18.setText("Login");
        a18.setBorder(null);
        a18.setBorderPainted(false);
        a18.setOpaque(false);
        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });
        a18.setBounds(460, 360, 100, 29);
        jLayeredPane1.add(a18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a15.setBackground(new java.awt.Color(0, 0, 0));
        a15.setForeground(new java.awt.Color(255, 255, 255));
        a15.setBounds(250, 250, 320, 40);
        jLayeredPane1.add(a15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter/c.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jLabel1.setBounds(0, 0, 900, 580);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
    new Register().setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_a13ActionPerformed
public static final String url="jdbc:mysql://localhost/BETTER2?user=root&password=1234";
    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed
      try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conn=DriverManager.getConnection(url);
                
    String ID= new String(a12.getText());
    String PW=new String (a15.getText());
    

    
    String s = "select * from User where User_Name=? and User_Password=?";
    PreparedStatement pr = conn.prepareStatement(s);
    pr.setString(1,ID);
    pr.setString(2,PW);
    ResultSet rs =pr.executeQuery();
    PreparedStatement ps=null;
    if(rs.next())
    {

String sqlfrom="insert into UserMessage(User_Name,User_Password) values (?,?)";
     Connection con = DriverManager.getConnection(url);
     ps=con.prepareStatement(sqlfrom);
     ps.setString(1, ID);
     ps.setString(2, PW);
     ps.executeUpdate();
     
    new choose().setVisible(true); 
    this.dispose();
    }
    else{
    new LoginFalse().setVisible(true);
    this.dispose();
    }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }// TODO add your handling code here:
        
    }//GEN-LAST:event_a18ActionPerformed

    private void a17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a17ActionPerformed
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_a17ActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
               
            public void run() {
               
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a11;
    private javax.swing.JTextField a12;
    private javax.swing.JButton a13;
    private javax.swing.JLabel a14;
    private javax.swing.JPasswordField a15;
    private javax.swing.JButton a17;
    private javax.swing.JButton a18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
