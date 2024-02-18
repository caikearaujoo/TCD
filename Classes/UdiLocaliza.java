package tcd;

import java.util.ArrayList;

class UdiLocaliza extends Empresa {
	
	private ArrayList<Carros> carros;
	private ArrayList<Funcionario> funcionarios;
	
    public UdiLocaliza(String CNPJ, String nome, String nomeDivulg, String endLogradouro, int diaCria, int mesCria,
			int anoCria, int endNumero, String endBairro, String endCidade, String endUf, String endCep) {
		super(CNPJ, nome, nomeDivulg, endLogradouro, diaCria, mesCria, anoCria, endNumero, endBairro, endCidade, endUf, endCep);
		carros = new ArrayList<>();
		funcionarios = new ArrayList<>();
	}

	public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
    
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
