package szakdolgozat.gui;

public class Workstation {
	TimeWindow TW= new TimeWindow();
	
	public int gepID;
	public int[] TransT; //anyagmozgatasi ido
	public int[][] SetT; //atallasi ido
	public int NCal; // intervallumok szama
	public int ET;
	public int ST;
	
	//kell a TimeWindow ST ET
	public int getGepID() {
		return gepID;
	}
	public void setGepID(int gepID) {
		this.gepID = gepID;
	}
	public int[] getTransT() {
		return TransT;
	}
	public void setTransT(int[] transT) {
		TransT = transT;
	}
	public int[][] getSetT() {
		return SetT;
	}
	public void setSetT(int[][] setT) {
		SetT = setT;
	}
	public int getNCal() {
		return NCal;
	}
	public void setNCal(int nCal) {
		NCal = nCal;
	}
	
	

}
