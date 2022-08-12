package szakdolgozat.gui;

public class ManufactoringSystem {
	public int id; //azonosíto
	public int[] ProcT; //
	public int[] SartT; //indítási idõ
	public int[] EndT; //befejezsi ido
	public int date; //hatarido
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getProcT() {
		return ProcT;
	}
	public void setProcT(int[] procT) {
		ProcT = procT;
	}
	public int[] getSartT() {
		return SartT;
	}
	public void setSartT(int[] sartT) {
		SartT = sartT;
	}
	public int[] getEndT() {
		return EndT;
	}
	public void setEndT(int[] endT) {
		EndT = endT;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
public void create_and_load_job_data(int NJ, int NR)	{
	
	ManufactoringSystem man = new ManufactoringSystem();
	int i;
	int r;
	
	for(i=0; i<NJ; i++) {
		man[i].id=i;
		for(r=0; r<NR;r++) {
			man[i].ProcT[r] = 1 +rand()%100		
					}
	}
}
	
}
