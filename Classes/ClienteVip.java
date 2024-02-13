package udidecola;

public class ClienteVip extends Cliente{
	private double descontoVip;
	private int diaVip;
	private int mesVip;
	private int anoVip;
	
	public double getDescontoVip() {
		return descontoVip;
	}
	public void setDescontoVip(double descontoVip) {
		this.descontoVip = descontoVip;
	}
	
	public int getDiaVip() {
		return diaVip;
	}
	public void setDiaVip(int diaVip) {
		this.diaVip = diaVip;
	}
	
	public int getMesVip() {
		return mesVip;
	}
	public void setMesVip(int mesVip) {
		this.mesVip = mesVip;
	}
	
	public int getAnoVip() {
		return anoVip;
	}
	public void setAnoVip(int anoVip) {
		this.anoVip = anoVip;
	}

	// métodos
}
