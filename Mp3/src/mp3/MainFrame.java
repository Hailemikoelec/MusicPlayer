package mp3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
<<<<<<< HEAD
=======
import javax.swing.JRadioButton;
>>>>>>> 270d3fe3717e3ec5e090687697ec025768e24687
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;

public class MainFrame extends JFrame  {
<<<<<<< HEAD
    JTextField insertbtn = new JTextField ("select music player");
	JButton playbtn = new JButton ("play");
	JButton loopbtn =new JButton ("loop");
	
        JButton closebtn=new JButton("close");
	JButton nextBtn = new JButton ("next");
        JButton prevBtn =new JButton("prev");
	PlayList playlist = new PlayList();
	public MainFrame () {
		
=======
  
	JButton playbtn = new JButton ("play");
	JRadioButton loopbtn =new JRadioButton ("loop");
        
	JButton insertbtn = new JButton ("insert");
        JButton closebtn=new JButton("close");
	JButton nextBtn = new JButton ("next");
        JButton prevBtn =new JButton("prev");
	PlayList playlist = new PlayList(loopbtn);
        boolean loop = true;
	public MainFrame () {
		loopbtn.setSelected(true);
>>>>>>> 270d3fe3717e3ec5e090687697ec025768e24687
		ImageIcon image = new ImageIcon("MainIcon.png");
		
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("mp3 player");	
		this.setIconImage(image.getImage());
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		JPanel panel1 = new JPanel();
	
		panel1.add(playbtn);
<<<<<<< HEAD
	
=======
>>>>>>> 270d3fe3717e3ec5e090687697ec025768e24687
		panel1.add(loopbtn);
		panel1.add(insertbtn);
		panel1.add(closebtn);
		panel1.add(nextBtn);
		panel1.add(prevBtn);
<<<<<<< HEAD
		panel1.setBounds(0,0,240,200);
                playbtn.setBackground(Color.yellow);
		
		
		this.add(panel1);
		   
		closebtn.addActionListener((e) -> {
                    
                });
		playbtn.addActionListener((e) -> {
                    try {
                        playlist.topEl();
=======
                
		panel1.setBounds(0,0, this.getWidth(),this.getHeight());
                panel1.setBackground(Color.GREEN);
                
                playbtn.setBackground(Color.yellow);
             
                loopbtn.setBackground(Color.blue);
                closebtn.setBackground(Color.orange);
                nextBtn.setBackground(Color.green);
                prevBtn.setBackground(Color.white);
		
		
		this.add(panel1); 
                
                
		closebtn.addActionListener((e) -> {
                    System.exit(0);
                });
		playbtn.addActionListener((e) -> {
                    try {
                        playlist.topEl(null);
>>>>>>> 270d3fe3717e3ec5e090687697ec025768e24687
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
<<<<<<< HEAD
		insertbtn.addActionListener((e) -> {
                    	JFileChooser fc = new JFileChooser();
			fc.setMultiSelectionEnabled(true);
                        
			FileNameExtensionFilter filter = new FileNameExtensionFilter( "mp3 & wav audio Files . ", "mp3", "wav");
			fc.setFileFilter(filter);
			fc.setPreferredSize(new Dimension(800,500));
			
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				File[] files = fc.getSelectedFiles();
				for(File file : files) {
				    String absolutePath = file.getAbsolutePath();
				   
				    playlist.addToEnd(absolutePath);
				   
				    
				}
				
			}
                });
                
		
                
		playbtn.setBackground(Color.WHITE);
               

                 
                loopbtn.setBackground(Color.GREEN);
                closebtn.setBackground(Color.GRAY);
                insertbtn.setBackground(Color.YELLOW);
                
	}
	
 	
}

=======
             
>>>>>>> 270d3fe3717e3ec5e090687697ec025768e24687
