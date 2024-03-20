package tcd;

import java.util.ArrayList;

public class DadosFuncionario {
	// arraylist
	private ArrayList<Funcionario> funcionarios;

	// cadastrar (inserir no array)
	public boolean cadastrarFuncionario(Funcionario f) {
		if (consultarFuncionario(f)) {
			return false;
		}
		this.funcionarios.add(f);
		return true;
	}

	// consultar (buscar no array)
	public boolean consultarFuncionario(Funcionario f) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (f == funcionarios.get(i))
				return true;
		}
		return false;
	}

	// remover (retirar do array)
	public boolean removerFuncionario(Funcionario f) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (f == funcionarios.get(i)) {
				funcionarios.remove(i);
				return true;
			}
		}
		return false;
	}
}
