/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

public class SplashScreen extends javax.swing.JFrame {
    public SplashScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackgroundPanel.setBackground(new java.awt.Color(0, 255, 255));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/—Pngtree—online education training course design_5331074 (2).png"))); // NOI18N
        BackgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 660, 460));

        jProgressBar.setForeground(new java.awt.Color(0, 255, 255));
        BackgroundPanel.add(jProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 486, 900, -1));

        message.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText("Loading ...");
        BackgroundPanel.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 110, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/b350ec23-6be6-4b4d-9326-d38069a4e103_adobespark.jpg"))); // NOI18N
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        final SplashScreen s = new SplashScreen();
        s.setVisible(true);
        s.setLocation(200,100);
        s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
    
        homePage screen2 = new homePage(); 
        try{
         for(int i=0;i<=100;i++)
         {
             Thread.sleep(80);
             s.jProgressBar.setValue(i);
         }
         new SplashScreen().setVisible(false);
         
          }catch(Exception e){
              
          }
        new homePage().setVisible(false);
        screen2.setVisible(true);
        s.dispose();
          }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
