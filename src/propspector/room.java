//Eric Downie
package propspector;

import java.io.Serializable;
import java.util.ArrayList;

public class room implements RealEstate, Serializable {
/**
	 * auto-generated serialVersionUID
	 */
	private static final long serialVersionUID = -6863105901208620337L;
protected String roomName = new String();
protected int sqFoot;
protected int windowCount = 1;
protected int outletCount = 1;

protected ArrayList<InteriorCondition> conditions = new ArrayList<InteriorCondition>();

	public room(){
		sqFoot = 100;
		roomName = "Room";
		windowCount = 0;
		outletCount = 0;
	}
	
	public room(String name){
		sqFoot = 100;
		roomName = name;
		windowCount = 0;
		outletCount = 0;
	}
	
	public room(String name, int sqF, int winC, int outC){
		roomName = name;
		sqFoot = sqF;
		windowCount = winC;
		outletCount = outC;
	}
	
	public int squareFootage() {
		return sqFoot;
	}
	
	public int setSquareFootage(int sqf){
		sqFoot = sqf;
		return sqFoot;
	}

	public String getName() {
		return roomName;
	}
	
	public String setName(String str) {
		roomName = str;
		return roomName;
	}

	public String Summarize() {
		String sum = (roomName + ": "+sqFoot+" sq ft, "+outletCount+" outlets, "+windowCount
				+" windows - "+listConditions());
		return sum;
	}

	public String listConditions() {
		
		return conditions.toString();
	}

	public String subCount() {
		return (sqFoot+" sq ft, "+outletCount+" outlets, "+windowCount+" windows, "+conditions.size()+" conditions.");
	}
	
	public String addCondition(String str) {
		conditions.add(new InteriorCondition(str));
		return str;
	}
	
	public String toString() {
		return(roomName+": "+subCount());
	}

	@Override
	public void setcond(String cond) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public String getcond() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
