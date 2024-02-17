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
	
	public Trechos(String cod,String origem,String destino,int hSaida,int minSaida,int segSaida,int hChegada,int minChegada,int segChegada,CompanhiaAerea nomeCompA) {
		
		setCod(cod);
		setOrigem(origem);
		setDestino(destino);
		setHoraSaida(hSaida,minSaida,segSaida);
		setHoraChegada(hChegada,minChegada,segChegada);
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

	public void setHoraSaida(int hSaida,int minSaida,int segSaida) {
		if((hSaida<0) || (hSaida>23)) {
			hSaida = -1;
			minSaida = -1;
			segSaida = -1;
		}
		
		if((minSaida<0) || (minSaida>59)) {
			hSaida = -1;
			minSaida = -1;
			segSaida = -1;
		}
		
		if((segSaida<0) || (segSaida>59)) {
			hSaida = -1;
			minSaida = -1;
			segSaida = -1;
		}
		
		if((hSaida != -1) && (minSaida!= -1) && (segSaida != -1)) {
        	this.horaSaida = LocalTime.of(hSaida, minSaida, segSaida);
        }
		
		
	}

	public LocalTime getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int hChegada,int minChegada,int segChegada) {
		if((hChegada<0) || (hChegada>23)) {
			hChegada = -1;
			minChegada = -1;
			segChegada = -1;
		}
		
		if((minChegada<0) || (minChegada>59)) {
			hChegada = -1;
			minChegada = -1;
			segChegada = -1;
		}
		
		if((segChegada<0) || (segChegada>59)) {
			hChegada = -1;
			minChegada = -1;
			segChegada = -1;
		}
		
		if((hChegada != -1) && (minChegada!= -1) && (segChegada != -1)) {
        	this.horaChegada = LocalTime.of(hChegada, minChegada, segChegada);
        }
	}

	public CompanhiaAerea getNomeCompA() {
		return nomeCompA;
	}

	public void setNomeCompA(CompanhiaAerea nomeCompA) {
		this.nomeCompA = nomeCompA;
	}

	
}
