
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JOptionPane;

 
public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        Container pane = getContentPane();
        setTitle("MATCHING GAME");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orta = new javax.swing.JButton();
        zor = new javax.swing.JButton();
        kolay = new javax.swing.JButton();
        score = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(420, 620));
        setMinimumSize(new java.awt.Dimension(420, 620));

        orta.setBackground(new java.awt.Color(0, 153, 255));
        orta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        orta.setForeground(new java.awt.Color(0, 0, 0));
        orta.setText("HARD (6 X 6)");
        orta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tikla(evt);
            }
        });

        zor.setBackground(new java.awt.Color(0, 51, 255));
        zor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        zor.setForeground(new java.awt.Color(0, 0, 0));
        zor.setText("PRO (8 X 8)");
        zor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tikla(evt);
            }
        });

        kolay.setBackground(new java.awt.Color(0, 255, 255));
        kolay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kolay.setForeground(new java.awt.Color(0, 0, 0));
        kolay.setText("EASY (4 X 4)");
        kolay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tikla(evt);
            }
        });

        score.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        score.setText("Gurur Listemiz");
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eşleşme Oyunu");

        exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit.setText("Çıkış");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kolay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(kolay, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tikla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tikla
            //Hangi buttona tiklaninca hangi sayfa acilacak:
            JButton secim = (JButton) evt.getSource();
            String str = secim.getText();
            int n = 0;
            
            if(str == "EASY (4 X 4)") n=4;
            if(str == "HARD (6 X 6)") n=6;
            if(str == "PRO (8 X 8)") n=8;
            
            Game g = new Game(n);
            g.setLocationRelativeTo(this);
            g.setVisible(true);
        
        
    }//GEN-LAST:event_tikla

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // Exit tuşuna basınca uygulama kapansın:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
        HallOfFame hof = new HallOfFame();
        hof.setLocationRelativeTo(this);
        hof.setVisible(true);
    }//GEN-LAST:event_scoreActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kolay;
    private javax.swing.JButton orta;
    private javax.swing.JButton score;
    private javax.swing.JButton zor;
    // End of variables declaration//GEN-END:variables
}
