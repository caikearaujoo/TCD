package tcd;

import java.util.ArrayList;

public class DadosFuncionario {
	// arraylist
	private ArrayList<Funcionario> funcionarios;

	// cadastrar (inserir no array)
	public boolean cadastrarFuncionario(Funcionario f) {
		if (consultarFuncionario(f.getCpf())) {
			return false;
		}
		this.funcionarios.add(f);
		return true;
	}

	// consultar (buscar no array)
	public boolean consultarFuncionario(String cpf) {
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario temp = funcionarios.get(i);
			if (cpf == temp.getCpf())
				return true;
		}
		return false;
	}

	// remover (retirar do array)
	public boolean removerFuncionario(String cpf) {
		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario temp = funcionarios.get(i);
			if (cpf == temp.getCpf()) {
				funcionarios.remove(i);
				return true;
			}
		}
		return false;
	}
}
