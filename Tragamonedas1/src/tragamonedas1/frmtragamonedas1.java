/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedas1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author david
 */
public class frmtragamonedas1 extends javax.swing.JFrame {

    /**
     * Creates new form frmtragamonedas1
     */
    int aleatorio1; 
    int aleatorio2; 
    int aleatorio3;
    int contador;
    int apuesta;
    int saldo;
    
            Timer temporizador = new Timer(100, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                aleatorio1=(int)(Math.random()*10+1);
                aleatorio2=(int)(Math.random()*10+1);
                aleatorio3=(int)(Math.random()*10+1);
                contador++;
                if(contador<=100)
                {
                    switch(aleatorio1)
                    {
                        case 1: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a1.png")));
                            break;
                        case 2: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a2.png")));
                            break;
                        case 3: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a3.png")));
                            break;
                        case 4: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a4.png")));
                            break;
                        case 5: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a5.png")));
                            break;
                        case 6: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a6.png"))); 
                            break;
                        case 7: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a7.png")));  
                            break;
                        case 8: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a8.png")));
                            break;
                        case 9: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a9.png")));
                            break;
                        case 10: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a10.png")));    
                            break;

                    }

                    switch(aleatorio2)
                    {
                        case 1: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a1.png")));
                            break;
                        case 2: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a2.png")));
                            break;
                        case 3: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a3.png")));
                            break;
                        case 4: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a4.png")));
                            break;
                        case 5: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a5.png")));
                            break;
                        case 6: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a6.png"))); 
                            break;
                        case 7: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a7.png")));  
                            break;
                        case 8: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a8.png")));
                            break;
                        case 9: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a9.png")));
                            break;
                        case 10: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a10.png")));    
                            break;

                    }
                    switch(aleatorio3)
                    {
                        case 1: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a1.png")));
                            break;
                        case 2: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a2.png")));
                            break;
                        case 3: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a3.png")));
                            break;
                        case 4: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a4.png")));
                            break;
                        case 5: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a5.png")));
                            break;
                        case 6: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a6.png"))); 
                            break;
                        case 7: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a7.png")));  
                            break;
                        case 8: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a8.png")));
                            break;
                        case 9: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a9.png")));
                            break;
                        case 10: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("a10.png")));    
                            break;

                    }                    
                }
                if(contador<=200)
                {
                    switch(aleatorio1)
                    {
                        case 1: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a1.png")));
                            break;
                        case 2: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a2.png")));
                            break;
                        case 3: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a3.png")));
                            break;
                        case 4: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a4.png")));
                            break;
                        case 5: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a5.png")));
                            break;
                        case 6: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a6.png"))); 
                            break;
                        case 7: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a7.png")));  
                            break;
                        case 8: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a8.png")));
                            break;
                        case 9: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a9.png")));
                            break;
                        case 10: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a10.png")));    
                            break;

                    }

                    switch(aleatorio2)
                    {
                        case 1: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a1.png")));
                            break;
                        case 2: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a2.png")));
                            break;
                        case 3: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a3.png")));
                            break;
                        case 4: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a4.png")));
                            break;
                        case 5: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a5.png")));
                            break;
                        case 6: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a6.png"))); 
                            break;
                        case 7: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a7.png")));  
                            break;
                        case 8: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a8.png")));
                            break;
                        case 9: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a9.png")));
                            break;
                        case 10: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("a10.png")));    
                            break;

                    }                    
                }
                if(contador<=300)
                {
                    switch(aleatorio1)
                    {
                        case 1: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a1.png")));
                            break;
                        case 2: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a2.png")));
                            break;
                        case 3: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a3.png")));
                            break;
                        case 4: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a4.png")));
                            break;
                        case 5: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a5.png")));
                            break;
                        case 6: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a6.png"))); 
                            break;
                        case 7: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a7.png")));  
                            break;
                        case 8: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a8.png")));
                            break;
                        case 9: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a9.png")));
                            break;
                        case 10: lblimagen1.setIcon(new ImageIcon(this.getClass().getResource("a10.png")));    
                            break;

                    }                
                }
                else
                {
                    temporizador.stop();
                    apuesta= (int)cbxapuestas.getSelectedIndex();
                    saldo=Integer.parseInt(txtrecaudado.getText());
                    System.out.print(String.valueOf(apuesta));
                    System.out.print(String.valueOf(saldo));
                    int apuestamaxima=9;
                    if(aleatorio1==aleatorio2)
                    {
                        if(aleatorio2==aleatorio3)
                        {
                            apuesta=apuesta*2;
                            saldo=saldo+apuesta;
                            txtrecaudado.setText(String.valueOf(saldo));
                        }
                        
                    }
                    if(aleatorio1==9)
                    {
                        if(aleatorio2==9)
                        {
                            if(aleatorio3==9)
                            {
                                apuesta=apuesta*3;
                                saldo=saldo+apuesta;
                                txtrecaudado.setText(String.valueOf(saldo));                                
                            }
                        }
                    }
                    if(aleatorio1==aleatorio2)
                    {                       
                        
                        saldo=saldo+saldo;
                        txtrecaudado.setText(String.valueOf(saldo));
                    
                        
                    }
                    if(aleatorio1==aleatorio3)
                    {                       
                        
                        saldo=saldo+saldo;
                        txtrecaudado.setText(String.valueOf(saldo));
                    
                        
                    } 
                    if(aleatorio2==aleatorio3)
                    {                       
                        
                        saldo=saldo+saldo;
                        txtrecaudado.setText(String.valueOf(saldo));
                    
                        
                    }
                     if(aleatorio1!=aleatorio2)
                    {
                        if(aleatorio2!=aleatorio3)
                        {
                            
                            saldo=saldo-apuesta;
                            txtrecaudado.setText(String.valueOf(saldo));
                        }
                        
                    }                 
                    
                }
            }

            
        });
    public frmtragamonedas1() {
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

        jButton1 = new javax.swing.JButton();
        lblimagen1 = new javax.swing.JLabel();
        lblimagen2 = new javax.swing.JLabel();
        lblimagen3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtrecaudado = new javax.swing.JTextField();
        btnjugar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxapuestas = new javax.swing.JComboBox();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas1/a1.png"))); // NOI18N
        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblimagen1.setText("jLabel1");

        lblimagen2.setText("jLabel2");

        lblimagen3.setText("jLabel3");

        jLabel4.setText("Tragamonedas");

        txtrecaudado.setText("100");
        txtrecaudado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecaudadoActionPerformed(evt);
            }
        });

        btnjugar.setText("Jugar");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        jLabel5.setText("Apuestas:");

        jLabel6.setText("Acumulado:");

        cbxapuestas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "20", "50", "100" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblimagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblimagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxapuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtrecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnjugar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblimagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblimagen3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(lblimagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cbxapuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtrecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnjugar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        temporizador.start();
    }//GEN-LAST:event_btnjugarActionPerformed

    private void txtrecaudadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecaudadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrecaudadoActionPerformed

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
            java.util.logging.Logger.getLogger(frmtragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmtragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmtragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmtragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtragamonedas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjugar;
    private javax.swing.JComboBox cbxapuestas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    private javax.swing.JLabel lblimagen3;
    private javax.swing.JTextField txtrecaudado;
    // End of variables declaration//GEN-END:variables
}
