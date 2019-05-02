
import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fer
 */
public class Angulos extends javax.swing.JFrame {
    int Grados;
   
    public Angulos() {
        
        initComponents();
        Grados = 0;
        
        
        ImageIcon Imagen = new ImageIcon("src/Imagenes/0.png");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Gradosmostrar = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        Capturar = new javax.swing.JTextField();
        ImagenEtiqueta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Calculadora De Angulos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 8, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Ingrese El Numero De Grados Del Angulo:");

        Calcular.setText(" Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 8, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Grados Del Angulo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 8, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Representacion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 8, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Tipo:");

        Gradosmostrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Gradosmostrar.setForeground(new java.awt.Color(246, 0, 0));
        Gradosmostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gradosmostrar.setText(" ");
        Gradosmostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 0, 255), 3));

        Tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tipo.setForeground(new java.awt.Color(246, 0, 0));
        Tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tipo.setText(" ");
        Tipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 0, 255), 3));

        Capturar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ImagenEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.jpg"))); // NOI18N
        ImagenEtiqueta.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(ImagenEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(Capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(Calcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Gradosmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Calcular)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gradosmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagenEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
         Grados = Integer.parseInt(Capturar.getText());
       Gradosmostrar.setText(""+Grados+"°");
      
       if(Grados>=1&& Grados<=360){
        if(Grados == 90){
             Gradosmostrar.setText(""+Grados+"°");
             Tipo.setText("Angulo Recto");
             if(Grados == 90){
             
                
                
             }
             
        }
        if(Grados < 90){
             Gradosmostrar.setText(""+Grados+"°");
             Tipo.setText("Angulo Agudo");
        }
        if(Grados >90 && Grados <=180){
             Gradosmostrar.setText(""+Grados+"°");
             Tipo.setText("Angulo Obtuso");
        }
        if(Grados >= 180 && Grados <=360){
             Gradosmostrar.setText(""+Grados+"°");
             Tipo.setText("Angulo Concavo");
        }
           
           
           
       }
       else{
           JOptionPane.showMessageDialog(null, "Fuera De Rango");
       }
       
       if(Grados>=1 && Grados<=10){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/10.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=11 && Grados<=20){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/20.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=21 && Grados<=30){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/30.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=31 && Grados<=40){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/40.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=41 && Grados<=50){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/50.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=51 && Grados<=60){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/60.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=61 && Grados<=70){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/70.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=71 && Grados<=80){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/80.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=81 && Grados<=90){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/90.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=91 && Grados<=100){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/100.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=101 && Grados<=110){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/110.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=111 && Grados<=120){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/120.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=121 && Grados<=130){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/130.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=131 && Grados<=140){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/140.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=141 && Grados<=150){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/150.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=151 && Grados<=60){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/160.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=161 && Grados<=170){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/170.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=171 && Grados<=180){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/180.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=181 && Grados<=190){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/190.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=191 && Grados<=200){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/200.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=201 && Grados<=210){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/210.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=211 && Grados<=220){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/220.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=221 && Grados<=230){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/230.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=231 && Grados<=240){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/240.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=241 && Grados<=250){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/250.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=251 && Grados<=260){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/260.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=261 && Grados<=270){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/270.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=271 && Grados<=280){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/280.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=281 && Grados<=290){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/290.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=291 && Grados<=300){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/300.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=301 && Grados<=310){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/310.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=311 && Grados<=320){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/320.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=321 && Grados<=330){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/330.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=331 && Grados<=340){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/340.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=341 && Grados<=350){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/360.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
       if(Grados>=351 && Grados<=360){
           ImageIcon Imagen = new ImageIcon("src/Imagenes/3602.jpg");
           Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenEtiqueta.getWidth(), ImagenEtiqueta.getHeight(), Image.SCALE_DEFAULT));
        ImagenEtiqueta.setIcon(icono);
        this.repaint();
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
           
           
       
     
     
      
    }//GEN-LAST:event_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Angulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Angulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Angulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Angulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Angulos().setVisible(true);
            }   }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Capturar;
    private javax.swing.JLabel Gradosmostrar;
    private javax.swing.JLabel ImagenEtiqueta;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

