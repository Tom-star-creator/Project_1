import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
public class WordGUI2 extends JFrame{
 
	JTextArea masterArea;
	JTextArea validArea; 
	JTextArea invalidArea;


	public WordGUI2() {
		  
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(500,500);
	        this.setLocation(200,200);
	        this.setLayout(new GridLayout(1,3)); //Makes JFrame a GridLayout
	       
	        masterArea = new JTextArea(20,20);
	        validArea = new JTextArea(20,20);
	        invalidArea = new JTextArea(20,20);	      
	        
	        JScrollPane scrollPane1 = new JScrollPane(masterArea); //lets you scroll down
	        JScrollPane scrollPane2 = new JScrollPane(validArea);
	        JScrollPane scrollPane3 = new JScrollPane(invalidArea);
	        
	        scrollPane1.setViewportView(masterArea); //component any JavaSwing component a.k.a. textarea
	        scrollPane2.setViewportView(validArea);
	        scrollPane3.setViewportView(invalidArea);
	        
	        this.getContentPane().add(scrollPane1);
	        this.getContentPane().add(scrollPane2);
	        this.getContentPane().add(scrollPane3);
	        
	        this.add(scrollPane1);
	        this.add(scrollPane2);
	        this.add(scrollPane3);
	       
	        this.setVisible(true);
	        
	        
	        }
	public void addToMasterArea(String str) {
		masterArea.append(str);
	}
	public void addToValid(String str) {
		validArea.append(str); 
	}
	public void addToInvalid(String str) {
		invalidArea.append(str); 
	}
	
}


