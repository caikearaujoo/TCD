package tcd;

class FuncionarioUdiLocaliza extends Funcionario 
{
	public FuncionarioUdiLocaliza(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade,
			String endUf, String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, String carteiraTrab) {
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc, carteiraTrab, 0);
	}
	
	public void adicionarCarro(UdiLocaliza locadora, Carros carro) {
        locadora.adicionarCarro(carro);
    }
	
	public void removerCarro(UdiLocaliza locadora, Carros carro) {
        locadora.removerCarro(carro);
    }
	
	public void vendaCarro(Carros carro, int diaDevolucao, int mesDevolucao, int anoDevolucao, int diaRetirada, int mesRetirada, int anoRetirada, int horaRetirada, int minRetirada, int segRetirada, int horaDevolucao, int minDevolucao, int segDevolucao, Pessoa clienteLocador)
	{
		carro.vendaCarro(carro, diaDevolucao, mesDevolucao, anoDevolucao, diaRetirada, mesRetirada, anoRetirada, horaRetirada, minRetirada, segRetirada, horaDevolucao, minDevolucao, segDevolucao, clienteLocador);
	}

}
