/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagedisplay;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author HI
 */
public class ImageDisplay extends javax.swing.JFrame {
    ImageIcon icon1 = new ImageIcon("Image/1.jpg");
    ImageIcon icon2 = new ImageIcon("Image/2.jpg");
    ImageIcon icon3 = new ImageIcon("Image/3.jpg");
    ImageIcon icon4 = new ImageIcon("Image/4.jpg");
    ImageIcon icon5 = new ImageIcon("Image/5.jpg");
    
    /**
     * Creates new form ImageDisplay
     */
    public ImageDisplay() {
        initComponents();
        this.setLayout(new BorderLayout());
        this.add(lbImage, BorderLayout.CENTER);
        this.add(jPanel1, BorderLayout.SOUTH);
        setImagesforButton(btnImage1, icon1);
        setImagesforButton(btnImage2, icon2);
        setImagesforButton(btnImage3, icon3);
        setImagesforButton(btnImage4, icon4);
        setImagesforButton(btnImage5, icon5);
    }

    private void setImagesforButton(JButton jb, ImageIcon ic) {
        // set a image for a button.
        Image img = ic.getImage().getScaledInstance(jb.getWidth() - 10,
                jb.getHeight() - 10, java.awt.Image.SCALE_SMOOTH);
        jb.setIcon(new ImageIcon(img));
    }
    
    private void setImagesforLabel(JLabel jl, ImageIcon ic) {
        // set a image for a label.
        Image img = ic.getImage().getScaledInstance(jl.getWidth(),
                jl.getHeight(), java.awt.Image.SCALE_SMOOTH);
        jl.setIcon(new ImageIcon(img));
    }

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g); //To change body of generated methods, choose Tools | Templates.
//        setImagesforLabel(lbImage, icon1);
//        setImagesforLabel(lbImage, icon2);
//        setImagesforLabel(lbImage, icon3);
//        setImagesforLabel(lbImage, icon4);
//        setImagesforLabel(lbImage, icon5);
//    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnImage1 = new javax.swing.JButton();
        btnImage2 = new javax.swing.JButton();
        btnImage3 = new javax.swing.JButton();
        btnImage4 = new javax.swing.JButton();
        btnImage5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImage1ActionPerformed(evt);
            }
        });

        btnImage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImage2ActionPerformed(evt);
            }
        });

        btnImage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImage3ActionPerformed(evt);
            }
        });

        btnImage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImage4ActionPerformed(evt);
            }
        });

        btnImage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImage5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(btnImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImage1ActionPerformed
        // TODO add your handling code here:
        setImagesforLabel(lbImage, icon1);
    }//GEN-LAST:event_btnImage1ActionPerformed

    private void btnImage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImage2ActionPerformed
        // TODO add your handling code here:
        setImagesforLabel(lbImage, icon2);
    }//GEN-LAST:event_btnImage2ActionPerformed

    private void btnImage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImage3ActionPerformed
        // TODO add your handling code here:
        setImagesforLabel(lbImage, icon3);
    }//GEN-LAST:event_btnImage3ActionPerformed

    private void btnImage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImage4ActionPerformed
        // TODO add your handling code here:
        setImagesforLabel(lbImage, icon4);
    }//GEN-LAST:event_btnImage4ActionPerformed

    private void btnImage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImage5ActionPerformed
        // TODO add your handling code here:
        setImagesforLabel(lbImage, icon5);
    }//GEN-LAST:event_btnImage5ActionPerformed

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
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage1;
    private javax.swing.JButton btnImage2;
    private javax.swing.JButton btnImage3;
    private javax.swing.JButton btnImage4;
    private javax.swing.JButton btnImage5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImage;
    // End of variables declaration//GEN-END:variables
}
