/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spdvi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;

/**
 *
 * @author Alumne
 */
public class OpusListMainForm extends javax.swing.JFrame {

    ArrayList<Opus> obras = new ArrayList<>();
    JList<Opus> lstOpus;
    private static final java.lang.reflect.Type LIST_OF_OBRA_TYPE = new TypeToken<List<Opus>>() {}.getType();
    JFileChooser fileChooser;
    String imagePath = "";
    String imageName = "";
    public UpdateDialog ud;
    public String registre;
    public String userFolder = System.getProperty("user.home");
    public String ubiData = "\\AppData\\Local\\OpusList\\data\\";
    public String imageSource = "\\AppData\\Local\\OpusList\\images\\";
    public DefaultListModel<Opus> opusListModel;

    
    public OpusListMainForm() {
        initComponents();
        
        lstOpus = new JList<>();
        jScrollPane1.setViewportView(lstOpus);
        lstOpus.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOpusValueChanged(evt);
            }
        });
        lstOpus.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent e) {
            mouseClickOpus(e);
        }
        });
    }
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblFormat = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtFormat = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mnuOpus = new javax.swing.JMenuBar();
        mnuEdit = new javax.swing.JMenu();
        mnuInsert = new javax.swing.JMenuItem();
        mnuUpdate = new javax.swing.JMenuItem();
        mnuDelete = new javax.swing.JMenuItem();
        mnuFile = new javax.swing.JMenu();
        mnuSave = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblId.setText("ID: ");

        lblTitle.setText("Title:");

        lblYear.setText("Year: ");

        lblFormat.setText("Format:");

        lblAuthor.setText("Author:");

        lblImage.setBorder(new javax.swing.border.MatteBorder(null));

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        mnuEdit.setText("Edit");

        mnuInsert.setText("Insert");
        mnuInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInsertActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuInsert);

        mnuUpdate.setText("Update");
        mnuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUpdateActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuUpdate);

        mnuDelete.setText("Delete");
        mnuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuDelete);

        mnuOpus.add(mnuEdit);

        mnuFile.setText("File");

        mnuSave.setText("Save");
        mnuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSaveActionPerformed(evt);
            }
        });
        mnuFile.add(mnuSave);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuExit);

        mnuOpus.add(mnuFile);

        setJMenuBar(mnuOpus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAuthor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFormat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormat))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYear))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFormat)
                            .addComponent(txtFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAuthor)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInsertActionPerformed
        InsertDialog insertDialog = new InsertDialog(this, true);
        insertDialog.setVisible(true);
    }//GEN-LAST:event_mnuInsertActionPerformed

    private void lstOpusValueChanged(javax.swing.event.ListSelectionEvent evt) {
        txtId.setEnabled(false);
        txtTitle.setEnabled(false);
        txtYear.setEnabled(false);
        txtFormat.setEnabled(false);
        txtAuthor.setEnabled(false);
        Opus selectedOpus = lstOpus.getSelectedValue();
        if (selectedOpus != null) {
            for (Opus o : obras) {
                if (o.getRegistre() == selectedOpus.getRegistre()) {
                    txtId.setText(o.getRegistre());
                    txtTitle.setText(o.getTitol());
                    txtYear.setText(o.getAny());
                    txtFormat.setText(o.getFormat());
                    txtAuthor.setText(o.getAutor());
                    try {
                        BufferedImage selectedImage;
                        if (o.getImatge() != null) {
                            selectedImage = ImageIO.read(new File(userFolder + imageSource + o.getImatge()));
                            lblImage.setIcon(resizImageIcon(selectedImage));
                        }
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
        }
    }
    
    private void Save() {
        try (Writer wrt = new FileWriter(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(obras, wrt);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } 
    }
       
    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadOpus();
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void mnuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUpdateActionPerformed
        ud = new UpdateDialog(this, true);
        ud.setVisible(true);
    }//GEN-LAST:event_mnuUpdateActionPerformed

    private void mnuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteActionPerformed
        DeleteDialog deleteDialog = new DeleteDialog(this, true);
        deleteDialog.setVisible(true);
    }//GEN-LAST:event_mnuDeleteActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSaveActionPerformed
        ConfirmSaveDialog csd = new ConfirmSaveDialog(this, true);
        csd.setVisible(true);
        if(csd.action == true) {
            Save();
        }
    }//GEN-LAST:event_mnuSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        mnuSave.doClick();
    }//GEN-LAST:event_formWindowClosing

    public ImageIcon resizImageIcon(BufferedImage originalImage) {
        int desiredHeight = 0;
        int desiredWidth = 0;
        float aspectRatio = (float) originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() < originalImage.getHeight()) {
            desiredWidth = Math.round(lblImage.getHeight() * aspectRatio);
            desiredHeight = lblImage.getHeight();
        } else {
            desiredHeight = Math.round(lblImage.getWidth() / aspectRatio);
            desiredWidth = lblImage.getWidth();
        }

        Image resultingImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(desiredWidth, desiredHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);

        ImageIcon icon = new ImageIcon(outputImage);
        return icon;
    }
    
    public void loadOpus() {
        Gson gson = new Gson();
        try {
            opusListModel = new DefaultListModel<Opus>();
            JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json"));
            obras = gson.fromJson(reader, LIST_OF_OBRA_TYPE);
            for (Opus o: obras) {
                opusListModel.addElement(o);
            }
            lstOpus.setModel(opusListModel);
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
    
    public void mouseClickOpus(java.awt.event.MouseEvent e) {
        if(e.getClickCount() == 2){
            UpdateDialogModifier udm = new UpdateDialogModifier(this, true);
            registre = lstOpus.getSelectedValue().getRegistre();
            udm.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(OpusListMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpusListMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpusListMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpusListMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpusListMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblFormat;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JMenuItem mnuDelete;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuInsert;
    private javax.swing.JMenuBar mnuOpus;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JMenuItem mnuUpdate;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtFormat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
