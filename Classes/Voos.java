
public class Voos {
	
	private int diaVoo;
	private int mesVoo;
	private int anoVoo;
	private int horSaida;
	private int minSaida;
	private int segSaida;
	private int horChegada;
	private int minChegada;
	private int segChegada;
	private int vagas;
	private double preco;
	private String evento;
	
	public Voos(int diaVoo,int mesVoo,int anoVoo,int horSaida,int minSaida,int horChegada,int minChegada,int vagas,double preco,String evento) {
		
		this.diaVoo = diaVoo;
		this.mesVoo = mesVoo;
		this.anoVoo = anoVoo;
		this.horSaida = horSaida;
		this.minSaida = minSaida;
		this.segSaida = 0;
		this.horChegada = horChegada;
		this.minChegada = minChegada;
		this.segChegada = 0;
		this.vagas = vagas;
		this.preco = preco;
		this.evento = evento;
		
	}
	public int getDiaVoo() {
		return diaVoo;
	}
	public void setDiaVoo(int diaVoo) {
		this.diaVoo = diaVoo;
	}
	public int getMesVoo() {
		return mesVoo;
	}
	public void setMesVoo(int mesVoo) {
		this.mesVoo = mesVoo;
	}
	public int getAnoVoo() {
		return anoVoo;
	}
	public void setAnoVoo(int anoVoo) {
		this.anoVoo = anoVoo;
	}
	public int getHoraSaida() {
		return horSaida;
	}
	public void setHoraSaida(int horSaida) {
		this.horSaida = horSaida;
	}
	public int getMinSaida() {
		return minSaida;
	}
	public void setMinSaida(int minSaida) {
		this.minSaida = minSaida;
	}
	public int getSegSaida() {
		return segSaida;
	}
	public void setSegSaida(int segSaida) {
		this.segSaida = segSaida;
	}
	public int getHoraChegada() {
		return horChegada;
	}
	public void setHoraChegada(int horChegada) {
		this.horChegada = horChegada;
	}
	public int getMinChegada() {
		return minChegada;
	}
	public void setMinChegada(int minChegada) {
		this.minChegada = minChegada;
	}
	public int getSegChegada() {
		return segChegada;
	}
	public void setSegChegada(int segChegada) {
		this.segChegada = segChegada;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	

}
