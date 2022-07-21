package szakdolgozat.gui;

public class Projekt {

	private int projektId;
	private int indulasi_muv_ido;
	private int befejezesi_muv_ido;
	private int eroforras;
	
	
		
	public Projekt(int projektId, int indulasi_muv_ido, int befejezesi_muv_ido, int eroforras) {
		super();
		this.projektId = projektId;
		this.indulasi_muv_ido = indulasi_muv_ido;
		this.befejezesi_muv_ido = befejezesi_muv_ido;
		this.eroforras = eroforras;
	}
	
	
	


	public int getProjektId() {
		return projektId;
	}
	public void setProjektId(int projektId) {
		this.projektId = projektId;
	}
	public int getIndulasi_muv_ido() {
		return indulasi_muv_ido;
	}
	public void setIndulasi_muv_ido(int indulasi_muv_ido) {
		this.indulasi_muv_ido = indulasi_muv_ido;
	}
	public int getBefejezesi_muv_ido() {
		return befejezesi_muv_ido;
	}
	public void setBefejezesi_muv_ido(int befejezesi_muv_ido) {
		this.befejezesi_muv_ido = befejezesi_muv_ido;
	}
	public int getEroforras() {
		return eroforras;
	}
	public void setEroforras(int eroforras) {
		this.eroforras = eroforras;
	}
	
	
	
}
