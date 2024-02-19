
import java.time.LocalTime;
import java.time.LocalDate;

 class Pesquisas extends Trechos {
	 //A ideia é criar um array list de pesquisas dentro de Cliente, para armazenar tudo que cada cliente pesquisar,
	 //como criar e setar isso, descobriremos;
	 
	 private LocalTime horaPesquisa;
	 private LocalDate dataPesquisa;

	 public Pesquisas(String cod, String origem, String destino, int hSaida, int minSaida, int segSaida, int hChegada,
			int minChegada, int segChegada, CompanhiaAerea nomeCompA) {
		super(cod, origem, destino, hSaida, minSaida, segSaida, hChegada, minChegada, segChegada, nomeCompA);
		setHoraPesquisa();  //Setar o horário exato da pesquisa
		setDataPesquisa();//Setar a data exato da pesquisa

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
	

	
}
