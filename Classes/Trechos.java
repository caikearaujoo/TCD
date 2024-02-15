import java.time.LocalTime;

public class Trechos {
	
	private String cod; // Do tipo XXX-00000
	private String origem;
	private String destino;
	private LocalTime horaSaida;
	private LocalTime horaChegada;
	private CompanhiaAerea nomeCompA; //Associa trecho a companhia de forma direta :)
	private Voos[] voos; //Voo específico do trecho
	private int contadorVoos;
	
	public Trechos(String cod,String origem,String destino,LocalTime horaSaida,LocalTime horaChegada,CompanhiaAerea nomeCompA) {
		
		setCod(cod);
		setOrigem(origem);
		setDestino(destino);
		setHoraSaida(horaSaida);
		setHoraChegada(horaChegada);
		setNomeCompA(nomeCompA);
		setVoo(); //Cria vetor de voos	
	}
	
	public void setVoo(){
		this.voos = new Voos[30];
		this.contadorVoos = 0;
	}

	public Voos getVoo(int i) {
		return voos[i];
	}

	public void addVoo(Voos voo) {
		voos[contadorVoos] = voo;
		contadorVoos++;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		
		int caractereV;
		int flag = 0;
		
		if(cod.length()>8) {
			flag = 1;
		}
		
		for(int i=0 ; i<4 ;i++) {
			caractereV = cod.charAt(i);
			
			if(Character.isLetter(caractereV) != true) {
				flag = 1;
				break;
			}
		}
		
		for(int i = 4; i<cod.length() ;i++) {
			
			caractereV = cod.charAt(i);
			
			if(Character.isDigit(caractereV)!=true) {
				flag = 1;
			} 
		}
		
		if(flag == 0) {
			this.cod = cod;
		} else {
			this.cod = null;
		}
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

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public LocalTime getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(LocalTime horaChegada) {
		this.horaChegada = horaChegada;
	}

	public CompanhiaAerea getNomeCompA() {
		return nomeCompA;
	}

	public void setNomeCompA(CompanhiaAerea nomeCompA) {
		this.nomeCompA = nomeCompA;
	}

	
}
