package building;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import elevator.Elevator;

public class BuildingSetup{
	
	static GraphicsConfiguration gc;
	public static JFrame f = new JFrame(gc);
	
	public static void main(String[] args) {
		
		DrawBuilding s = new DrawBuilding();
	//	Elevator elv = new Elevator();
		
		
		
		s.setSize(420, 1000);
		f.add(s);
		
		/*
		JPanel p = new JPanel();
		JLabel l = new JLabel("ree");
		l.setBounds(101, 62, 54, 21);
		p.setBounds(420, 0, 180, 1000);
		p.add(l);
		f.add(p);
		*/
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600,1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("moving box");
	}

	
}
