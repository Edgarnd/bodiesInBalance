package equilibrio_all;
import java.net.URISyntaxException;
import java.io.IOException;
import javax.swing.ImageIcon;


/**
 *
 * @author PC User
 */
public class WebInf extends javax.swing.JFrame {

    public WebInf() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("images\\logoupes.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botOpen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botOpen1 = new javax.swing.JButton();

        botOpen.setText("Instagram");
        botOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botOpenActionPerformed(evt);
            }
        });

        jLabel1.setText("Created by: Edgar Renderos(); Cycle02");

        botOpen1.setText("Facebook");
        botOpen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botOpen1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botOpen)
                        .addGap(18, 18, 18)
                        .addComponent(botOpen1))
                    .addComponent(jLabel1))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botOpen)
                    .addComponent(botOpen1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botOpenActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri = new java.net.URI("https://www.instagram.com/edgarnd.class/");
                   desktop.browse(uri);
               }catch(URISyntaxException | IOException ex){}
            }
        }
    }//GEN-LAST:event_botOpenActionPerformed

    private void botOpen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botOpen1ActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri = new java.net.URI("https://www.facebook.com/Edgar.rda");
                   desktop.browse(uri);
               }catch(URISyntaxException | IOException ex){}
            }
        }
    }//GEN-LAST:event_botOpen1ActionPerformed

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botOpen;
    private javax.swing.JButton botOpen1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
