/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadoraestandar;

/**
 *
 * @author Admin
 */
public class Calculadora extends javax.swing.JFrame {
    int  num1, num2;
    String signo;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jLabel1 = new javax.swing.JLabel();
        pantalla = new javax.swing.JTextField();
        btnsiete = new javax.swing.JButton();
        btnocho = new javax.swing.JButton();
        btnnueve = new javax.swing.JButton();
        btncuarto = new javax.swing.JButton();
        btncinco = new javax.swing.JButton();
        btnseis = new javax.swing.JButton();
        btnuno = new javax.swing.JButton();
        btndos = new javax.swing.JButton();
        btntres = new javax.swing.JButton();
        btncero = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        btnsumar = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("CALCULADORA");

        pantalla.setBackground(new java.awt.Color(204, 204, 204));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnsiete.setBackground(new java.awt.Color(204, 204, 204));
        btnsiete.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnsiete.setText("7");
        btnsiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsieteActionPerformed(evt);
            }
        });

        btnocho.setBackground(new java.awt.Color(204, 204, 204));
        btnocho.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnocho.setText("8");
        btnocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnochoActionPerformed(evt);
            }
        });

        btnnueve.setBackground(new java.awt.Color(204, 204, 204));
        btnnueve.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnnueve.setText("9");
        btnnueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnueveActionPerformed(evt);
            }
        });

        btncuarto.setBackground(new java.awt.Color(204, 204, 204));
        btncuarto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btncuarto.setText("4");
        btncuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuartoActionPerformed(evt);
            }
        });

        btncinco.setBackground(new java.awt.Color(204, 204, 204));
        btncinco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btncinco.setText("5");
        btncinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncincoActionPerformed(evt);
            }
        });

        btnseis.setBackground(new java.awt.Color(204, 204, 204));
        btnseis.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnseis.setText("6");
        btnseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseisActionPerformed(evt);
            }
        });

        btnuno.setBackground(new java.awt.Color(204, 204, 204));
        btnuno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnuno.setText("1");
        btnuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunoActionPerformed(evt);
            }
        });

        btndos.setBackground(new java.awt.Color(204, 204, 204));
        btndos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btndos.setText("2");
        btndos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndosActionPerformed(evt);
            }
        });

        btntres.setBackground(new java.awt.Color(204, 204, 204));
        btntres.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btntres.setText("3");
        btntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntresActionPerformed(evt);
            }
        });

        btncero.setBackground(new java.awt.Color(204, 204, 204));
        btncero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btncero.setText("0");
        btncero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceroActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(204, 204, 204));
        btnborrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnborrar.setText("C");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btndivision.setBackground(new java.awt.Color(204, 204, 204));
        btndivision.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btndivision.setText("/");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });

        btnmultiplicacion.setBackground(new java.awt.Color(204, 204, 204));
        btnmultiplicacion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnmultiplicacion.setText("X");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });

        btnrestar.setBackground(new java.awt.Color(204, 204, 204));
        btnrestar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnrestar.setText("-");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });

        btnsumar.setBackground(new java.awt.Color(204, 204, 204));
        btnsumar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnsumar.setText("+");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });

        btnigual.setBackground(new java.awt.Color(204, 204, 204));
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btncero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btndos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btntres, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnsumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsiete, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndivision, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btncuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btntres, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(btnmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btndos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnsumar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceroActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"0");
    }//GEN-LAST:event_btnceroActionPerformed

    private void btnunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"1");
    }//GEN-LAST:event_btnunoActionPerformed

    private void btndosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndosActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_btndosActionPerformed

    private void btntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntresActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_btntresActionPerformed

    private void btncuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuartoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_btncuartoActionPerformed

    private void btncincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncincoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_btncincoActionPerformed

    private void btnseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseisActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_btnseisActionPerformed

    private void btnsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsieteActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_btnsieteActionPerformed

    private void btnochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnochoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_btnochoActionPerformed

    private void btnnueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnueveActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_btnnueveActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(pantalla.getText());
        signo="/";
        pantalla.setText("");
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(pantalla.getText());
        signo="*";
        pantalla.setText("");
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(pantalla.getText());
        signo="-";
        pantalla.setText("");
    }//GEN-LAST:event_btnrestarActionPerformed

    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
        // TODO add your handling code here:
        num1=Integer.parseInt(pantalla.getText());
        signo="+";
        pantalla.setText("");
    }//GEN-LAST:event_btnsumarActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        // TODO add your handling code here:
        
        num2=Integer.parseInt(pantalla.getText());
        
        switch(signo){
            case "+":
                pantalla.setText(Integer.toString(num1+num2));
                break;
            case "-":
                pantalla.setText(Integer.toString(num1-num2));
                break;
            case "*":
                pantalla.setText(Integer.toString(num1*num2));
                break;
            case "/":
                pantalla.setText(Integer.toString(num1/num2));
                break;
    }//GEN-LAST:event_btnigualActionPerformed
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncero;
    private javax.swing.JButton btncinco;
    private javax.swing.JButton btncuarto;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btndos;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnnueve;
    private javax.swing.JButton btnocho;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnseis;
    private javax.swing.JButton btnsiete;
    private javax.swing.JButton btnsumar;
    private javax.swing.JButton btntres;
    private javax.swing.JButton btnuno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
