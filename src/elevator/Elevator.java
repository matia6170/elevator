package elevator;

import javax.swing.JPanel;

import building.DrawBuilding;
import building.supportMethods;

public class Elevator extends JPanel{
	
	public int numFloors = 5, curFloor = 1;
	public boolean fireAlarm = false;
	public	boolean open = false;
	public boolean down = false,openDoor = false;
	public int  floorDiff = 188, elvFloor=4,x = 0, y=Math.abs(floorDiff*(6-5-1)-20),velx=2,vely=4,toWhichFloor=5;
	
	public Elevator(){
		
		numFloors = 5;
		curFloor = 1;
		fireAlarm = false;
		//openDoor = false;
	}
	
	public int getCurFloor() {
		return curFloor;
	}
	
	public int getNumFloor() {
		return numFloors;
	}
	
	public boolean isFireAlarmOn() {
		
		return fireAlarm;
	}
	
	public boolean isDoorOpen() {
		return openDoor;
	}
	
	public void gotoFloor(int f) {
		openDoor();
		closeDoor();
		if(f>numFloors) {
			
		}else{
			curFloor = f;
		}
		openDoor();
	}
	
	public void fireAlarm() {
		fireAlarm = true;
		gotoFloor(1);
		openDoor();
	}
	
	public void openDoor() {
		openDoor = true;
		
		
	}
	
	public void closeDoor() {
		openDoor = false;
	}
	
	public void status() {
		System.out.printf("Current Floor: %d, Number of Floors: %d\nFireAlarm: %b, DoorOpen: %b\n", getCurFloor(), getNumFloor(), isFireAlarmOn(), isDoorOpen());
		
	}
	



}
