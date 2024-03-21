package tcd;

import java.util.ArrayList;

public class DadosFuncHotel {
	// arraylist
	private ArrayList<FuncHotel> funcsHotel;

	// cadastrar (inserir no array)
	public boolean cadastrarFuncHotel(FuncHotel fh) {
		if (consultarFuncHotel(fh.getCpf())) {
			return false;
		}
		this.funcsHotel.add(fh);
		return true;
	}

	// consultar (buscar no array)
	public boolean consultarFuncHotel(String cpf) {
		for (int i = 0; i < funcsHotel.size(); i++) {
			FuncHotel temp = funcsHotel.get(i);
			if (cpf == temp.getCpf())
				return true;
		}
		return false;
	}

	// remover (retirar do array)
	public boolean removerFuncHotel(String cpf) {
		for (int i = 0; i < funcsHotel.size(); i++) {
			FuncHotel temp = funcsHotel.get(i);
			if (cpf == temp.getCpf()) {
				funcsHotel.remove(i);
				return true;
			}
		}
		return false;
	}
}
