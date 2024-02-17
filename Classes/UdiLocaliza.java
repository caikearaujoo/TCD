import java.time.LocalTime;
import java.util.Date;
import java.util.ArrayList;

class UdiLocaliza extends Empresa {
    public UdiLocaliza(String CNPJ, String nome, String nomeDivulg, String endLogradouro, int diaCria, int mesCria,
			int anoCria, int endNumero, String endBairro, String endCidade, String endUf, String endCep) {
		super(CNPJ, nome, nomeDivulg, endLogradouro, diaCria, mesCria, anoCria, endNumero, endBairro, endCidade, endUf, endCep);
		carros = new ArrayList<>();
	}

	private ArrayList<Carros> carros;
    
    
    
    public void adicionarCarro(Carros carro) {
        carros.add(carro);
    }

    public void removerCarro(Carros carro) {
        carros.remove(carro);
    }

    public ArrayList<Carros> getCarros() {
        return carros;
    }
    
    
}
