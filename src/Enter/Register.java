package Enter;


import Enter.PasswordFail;
import Enter.NameFail;
import Enter.NameFail;
import Enter.NameFail;
import Enter.PasswordFail;
import Enter.PasswordFail;
import Enter.Register2;
import Enter.Register2;
import Enter.Register_Email;
import Enter.Register_Email;
import Enter.Register_Name;
import Enter.Register_Name;
import Enter.User_NameFalse;
import Enter.User_NameFalse;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;


/**
 *
 * @author 霖
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        this.setTitle("Register");
        this.setLocation(400,150);
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
        a24 = new javax.swing.JPasswordField();
        a28 = new javax.swing.JTextField();
        a29 = new javax.swing.JButton();
        a27 = new javax.swing.JLabel();
        a22 = new javax.swing.JTextField();
        a23 = new javax.swing.JLabel();
        a25 = new javax.swing.JLabel();
        a26 = new javax.swing.JPasswordField();
        a21 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));

        a24.setBackground(new java.awt.Color(0, 0, 0));
        a24.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a24.setForeground(new java.awt.Color(255, 255, 255));
        a24.setOpaque(false);
        a24.setBounds(420, 180, 202, 35);
        jLayeredPane1.add(a24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a28.setBackground(new java.awt.Color(0, 0, 0));
        a28.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a28.setForeground(new java.awt.Color(255, 255, 255));
        a28.setOpaque(false);
        a28.setBounds(420, 290, 202, 35);
        jLayeredPane1.add(a28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a29.setBackground(new java.awt.Color(0, 0, 0));
        a29.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a29.setForeground(new java.awt.Color(255, 255, 255));
        a29.setText("Next");
        a29.setBorder(null);
        a29.setBorderPainted(false);
        a29.setOpaque(false);
        a29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a29ActionPerformed(evt);
            }
        });
        a29.setBounds(350, 410, 100, 40);
        jLayeredPane1.add(a29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a27.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a27.setForeground(new java.awt.Color(255, 255, 255));
        a27.setText("E-Mail");
        a27.setBounds(200, 290, 72, 29);
        jLayeredPane1.add(a27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a22.setBackground(new java.awt.Color(0, 0, 0));
        a22.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a22.setForeground(new java.awt.Color(255, 255, 255));
        a22.setOpaque(false);
        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });
        a22.setBounds(420, 120, 202, 35);
        jLayeredPane1.add(a22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a23.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a23.setForeground(new java.awt.Color(255, 255, 255));
        a23.setText("Password");
        a23.setBounds(200, 180, 96, 29);
        jLayeredPane1.add(a23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a25.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a25.setForeground(new java.awt.Color(255, 255, 255));
        a25.setText("Repeat Password");
        a25.setBounds(200, 240, 180, 29);
        jLayeredPane1.add(a25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a26.setBackground(new java.awt.Color(0, 0, 0));
        a26.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a26.setForeground(new java.awt.Color(255, 255, 255));
        a26.setOpaque(false);
        a26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a26ActionPerformed(evt);
            }
        });
        a26.setBounds(420, 230, 202, 35);
        jLayeredPane1.add(a26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        a21.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        a21.setForeground(new java.awt.Color(255, 255, 255));
        a21.setText("UserName");
        a21.setBounds(200, 130, 96, 29);
        jLayeredPane1.add(a21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter/向左箭头_#ffffff_64_3655826.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBounds(0, 0, 90, 90);
        jLayeredPane1.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter/c.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 830, 600);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a22ActionPerformed
public static final String url="jdbc:mysql://localhost/BETTER2?user=root&password=1234";
    private void a29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a29ActionPerformed

       String a = new String(a24.getPassword());
       String b = new String(a26.getPassword());
       String c = new String(a22.getText());
       String d = new String(a28.getText());
       String e = new String(a24.getText());
       
      
       try{
            Class.forName("com.mysql.jdbc.Driver");
            try{
                
            String sqlfrom = "insert into User (User_Name,User_Password,User_Email) values (?,?,?)";
            String sqlto = "select * from User";ResultSet rs = null;
            PreparedStatement ps = null;
           
            Connection conn = DriverManager.getConnection(url);
           Statement s=conn.createStatement();
           rs = s.executeQuery(sqlto);
           Connection con = DriverManager.getConnection(url);
           ps=con.prepareStatement(sqlfrom);
           
           ps.setString(1, c);
           ps.setString(2, a);
           ps.setString(3, d);
          int j=0;
           while(rs.next())
           {
               if(rs.getString("User_Name").equals(c))
               {
                   j++;
               }
           }
           if(j>0)
           {
               new User_NameFalse().setVisible(true);
           }
           else
           {
               if((c.length()!=0)||(d.length()!=0))
                   { 
                    Boolean Myboolean;
                    Pattern Mypattern = Pattern.compile("^[a-zA-Z]+$");
                    Matcher Mymatcher = Mypattern.matcher(c);
                    Myboolean = Mymatcher.matches();
                    if(Myboolean==false)
                    {
                    new Register_Name().setVisible(true);
                    }
                    else
                    {
                    Boolean Myboolean2;
                    Pattern Mypattern2 = Pattern.compile("^[a-z]|[a-z.0-9]|@[a-z]|.[a-z]|$");
                    Matcher Mymatcher2 = Mypattern.matcher(d);
                    Myboolean2 = Mymatcher.matches();
                        if(Myboolean2==false)
                        {
                        new Register_Email().setVisible(true);
                        }
                        else
                        {
                            if(a.length()!=0||b.length()!=0){
            
                       		if((a.equals(b)))
                       		 {
                            	 ps.executeUpdate();
                                 new Register2().setVisible(true);
		                 this.dispose();
                        	}
                        	else 
                        	{
                       	   	  new PasswordFail().setVisible(true);
                       		 }
                        }
                            else{
                            new PasswordFail().setVisible(true);
                            }
                        }
                    }
                   }
                    else 
                    {
                     new NameFail().setVisible(true);
                    }
             
                
       }
            }catch (SQLException q) {
           q.printStackTrace();
       } }catch(ClassNotFoundException q){
               q.printStackTrace();
           }
    }//GEN-LAST:event_a29ActionPerformed

    private void a26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a26ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new Login().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    
    public static void main(String args[]) {
        new Register();
    
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a21;
    private javax.swing.JTextField a22;
    private javax.swing.JLabel a23;
    private javax.swing.JPasswordField a24;
    private javax.swing.JLabel a25;
    private javax.swing.JPasswordField a26;
    private javax.swing.JLabel a27;
    private javax.swing.JTextField a28;
    private javax.swing.JButton a29;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
