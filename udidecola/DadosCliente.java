package tcd;

import java.util.ArrayList;

public class DadosCliente {
	// arraylist
	private ArrayList<Cliente> clientes;

	// cadastrar (inserir no array)
	public boolean cadastrarCliente(Cliente c) {
		if (consultarCliente(c)) {
			return false;
		}
		this.clientes.add(c);
		return true;
	}

	// consultar (buscar no array)
	public boolean consultarCliente(Cliente c) {
		for (int i = 0; i < clientes.size(); i++) {
			if (c == clientes.get(i))
				return true;
		}
		return false;
	}

	// remover (retirar do array)
	public boolean removerCliente(Cliente c) {
		for (int i = 0; i < clientes.size(); i++) {
			if (c == clientes.get(i)) {
				clientes.remove(i);
				return true;
			}
		}
		return false;
	}
}
