package building;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.JToggleButton;

public class UI extends JPanel{

	boolean doorOpen = false;
	
	
	public int toWhichFloor;
	
	public UI() {
		// TODO Auto-generated constructor stub
	}
	
public void createButtons() {
	JToggleButton doorButton = new JToggleButton("Door");

	
	doorButton.addItemListener(new ItemListener() {
	    public void itemStateChanged(ItemEvent itemEvent) {
	        int state = itemEvent.getStateChange();
	        if (state == ItemEvent.SELECTED) {
	            System.out.println("Selected"); // show your message here
	            doorOpen = true;
	            
	        } else {
	            System.out.println("Deselected"); // remove your message
	            doorOpen = false;
	        }
	    }
	});
	doorButton.setBounds(10, 190, 110, 50);
	add(doorButton);
	
	
	JButton button1 = new JButton("1");
	button1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			toWhichFloor = 1;
			System.out.println(toWhichFloor + " pressed");
        }  
    });  
	button1.setBounds(70, 10, 50, 50);
	button1.repaint();
	add(button1);
	
	JButton button2 = new JButton("2");
	button2.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			toWhichFloor = 2;
			System.out.println(toWhichFloor + " pressed");
        }  
    });  
	button2.setBounds(10, 70, 50, 50);
	button2.repaint();
	add(button2);
	
	JButton button3 = new JButton("3");
	button3.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			toWhichFloor = 3;
			System.out.println(toWhichFloor + " pressed");
        }  
    });  
	button3.setBounds(70, 70, 50, 50);
	button3.repaint();
	add(button3);
	
	JButton button4 = new JButton("4");
	button4.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			toWhichFloor = 4;
			System.out.println(toWhichFloor + " pressed");
        }  
    });  
	button4.setBounds(10, 130, 50, 50);
	button4.repaint();
	add(button4);
	
	JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 5;
				System.out.println(toWhichFloor + " pressed");
	        }  
	    });  
		button5.setBounds(70, 130, 50, 50);
		button5.repaint();
		add(button5);
		
	}


	
	

}
