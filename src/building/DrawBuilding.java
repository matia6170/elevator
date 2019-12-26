package building;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.*;

import elevator.Elevator;

public class DrawBuilding extends supportMethods implements ActionListener {

	
	
	Timer t = new Timer(33,this);
	
	

	private JLabel l = new JLabel("0");
	
    private Rectangle rect = new Rectangle(0, 0, 200, 30);
  
	private ColouredRectangle label= new ColouredRectangle("LABEL 1");
	
	JButton testButton = new JButton("test");
	
	public void paintComponent(Graphics g) {
		
		
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		Color oldC = g2.getColor();
	
		add(label);
		//elevator
		g2.setColor(new Color(26367));
		Stroke oldStroke = g2.getStroke();
		g2.setStroke(new BasicStroke(10));
		/*
		g2.drawRect(105, floorDiff-168+5, 90, 158);
		g2.drawRect(105, floorDiff*2-168+4, 90, 158);
		g2.drawRect(105, floorDiff*3-168+4, 90, 158);
		g2.drawRect(105, floorDiff*4-168+4, 90, 158);
		g2.drawRect(105, floorDiff*5-168+4, 90, 158);
		*/
		//elevator
		
		Rectangle e = new Rectangle(100,y, 100, 168);
		g2.draw(e);
		//elevator doors
		g2.setStroke(oldStroke);
		Rectangle eDoorL = new Rectangle(100-x,y, 50, 168);
		Rectangle eDoorR = new Rectangle(150+x,y, 50, 168);
		g2.setColor(new Color(13421772));
		g2.draw(eDoorL);
		g2.draw(eDoorR);
		g2.fill(eDoorL);
		g2.fill(eDoorR);

		
		
		//elevator door outline
		g2.setColor(new Color(0));
		Rectangle eDoorL2 = new Rectangle(100-x,y, 50, 167);
		Rectangle eDoorR2 = new Rectangle(150+x,y, 49, 167);
		g2.draw(eDoorL2);
		g2.draw(eDoorR2);
		
		//building
		g2.setColor(Color.GRAY);
		g2.fillRect(0,0,400,20);
		g2.fillRect(400,0,20,1000);
		g2.fillRect(0,0,20,1000);
		g2.fillRect(20, 940, 380, 30);
		
		
		//elevator shaft
		g2.setColor(new Color(10132122));
		
		g2.fillRect(20, 20, 80, 920);
		g2.fillRect(200, 20, 200, 920);
		
		//level
		g2.setColor(new Color(7637440));
		g2.fillRect(20, floorDiff, 380, 20);
		g2.fillRect(20, floorDiff*2, 380, 20);
		g2.fillRect(20, floorDiff*3, 380, 20);
		g2.fillRect(20, floorDiff*4, 380, 20);
		
		//g.fillRect(500, 961, 10, 10);
		
		//label	
		g2.setColor(new Color(1));
		
		g2.fillRect(x, y, 40, 40);
		
		
		
		
		testButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				toWhichFloor = 3;
	        }  
	    });  
		testButton.setBounds(200,200,50,50);
		add(testButton);
		
		l.setBounds(300, 62, 540, 21);
		 l.setOpaque(true);
	        
		add(l);
		add(createDoorButton());
		add(createOneButton());
		add(createTwoButton());
		add(createThreeButton());
		add(createFourButton());
		add(createFiveButton());
		
		setVisible(true);
		t.start();
	}
	
	//update
	

	public void actionPerformed(ActionEvent e) {

		if(isDoorOpen()&&x<=51) {
				x+=1;
		}else if(!isDoorOpen()&&x>0) {
			x--;
		}
		
		
			y+=vely;
		
		l.setText("y: " + Integer.toString(y) + ", original:" + Integer.toString(curFloor) + ", converted:" + Integer.toString(flipFloor(curFloor)));
		label.label.setText(Integer.toString(y));
		
		if(getCurrentFloorLive()>toWhichFloor) {
			vely = 4;
			gotoFloorFromTopToBottom(toWhichFloor);
		}else if(getCurrentFloorLive()<toWhichFloor) {
			vely=-4;
			gotoFloorFromBottomToTop(toWhichFloor);
		}else if(getCurrentFloorLive()==toWhichFloor) {
			vely=0;
		}
		
		getCurrentFloorLive();
		
	//	System.out.println(getLevelVal(1));
		repaint();
		validate();
		setVisible(true);
	}


}

class ColouredRectangle extends JPanel
{

    private String text;

    JLabel label;

    public ColouredRectangle(String text
                                     )
    {
       
        this.text = text;
       

        label = new JLabel(this.text);
        label.setOpaque(false);
       

        add(label);
    }

  
}
	