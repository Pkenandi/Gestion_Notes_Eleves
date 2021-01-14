import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Tp2 {
   
    private JFrame window;
    private JPanel P1;
    private JPanel P2;
    private JPanel P3;
    private GridBagConstraints gc;
    private JButton B;
    private JRadioButton Rb;
    private JTabbedPane TP;
    private JMenuBar MB;
    private JMenuItem MT;
    private ButtonGroup bg;
    
    public Tp2()
    {
        General_Frame(); // Fonction generale
    }
    
    public JPanel Panel_Niveau() // Creation du Panel pour "Niveau"
    {
        
        P1 = new JPanel(new GridBagLayout());
        P1.setBackground(new Color(0x90EE90));
        
        bg = new ButtonGroup(); // Groupement des boutons 
        
        JRadioButton cb = new JRadioButton("Premiere année", true);
        cb.setBounds(100, 100, 50, 50);
        cb.setBackground(new Color(0x90EE90));
        
        JRadioButton cb1 = new JRadioButton("Deuxieme année", false);
        cb1.setBounds(100,100,50,50);
        cb1.setBackground(new Color(0x90EE90));
        
        JRadioButton cb2 = new JRadioButton("Troisieme année", false);
        cb2.setBounds(100,100,50,50);
        cb2.setBackground(new Color(0x90EE90));
        
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
        
        Box box2 = Box.createHorizontalBox(); // Creation d'un Box verticalppour classé les composants
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.insets = new Insets(200,10,10,10);
        
        JLabel L = new JLabel(" Le choix selectioné est : ");
        JTextField tf = new JTextField(" Premiere année ",20);
        box2.add(L);
        box2.add(tf);
        gc1.gridx = 1;
        gc1.gridy = 4;
        
        // Changement du textfield
        cb.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(cb.isSelected())
        		{
        			tf.setText(" Premiere année ");
        		}
        	}
        });
        
        cb1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(cb1.isSelected())
        		{
        			tf.setText(" Deuxieme année ");
        		}
        	}
        });
        
        cb2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(cb2.isSelected())
        		{
        			tf.setText(" Troisieme année ");
        		}
        	}
        });
        
        P1.add(box1,gc);
        P1.add(box2,gc1);
        
        return (P1);
    }
    
    public JPanel Panel_Section() // Creation du Panel pour " Section " 
    {
        				
        // Creation du deuxieme Panel "Section"
        
        P2 = new JPanel(new GridBagLayout());
        P2.setBackground(new Color(204,153,255));
        
        // Radio buttons 
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton b1 = new JRadioButton(" LFI ", true);
        b1.setBackground(new Color(204,153,255));
        JRadioButton b2 = new JRadioButton(" LFM ", false);
        b2.setBackground(new Color(204,153,255));
        JRadioButton b3 = new JRadioButton(" LFP ", false);
        b3.setBackground(new Color(204,153,255));
        JRadioButton b4 = new JRadioButton(" LFC3 ", false);
        b4.setBackground(new Color(204,153,255));
        
        //ajout  au group
        
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        
        // Creation de la BOX et alignement des elements
        
        gc = new GridBagConstraints();
        Box box = Box.createVerticalBox();
      
        gc.insets = new Insets(5,5,200,100);
        
        gc.gridx = 0;
        gc.gridy = 1;
        box.add(b1,gc);
        gc.gridx = 0;
        gc.gridy = 2;
        box.add(b2,gc);
        gc.gridx = 0;
        gc.gridy = 3;
        box.add(b3,gc);
        gc.gridx = 0;
        gc.gridy = 4;
        box.add(b4,gc);
        
        // Alignement textfield and label
        
        Box box2 = Box.createHorizontalBox();
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.insets = new Insets(250,10,10,10);
        
        JLabel L = new JLabel(" L'option choisi est : ");
        JTextField tf = new JTextField("LFI",20);
        box2.add(L);
        box2.add(tf);
        gc1.gridx = 1;
        gc1.gridy = 4;
        
        // Changement du textfield
        b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(b1.isSelected())
        		{
        			tf.setText(" LFI ");
        		}
        	}
        });
        
        b2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(b2.isSelected())
        		{
        			tf.setText(" LFM ");
        		}
        	}
        });
        
        b3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(b3.isSelected())
        		{
        			tf.setText(" LFP ");
        		}
        	}
        });
        
        b4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		if(b4.isSelected())
        		{
        			tf.setText(" LFC3 ");
        		}
        	}
        });
        
        
        P2.add(box,gc);
        P2.add(box2,gc1);
        
        return (P2);
    }
    
    public final JPanel Panel_Nom_Etudiant() // Creation du Panel " Nom "
    {
    	P3= new JPanel(new GridBagLayout());
    	P3.setBackground(new Color(204,255,153));
    	
    	// Zone de recherche
    	
    	Box b1 = Box.createVerticalBox();
        GridBagConstraints g1 = new GridBagConstraints();
        //g1.insets = new Insets(5,5,5,500);
        
    	JLabel recherche = new JLabel(" Recherche ");
    	recherche.setFont(new Font(" Time new romain", Font.BOLD, 12));
    	JTextField tex = new JTextField(13);
    	
    	g1.gridx = 0;
    	g1.gridy = 5;
    	b1.add(recherche,g1);
    	g1.gridx = 0;
    	g1.gridy = 8;
    	b1.add(tex, g1);
    	
    	// Etudiant Info
    	
    	Box b2 = Box.createVerticalBox();
    	JLabel info = new JLabel(" Etudiant info ");
    	info.setFont(new Font(" Time new romain", Font.BOLD, 12));
    	
    	Box b21 = Box.createHorizontalBox();
    	JLabel cin = new JLabel(" CIN ");
    	JTextField Cin = new JTextField(13);
    	b21.setBounds(100, 100, 50, 50);
    	b21.add(cin); b21.add(Cin);
    	
    	Box b22 = Box.createHorizontalBox();
    	JLabel nom = new JLabel(" Nom ");
    	JTextField Nom = new JTextField(13);
    	b22.setBounds(100, 100, 50, 50);
    	b22.add(nom); b22.add(Nom);
    	
    	Box b23 = Box.createHorizontalBox();
    	JLabel Prn = new JLabel(" Prenom ");
    	JTextField prn = new JTextField(13);
    	b23.setBounds(100, 100, 50, 50);
    	b23.add(Prn); b23.add(prn);
    	
    	Box b24 = Box.createHorizontalBox();
    	JLabel age = new JLabel(" Age ");
    	JTextField Age = new JTextField(13);
    	b24.add(age); b24.add(Age);
    	
    	Box b25 = Box.createHorizontalBox();
    	JLabel date = new JLabel(" Date ");
    	//JDateChooser dc = new JDataChooser();
    	
    	
    	
    	Box B = Box.createVerticalBox();
    	
    	B.add(b2);
    	B.add(b21);
    	B.add(b22);
    	B.add(b23);
    	B.add(b24);
    	
    	// Creation des boutons 
    	
    	// Creation du tableau
    	
    	//	setLayout(new FlowLayout());
    	Object [][] data  = {
    			{"10","Mohammed","Amin","22","03/03/1993"},
    			{"20","Walid","Fahmi","25","06/07/1990"},
    			{"30","Sami","Troudi","30","02/11/1994"},
    	};
    	
    	String [] Culomn  = {" Cin ", " Nom ", " Prenom ", " Age ", " Date "};
    	
    	JTable tab = new JTable(data, Culomn);
    	tab.setPreferredScrollableViewportSize(new Dimension(400,50));
    	tab.setFillsViewportHeight(true);
    	tab.setBounds(30,40,200,200);
    	JScrollPane Sp = new JScrollPane(tab);
    	Sp.setAlignmentX(0);
    	Sp.setAlignmentY(5);
    	g1.gridx = 3;
    	g1.gridy = 0;
    	P3.add(B,g1);
    	g1.gridx = 4;
    	g1.gridy = 0;
    	P3.add(b1,g1);
    	g1.gridx = 5;
    	g1.gridy = 0;
    	P3.add(B,g1);
    	g1.gridx = 6;
    	g1.gridy = 0;
    	P3.add(Sp);
    	
    	return (P3);
    }
    
    public final JTabbedPane getTabbed() // Retourne l'ensemble de Panels existant dans le frame
    {
    	P1 = Panel_Niveau();
    	P2 = Panel_Section();
    	P3 = Panel_Nom_Etudiant();
    	
        JTabbedPane Tp = new JTabbedPane();
  
        Tp.add(" Niveau ",P1);
        Tp.add(" Section ",P2);
        Tp.add(" Nom ",P3);
        
        return (Tp);
    }
    
    public final JMenuBar getMenu() // Retourne la barre de menu 
    {
    	JTabbedPane j = getTabbed();
    	JMenuBar mb = new JMenuBar();
    	JMenu F = new JMenu(" Fichier "), B = new JMenu(" Basculer "), H = new JMenu(" Help "); 
    	JMenuItem Q = new JMenuItem(" Quitter"), Nv = new JMenuItem(" Niveau"), Sc = new JMenuItem(" Section "), Nm = new JMenuItem(" Nom");
    	
    	Nv.addActionListener(new ActionListener()
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					if(Nv.isSelected())
    					{
    						j.setSelectedIndex(0);
    					}
    				}
    			});
    		
    	F.add(B);F.add(Q); // Ajout des Menu Baasculer & Quitter
    	B.add(Nv);B.add(Sc); B.add(Nm); // ajout des items au Menu " Basculer "
    	
    	mb.add(F);
    	mb.add(H);
    	
    	return (mb);
    }
    
    public final void General_Frame() // Le frame general 
    {
    	
        window = new JFrame(" Inscription ");
        window.setSize(800, 420);
        
        TP = this.getTabbed();
        MB = this.getMenu();
        
    	 window.add(TP);
    	 window.setJMenuBar(MB);
         window.setVisible(true);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main( String [] args)
    {
          new Tp2().General_Frame();
    }
}