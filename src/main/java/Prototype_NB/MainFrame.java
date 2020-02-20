package Prototype_NB;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package venndiagram;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Ali
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
//        addText.requestFocus();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerSizeBtnGrp = new javax.swing.ButtonGroup();
        leftPanel = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        leftContainerColor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        rightContainerColor = new javax.swing.JComboBox();
        saveBtn = new javax.swing.JButton();
        addText = new javax.swing.JButton();
        deleteText = new javax.swing.JButton();
        TextColor = new javax.swing.JComboBox();
        colorLabel = new javax.swing.JLabel();
        fontLabel = new javax.swing.JLabel();
        TextFont = new javax.swing.JComboBox();
        tSize = new javax.swing.JLabel();
        TextSize = new javax.swing.JComboBox();
        rightPanel = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        containerSizeBtnGrp.add(jRadioButton1);
        jRadioButton1.setText("small");
        jRadioButton1.setFocusable(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        containerSizeBtnGrp.add(jRadioButton2);
        jRadioButton2.setText("medium");
        jRadioButton2.setFocusable(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        containerSizeBtnGrp.add(jRadioButton3);
        jRadioButton3.setText("large");
        jRadioButton3.setFocusable(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Left Container Colour:");

        leftContainerColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select colour", "blue", "red", "green", "yellow", "orange" }));
        leftContainerColor.setFocusable(false);
        leftContainerColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftContainerColorActionPerformed(evt);
            }
        });

        jLabel3.setText("Right Container Colour:");

        rightContainerColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select colour", "blue", "red", "green", "yellow", "orange" }));
        rightContainerColor.setFocusable(false);
        rightContainerColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightContainerColorActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.setFocusable(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        addText.setText("Add Text");
        addText.setFocusable(false);
        addText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTextActionPerformed(evt);
            }
        });
        addText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addTextKeyPressed(evt);
            }
        });

        deleteText.setText("Delete Text");
        deleteText.setFocusable(false);
        deleteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTextActionPerformed(evt);
            }
        });
        deleteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteTextKeyPressed(evt);
            }
        });

        TextColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "black", "blue", "red", "green", "yellow", "orange" }));
        TextColor.setFocusable(false);
        TextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextColorActionPerformed(evt);
            }
        });

        colorLabel.setText("Text  Color :");

        fontLabel.setText("Text  Font  :");

        TextFont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select font", "arial", "courier", "calibri", "tahoma", "helvetica" }));
        TextFont.setFocusable(false);
        TextFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFontActionPerformed(evt);
            }
        });

        tSize.setText("Text Size :");

        TextSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select size", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "42" }));
        TextSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addComponent(saveBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rightContainerColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(leftContainerColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(addText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fontLabel)
                                    .addComponent(colorLabel)
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tSize)))))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteText)
                            .addComponent(TextFont, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(28, 28, 28)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(leftContainerColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rightContainerColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addText)
                    .addComponent(deleteText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontLabel)
                    .addComponent(TextFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSize)
                    .addComponent(TextSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(saveBtn))
        );

        rightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rightPanel.setName("container"); // NOI18N
        rightPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightPanelKeyPressed(evt);
            }
        });

        textLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Container Size:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // 1 = blue = code
    // 2 = ....
    public void drawing() {
        //Draws the two circles
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        //Sets the settings for the Venn Diagram
        g.setColor(c1);
        g.fillOval(c1x, c1y, cw, ch);
        g.setColor(c2);
        g.fillOval(c2x, c2y, cw, ch);

    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        Graphics g = (Graphics) rightPanel.getGraphics();
        c1x = 700;
        c2x = 800;
        c1y = c2y = 200;
        cw = ch = 200;

        repaint();

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:

        Graphics g = (Graphics) rightPanel.getGraphics();
        c1x = 600;
        c2x = 750;
        c1y = c2y = 200;
        cw = ch = 300;

        repaint();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        Graphics g = (Graphics) rightPanel.getGraphics();
        c1x = 500;
        c2x = 700;
        c1y = c2y = 200;
        cw = ch = 400;

        repaint();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void leftContainerColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftContainerColorActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == leftContainerColor) {
            JComboBox cb = (JComboBox) evt.getSource();
            String color = (String) cb.getSelectedItem();

            switch (color) {
                case "blue":
                    c1 = blue;
                    repaint();
                    break;
                case "red":
                    c1 = red;
                    repaint();
                    break;
                case "green":
                    c1 = green;
                    repaint();
                    break;
                case "yellow":
                    c1 = yellow;
                    repaint();
                    break;
                case "orange":
                    c1 = orange;
                    repaint();
                    break;
            }

        }
    }//GEN-LAST:event_leftContainerColorActionPerformed

    private void rightContainerColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightContainerColorActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == rightContainerColor) {
            JComboBox cb = (JComboBox) evt.getSource();
            String color = (String) cb.getSelectedItem();

            switch (color) {
                case "blue":
                    c2 = blue;
                    repaint();
                    break;
                case "red":
                    c2 = red;
                    repaint();
                    break;
                case "green":
                    c2 = green;
                    repaint();
                    break;
                case "yellow":
                    c2 = yellow;
                    repaint();
                    break;
                case "orange":
                    c2 = orange;
                    repaint();
                    break;
            }

        }
    }//GEN-LAST:event_rightContainerColorActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
    	 BufferedImage image = null;
         try {
             
             Rectangle rect= new Rectangle(300,100,Toolkit.getDefaultToolkit().getScreenSize().width-330,Toolkit.getDefaultToolkit().getScreenSize().height-150);
             image = new Robot().createScreenCapture(rect);
         } catch (AWTException ex) {
             Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         String suggesteddir = ".";
         String EXTENSION = ".png";
         JFileChooser fileChooser = new JFileChooser(suggesteddir);
         FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", ImageIO.getReaderFileSuffixes());
         fileChooser.addChoosableFileFilter(filter);
          int status = fileChooser.showSaveDialog(null);
     if(status == JFileChooser.APPROVE_OPTION) {
         try {
         	 File selectedFile = fileChooser.getSelectedFile();
              String newfile = selectedFile.getCanonicalPath();
              if (!newfile.endsWith(EXTENSION)) {
                  newfile=newfile + EXTENSION;
              }
    
             ImageIO.write(image, "png", new File(newfile));
             // TODO add your handling code here:
         } catch (IOException ex) {
             Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTextActionPerformed
        /*
         JLabel label = new JLabel("Enter Text", SwingConstants.CENTER);
         
         label.setOpaque(true);
         label.setLocation(random.nextInt(800 - label.getWidth()),random.nextInt(600 - label.getHeight()));
      
         rightPanel.add(label);
         rightPanel.revalidate();
         repaint();
         */
//        Graphics g2d = (Graphics)rightPanel.getGraphics();
//     
//        g2d.drawString("Hi", 200, 200);
//        
        
textLabel.setText("Empty Text");
DragListener dl = new DragListener(textLabel);
 dl.addHandle(textLabel);
/*
        JLabel label = new JLabel("Empty Text");

        label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    label.setBounds(50, 20, 100, 100);
        label.setVisible(true);
        label.setOpaque(true);
        rightPanel.add(label);
                    rightPanel.validate();
                    rightPanel.repaint();
*/


//final String propertyName = "text";
//    textLabel.setTransferHandler(new TransferHandler(propertyName));
//
//    textLabel.addMouseListener(new MouseAdapter() {
//      public void mousePressed(MouseEvent evt) {
//        JComponent comp = (JComponent) evt.getSource();
//        
//        TransferHandler th = comp.getTransferHandler();
//comp.setEnabled(true);
//        th.exportAsDrag(comp, evt, TransferHandler.MOVE);
//      }
//      
//    });
        //textLabel.setText("Empty Text");
        //textLabel.setOpaque(true);

//        // TODO add your handling code here:
//        
//        Graphics g = (Graphics)rightPanel.getGraphics();
//        g.setColor(new Color(0, 0, 0, 0));
//        //g.drawString("Hello ", 400,200);
//this.add(rightPanel, new GridBagConstraints());
//        Font font = new Font("Serif", Font.PLAIN, 20);
//                g.setFont(font);
//                TextField t1 = new TextField("ghjg");
//                t1.setText("ABCF");
//                getContentPane().add(t1);
//                
//                g.drawString("Hello World", 400, 200);
//        
//        t1.setBackground(null);
//        //t1.setBorder(BorderFactory.createEmptyBorder());
//        t1.setText("abcd");
//        t1.setVisible(true);
//        //rightPanel.add(t1, rootPane);
//        //g.drawString("rtttt", c1x, c1y);
//        getContentPane().add(t1, rootPane);
//        //System.out.println("A: "+getContentPane().get.toString());
//                
//       //rightPanel.getGraphics().add(l);
//        //Container contentPane = rightPanel.getRootPane();
// //contentPane.add(t1);
// //contentPane.add(l);
//        
//        repaint();
//        
//        
    }//GEN-LAST:event_addTextActionPerformed

    private void textLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textLabelMouseClicked

        if (evt.getClickCount() % 2 == 0) {

            editable = true;
            textLabel.setText("");
            text = "";
        } else {
            editable = false;
        }

    }//GEN-LAST:event_textLabelMouseClicked

    private void addTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addTextKeyPressed

        if (editable) {
            text += evt.getKeyChar();
            textLabel.setText(text);

        }

    }//GEN-LAST:event_addTextKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void rightPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightPanelKeyPressed
        System.out.print("key");
    }//GEN-LAST:event_rightPanelKeyPressed

    private void deleteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTextActionPerformed

        textLabel.setText("");


    }//GEN-LAST:event_deleteTextActionPerformed

    private void deleteTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteTextKeyPressed

    private void TextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextColorActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == TextColor) {
            JComboBox cb = (JComboBox) evt.getSource();
            String color = (String) cb.getSelectedItem();

            switch (color) {
                case "black":
                    textLabel.setForeground(Color.BLACK);                    
                    break;
                case "blue":
                    textLabel.setForeground(Color.BLUE);                    
                    break;
                case "red":
                    textLabel.setForeground(Color.RED);
                    break;
                case "green":
                    textLabel.setForeground(Color.GREEN);
                    break;
                case "yellow":
                    textLabel.setForeground(Color.YELLOW);
                    break;
                case "orange":
                    textLabel.setForeground(Color.ORANGE);
                    break;
            }

        }
    }//GEN-LAST:event_TextColorActionPerformed

    private void TextSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSizeActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == TextSize) {
            JComboBox cb = (JComboBox) evt.getSource();
            String size = (String) cb.getSelectedItem();
            fSize = Integer.parseInt(size);
            //textLabel.l.setBounds(20, 20, 150, size+5);
            //javafx.scene.shape.Rectangle rectangle2 = new javafx.scene.shape.Rectangle(50, 50);
        
            //textLabel.setBounds(rectangle);

            setFont();
    }//GEN-LAST:event_TextSizeActionPerformed
    }
    private void TextFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFontActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == TextFont) {
            JComboBox cb = (JComboBox) evt.getSource();
            String font = (String) cb.getSelectedItem();
            switch (font) {
                case "arial":
                    name = "Arial Black";
                    setFont();
                    break;

                case "courier":
                    name = "Courier New";
                    setFont();
                    break;

                case "calibri":
                    name = "Calibri";
                    setFont();
                    break;

                case "helvetica":
                    name = "Helvetica";
                    setFont();
                    break;

                case "tahoma":
                    name = "Tahoma";
                    setFont();
                    break;
            }
    }//GEN-LAST:event_TextFontActionPerformed
    }

    private void setFont() {
        Font font = new Font(name, Font.BOLD, fSize);
        textLabel.setFont(font);
    }

    private int fSize = 12;
    private String name = "Courier New";

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /*
     public void paint(Graphics g) {
     super.paint(g);
     g.setColor(Color.RED);
     g.fillOval(cX, cY, r * 2, r * 2);

     }
    
     private class MouseHandler extends MouseAdapter implements
     MouseMotionListener {
     public void mousePressed(MouseEvent me) {
     isCircleClicked = 
     (cX - me.getX()) * (cX - me.getX()) +
     (cY - me.getY()) * (cY - me.getY()) < r * r ;
     }

     public void mouseDragged(MouseEvent me) {
     if (isCircleClicked) {

     x = me.getX() - dX;
     y = me.getY() - dY;
     cX = x + r;
     cY = y + r;
     repaint();
     }
     }

     public void mouseReleased(MouseEvent e) {
     isCircleClicked = false;
     }

     }
     */

    String text;
    boolean editable;
    private Random random = new Random();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TextColor;
    private javax.swing.JComboBox TextFont;
    private javax.swing.JComboBox TextSize;
    private javax.swing.JButton addText;
    private javax.swing.JLabel colorLabel;
    private javax.swing.ButtonGroup containerSizeBtnGrp;
    private javax.swing.JButton deleteText;
    private javax.swing.JLabel fontLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox leftContainerColor;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JComboBox rightContainerColor;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel tSize;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables

    private int c1x, c1y, c2x, c2y, cw, ch;

    private Color blue = new Color(0, 150, 255, 150);
    private Color red = new Color(255, 0, 0, 150);
    private Color green = new Color(0, 255, 0, 150);
    private Color yellow = new Color(255, 255, 0, 150);
    private Color orange = new Color(255, 128, 0, 150);

    private Color c1 = red;
    private Color c2 = blue;

    public static int size = 400;
    
    
    public class DragListener extends MouseAdapter {

    private final Component COMPONENT_TO_DRAG;
    private final int MOUSE_BUTTON;
    private Point mousePosition;
    private Point sourceLocation;
    private Point locationOnScreen;
    private int buttonPressed;

        public DragListener(final Component componentToDrag) {
             this(componentToDrag, MouseEvent.BUTTON1);
        }

        public DragListener(final Component componentToDrag, final int mouseButton)                         {
            this.COMPONENT_TO_DRAG = componentToDrag;
            this.MOUSE_BUTTON = mouseButton;
        }

        @Override
        public void mousePressed(final MouseEvent e) {
            this.buttonPressed = e.getButton();
            this.mousePosition = MouseInfo.getPointerInfo().getLocation();
            this.sourceLocation = new Point();
        }

        @Override
        public void mouseDragged(final MouseEvent e) {
            if (this.buttonPressed == MOUSE_BUTTON) {
                this.locationOnScreen = e.getLocationOnScreen();
                this.sourceLocation = this.COMPONENT_TO_DRAG.getLocation(this.sourceLocation);
                this.sourceLocation.translate((int) (this.locationOnScreen.getX() - this.mousePosition.getX()), (int) (this.locationOnScreen.getY() - this.mousePosition.getY()));
                this.COMPONENT_TO_DRAG.setLocation(this.sourceLocation);
                this.mousePosition = MouseInfo.getPointerInfo().getLocation();
            }
        }

        public void addHandle(Component handle) {
            handle.addMouseListener(this);
            handle.addMouseMotionListener(this);
        }
    }

    
}