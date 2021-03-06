/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UEFA_Package;

/**
 *
 * @author ìmítâtôr
 */
public class about_frame extends javax.swing.JFrame {

    /**
     * Creates new form about_frame
     */
    public about_frame() {
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

        Aboutpanel = new javax.swing.JPanel();
        aboutparentpanel = new javax.swing.JPanel();
        custom_info = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ucl_info = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aboutbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABOUT ( UEFA )");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 630));

        Aboutpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutparentpanel.setOpaque(false);
        aboutparentpanel.setLayout(new java.awt.CardLayout());

        custom_info.setOpaque(false);
        custom_info.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UEFA_Package/cup1.png"))); // NOI18N
        custom_info.add(jLabel6);
        jLabel6.setBounds(710, 10, 430, 430);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html> Fullfill your fantasy of becoming a champion with your favourite teams competing for the crown. </html>");
        custom_info.add(jLabel8);
        jLabel8.setBounds(110, 30, 570, 410);

        aboutparentpanel.add(custom_info, "card3");

        ucl_info.setOpaque(false);
        ucl_info.setLayout(null);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UEFA_Package/cup.png"))); // NOI18N
        ucl_info.add(jLabel5);
        jLabel5.setBounds(720, 60, 380, 340);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html> The UEFA Champions League is UEFA's elite club competition with top clubs across the continent playing for the right to be crowned European champions.  The tournament, then called the European Cup, began in 1955/56 with 16 sides taking part. It changed into the Champions League in 1992/93 and has expanded over the years with a total of 79 clubs entering in 2019/20.   Qualifying begins in the summer with three rounds and then a play-off taking place before 32 teams begin the group stage.   The group stage involves eight groups of four teams, with each club playing everyone else in that group home and away. The top two sides in each group move on to the round of 16 and the start of the knockout phase, while the third-placed team drops into the UEFA Europa League.  The round of 16, quarter-finals and semi-finals are played over two legs, home and away, while the final is hosted by a stadium which is selected almost two years in advance. </html>");
        ucl_info.add(jLabel7);
        jLabel7.setBounds(110, 30, 570, 410);

        aboutparentpanel.add(ucl_info, "card2");

        Aboutpanel.add(aboutparentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1160, 460));

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ABOUT");
        Aboutpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Aboutpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 100, 10, 30));

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Custom Tournamet");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Aboutpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 180, 30));

        jLabel3.setFont(new java.awt.Font("Broadway", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Champions League");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Aboutpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 100, 170, 30));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<- Back");
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Aboutpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        aboutbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UEFA_Package/Bground.jpg"))); // NOI18N
        aboutbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        Aboutpanel.add(aboutbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aboutpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Aboutpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new UEFA_FRAME().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        aboutparentpanel.removeAll();
        aboutparentpanel.add(ucl_info);
        aboutparentpanel.repaint();
        aboutparentpanel.revalidate();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        aboutparentpanel.removeAll();
        aboutparentpanel.add(custom_info);
        aboutparentpanel.repaint();
        aboutparentpanel.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(about_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aboutpanel;
    private javax.swing.JLabel aboutbg;
    private javax.swing.JPanel aboutparentpanel;
    private javax.swing.JPanel custom_info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel ucl_info;
    // End of variables declaration//GEN-END:variables
}
