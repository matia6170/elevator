package building;

import javax.swing.JPanel;

public class supportMethods extends JPanel{
	
	public static int numFloors = 5, curFloor = 1;
	public boolean fireAlarm = false;
	public	boolean open = false;
	public boolean down = false,openDoor = true;
	public int x = 0, y=0,velx=2,vely=4, floorDiff = 188, elvFloor=4;
	
	public void gotoFloorFromTopToBottom(int x) {
		down = false;
	
		if(floorCheck(y,getLevelVal(x))) {
			vely=0;
			//System.out.println("col");
		}
	}
	
	public void gotoFloorFromBottomToTop(int x) {
		down = true;
	
		if(floorCheck(y,getLevelVal(x))) {
			vely=0;
			//System.out.println("col");
		}
	}
	
	private boolean floorCheck(int x, int y) {
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
	
	protected int getLevelVal(int x) {
		int retVal = 0;
		for(int i = 1; i<=x; i++) {
			retVal = 188*(i-1)+20;
		}
		
		return retVal;
		
	}
}
