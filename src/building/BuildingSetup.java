package building;


import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import elevator.Elevator;

public class BuildingSetup extends DrawBuilding{
	
	static GraphicsConfiguration gc;
	
	
	public void start() {
		DrawBuilding s = new DrawBuilding();
		//	Elevator elv = new Elevator();
			
			
			
			
			 JFrame f = new JFrame(gc);

			/*
			JPanel p = new JPanel();
			JLabel l = new JLabel("ree");
			l.setBounds(101, 62, 54, 21);
			p.setBounds(420, 0, 180, 1000);
			p.add(l);
			f.add(p);
			*/
			
			//f.setMinimumSize(new Dimension(600, 1000));
			f.setLayout(null);
			f.setVisible(true);
			f.pack();
			 f.setLocationRelativeTo(null);
			f.setSize(600,1000);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setTitle("elevator");
			f.setLocation(0, 0);
			f.setVisible(true);
		
			
			
			
			//uiMannager.setSize(180, 1000);
			//uiMannager.setLocation(420, 0);
			//uiMannager.createButtons();
			//uiMannager.setLayout(null);
			//f.add(uiMannager);
			//DrawBuilding.restasdads = 0;
			s.setLayout(null);
			s.setSize(600, 1000);
			f.add(s);
	}
	
	public static void main(String[] args) {
		BuildingSetup bs = new BuildingSetup() ;
bs.start();
		
	}
	
	

	
}
