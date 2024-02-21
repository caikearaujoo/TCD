import java.time.LocalDate;
import java.time.LocalTime;


public class PesquisasHotel {
	
	private int numEstrelas;
	private int accPet;
	private int numQuartos;
	private LocalTime horaCheckin;
	private LocalTime horaCheckout;
	private String cidade;
	private String tipoQuarto;
	private LocalTime horaPesquisa;
	private LocalDate dataPesquisa;
	
	public PesquisasHotel(int numEstrelas,int accPet,int numQuartos,String cidade,int hCheckin,int minCheckin,int hCheckout,int minCheckout) {
		
		setNumEstrelas(numEstrelas);
		setAccPet(accPet);
		setNumQuartos(numQuartos);
		setCidade(cidade);
		setHoraCheckin(hCheckin,minCheckin,0);
		setHoraCheckout(hCheckout,minCheckout,0);
		setHoraPesquisa();
		setDataPesquisa();
	}
	

	
	public LocalTime getHoraPesquisa() {
		return horaPesquisa;
	}
	
	public void setHoraPesquisa() {
		this.horaPesquisa = LocalTime.now();
	}
	
	public LocalDate getDataPesquisa() {
		return dataPesquisa;
	}
	public void setDataPesquisa() { 
		this.dataPesquisa = LocalDate.now();
	}
	
	public LocalTime getHoraCheckin() {
		return horaCheckin;
	}

	public void setHoraCheckin(int hCheckin,int minCheckin,int segCheckin) {
		if((hCheckin<0) || (hCheckin>23)) {
			hCheckin = -1;
			minCheckin = -1;
			segCheckin = -1;
		}
		
		if((minCheckin<0) || (minCheckin>59)) {
			hCheckin = -1;
			minCheckin = -1;
			segCheckin = -1;
		}
		
		if((segCheckin<0) || (segCheckin>59)) {
			hCheckin = -1;
			minCheckin = -1;
			segCheckin = -1;
		}
		
		this.horaCheckin = LocalTime.of(hCheckin, minCheckin, segCheckin);
	}



	public LocalTime getHoraCheckout() {
		return horaCheckout;
	}



	public void setHoraCheckout(int hCheckout,int minCheckout,int segCheckout) {
		if((hCheckout<0) || (hCheckout>23)) {
			hCheckout = -1;
			minCheckout = -1;
			segCheckout = -1;
		}
		
		if((minCheckout<0) || (minCheckout>59)) {
			hCheckout = -1;
			minCheckout = -1;
			segCheckout = -1;
		}
		
		if((segCheckout<0) || (segCheckout>59)) {
			hCheckout = -1;
			minCheckout = -1;
			segCheckout = -1;
		}
		
		this.horaCheckout = LocalTime.of(hCheckout, minCheckout, segCheckout);
	}
	
	public int getNumEstrelas() {
		return numEstrelas;
	}

	public void setNumEstrelas(int numEstrelas) {
		if(numEstrelas>0 && numEstrelas<=5) this.numEstrelas = numEstrelas;
		else numEstrelas = -1;
	}



	public int getAccPet() {
		return accPet;
	}



	public void setAccPet(int accPet) {
		if(accPet == 0 || accPet == 1) this.accPet = accPet;
		else this.accPet = -1;
	}



	public int getNumQuartos() {
		return numQuartos;
	}



	public void setNumQuartos(int numQuartos) {
		if(numQuartos>0) this.numQuartos = numQuartos;
		else this.numQuartos = -1;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	
	public void setCidade(String cidade) {
		if (cidade != null && !cidade.isEmpty()) 
		{
			this.cidade = cidade;
		}
		else this.cidade = null;
	}
	public String getTipoQuarto() {
		return tipoQuarto;
	}




	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
}	