package propspector;

public class bedroom extends room {
	/**
	 * auto-generated serialVersionUID
	 */
	private static final long serialVersionUID = 8352431079062586940L;
	private boolean walkInCloset;
	private int closetSqFoot;
	
	public bedroom(){
		roomName = "Bedroom";
		walkInCloset = false;
		closetSqFoot = 6;
	}
	
	public bedroom(String name, int sqf, boolean walkin, int csqf){
		roomName = name;
		walkInCloset = walkin;
		closetSqFoot = csqf;
		sqFoot = sqf;
	}
	
	public bedroom(String name){
		roomName = name;
		walkInCloset = false;
		closetSqFoot = 6;
	}
	
	public boolean isWalkIn(){
		return walkInCloset;
	}
	
	public boolean setWalkIn(boolean walk){
		walkInCloset = walk;
		return walkInCloset;
	}
	
	public int getClosetSqft(){
		return closetSqFoot;
	}
	
	public int setClosetSqft(int size){
		closetSqFoot = size;
		return closetSqFoot;
	}
	
	public String Summarize(){
		String sum = (roomName + ": "+sqFoot+" sq ft, with "+closetSqFoot+" sq ft"
				+(walkInCloset ? "walk-in closet, " : "standard closet, ")+outletCount+" outlets, "
				+windowCount+" windows - "+listConditions());
		return sum;
	}
}

