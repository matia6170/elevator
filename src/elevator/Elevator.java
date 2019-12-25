package elevator;

import building.DrawBuilding;

public class Elevator extends DrawBuilding{
	
	
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
	


	public static void main(String[] args) {
		Elevator e = new Elevator();
		
		e.status();
		e.gotoFloor(3);
		e.status();
		e.fireAlarm();
		e.status();
		
		
	}
}
