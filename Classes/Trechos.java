
public class Trechos {
	
	private String cod;
	private String origem;
	private String destino;
	private int horSaida;
	private int minSaida;
	private int segSaida;
	private int horChegada;
	private int minChegada;
	private int segChegada;
	private String nomeCompA;
	
	public Trechos(String cod,String origem,String destino,int horSaida,int minSaida,int horChegada,int minChegada,String nomeCompA) {
		
		this.cod = cod;
		this.origem = origem;
		this.destino = destino;
		this.horSaida = horSaida;
		this.minSaida = minSaida;
		this.segSaida = 0;
		this.horChegada = horChegada;
		this.minChegada = minChegada;
		this.segChegada = 0;
		this.nomeCompA = nomeCompA;
		
		
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getHorSaida() {
		return horSaida;
	}

	public void setHorSaida(int horSaida) {
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

	public int getHorChegada() {
		return horChegada;
	}

	public void setHorChegada(int horChegada) {
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

	public String getNomeCompA() {
		return nomeCompA;
	}

	public void setNomeCompA(String nomeCompA) {
		this.nomeCompA = nomeCompA;
	}

	

}
