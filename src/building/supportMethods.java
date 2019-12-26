package building;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.*;  
import javax.swing.*;    

import elevator.Elevator;

public class supportMethods extends Elevator{
	
	JToggleButton doorButton = new JToggleButton("Door");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	
	
	
	public int flipFloor(int x) {
		return 6-x;
	}
	
	

	public int getCurrentFloorLive() {
		
			if(floorCheck(y,getLevelVal(1))) {
				curFloor = 1;
			}else if(floorCheck(y,getLevelVal(2))) {
				curFloor = 2;
			}else if(floorCheck(y,getLevelVal(3))) {
				curFloor = 3;
			}else if(floorCheck(y,getLevelVal(4))) {
				curFloor = 4;
			}else if(floorCheck(y,getLevelVal(5))) {
				curFloor = 5;
			}
			
			return flipFloor(curFloor);
		
	}
	
	public void gotoFloorFromTopToBottom(int x) {
		down = false;
		x = flipFloor(x);
	
		if(floorCheck(y,getLevelVal(x))) {
			vely=0;
			
			//System.out.println("col");
		}
	}
	
	public void gotoFloorFromBottomToTop(int x) {
		down = true;
		x = flipFloor(x);
	
		if(floorCheck(y,getLevelVal(x))) {
			vely=0;
			//System.out.println("col");
		}
	}
	
	public boolean floorCheck(int x, int y) {
		boolean retVal = false;
		for(int i=0;i<5;i++) {
			if((x+=i)==y) { 
				retVal = true;
				break;
			}else {
				retVal = false;
				break;
			}
				
		}
		return retVal;
	}
	
	int map(int x, int in_min, int in_max, int out_min, int out_max)
	{
	  return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
	}
	
	public int getLevelVal(int x) {
		int retVal = 0;
		for(int i = 1; i<=x; i++) {
			retVal = 188*(i-1)+20;
		}
		
		return retVal;
		
	}
	

	
	public JToggleButton createDoorButton() {
		
		//ItemListener itemListener = 
		doorButton.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent itemEvent) {
		        int state = itemEvent.getStateChange();
		        if (state == ItemEvent.SELECTED) {
		            System.out.println("Selected"); // show your message here
		            openDoor();
		            
		        } else {
		            System.out.println("Deselected"); // remove your message
		            closeDoor();
		        }
		    }
		});
		doorButton.setBounds(500, 100, 70, 70);
		
		return doorButton;
	}
	public JButton createOneButton() {
		
		button1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 1;
				System.out.println("goint to first floor");
	        }  
	    });  
		button1.setBounds(500, 200, 70, 70);
		button1.repaint();
		return button1;
	}
	public JButton createTwoButton() {
		button2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 2;
	        }  
	    });  
		button2.setBounds(500, 300, 70, 70);
		
		
		return button2;
	}
	public JButton createThreeButton() {
		button3.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 3;
	        }  
	    });  
		button3.setBounds(500, 400, 70, 70);
		button3.repaint();
		return button3;
	}
	public JButton createFourButton() {
		
		button4.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 4;
	        }  
	    });  
		button4.setBounds(500, 500, 70, 70);
		button4.repaint();
		return button4;
	}
	public JButton createFiveButton() {
		
		button5.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 5;
	        }  
	    });  
		button5.setBounds(500, 600, 70, 70);
		button5.repaint();
		return button5;
	}
	ArrayList<JLabel> floorLabel = new ArrayList<JLabel>();	
	public void levelLabel() {
		for(int i = 1; i<=5;i++) {
			floorLabel.add(new JLabel(Integer.toString(i)));
		}
		for(int i = 1; i<=5;i++) {
			floorLabel.get(i).setBounds(100, 100, 50, 50);
		}
		
	}
	
}
