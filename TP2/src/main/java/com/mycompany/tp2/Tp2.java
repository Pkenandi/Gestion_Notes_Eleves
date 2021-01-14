/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp2;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;


/**
 *
 * @author kevin
 */
public class Tp2 {
   
    private JFrame F;
    private JPanel P;
    private GridBagConstraints gc;
    private JButton B;
    private JLabel L;
    private JComboBox CB;
    private JTextField tf;
    private JTextArea Ta;
    private JRadioButton Rb;
    private JTabbedPane TP;
    private JMenuBar MB;
    private JMenuItem MT;
    private ButtonGroup bg;
    
    public Tp2()
    {
        Gui();
    }
    
    public final void Gui()
    {
        F = new JFrame(" Inscription ");
        F.setSize(600, 400);

        
        P = new JPanel(new GridBagLayout());
        P.setBackground(new Color(0x87CEEB));
        Border border = BorderFactory.createTitledBorder(" Niveau ");
        P.setBorder(border);
        
        bg = new ButtonGroup();
        JRadioButton cb = new JRadioButton("Premiere annÃ©e", true);
        cb.setBounds(100, 100, 50, 50);
        JRadioButton cb1 = new JRadioButton("Deuxieme annÃ©e", false);
        cb1.setBounds(100,100,50,50);
        JRadioButton cb2 = new JRadioButton("Troisieme annÃ©e", false);
        cb2.setBounds(100,100,50,50);
        
        gc = new GridBagConstraints();
        Box box1 = Box.createVerticalBox();
        gc.insets = new Insets(5,5,5,50);
        
        gc.gridx = 0;
        gc.gridy = 1;
        box1.add(cb,gc);
        gc.gridx = 0;
        gc.gridy = 2;
        box1.add(cb1,gc);
        gc.gridx = 0;
        gc.gridy = 3;
        box1.add(cb2,gc);
        
        // Groupement des boutons
        
        bg.add(cb);
        bg.add(cb1);
        bg.add(cb2);
        
        // Alignement des elements
        
        Box box2 = Box.createHorizontalBox();
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.insets = new Insets(200,10,10,10);
        
        L = new JLabel(" L'option choisi est : ");
        tf = new JTextField("Premiere année",20);
        box2.add(L);
        box2.add(tf);
        gc1.gridx = 1;
        gc1.gridy = 4;
        
        if(cb.isSelected())
        {
            tf.setText("Premiere année");
        }else if(cb1.isSelected())
        {
            tf.setText("Deuxieme année");
        }else 
        {
            tf.setToolTipText("Troisieme année");
        }
        
        //Ajout dans le JPanel
        
        P.add(box1,gc);
        P.add(box2,gc1);
        
        // Ajout dans le JFram
        
        F.add(P);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main( String [] args)
    {
          new Tp2();
    }
}
