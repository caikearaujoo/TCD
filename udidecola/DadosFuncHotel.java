package tcd;

import java.util.ArrayList;

public class DadosFuncHotel {
	// arraylist
	private ArrayList<FuncHotel> funcsHotel;

	// cadastrar (inserir no array)
	public boolean cadastrarFuncHotel(FuncHotel fh) {
		if (consultarFuncHotel(fh)) {
			return false;
		}
		this.funcsHotel.add(fh);
		return true;
	}

	// consultar (buscar no array)
	public boolean consultarFuncHotel(FuncHotel fh) {
		for (int i = 0; i < funcsHotel.size(); i++) {
			if (fh == funcsHotel.get(i))
				return true;
		}
		return false;
	}

	// remover (retirar do array)
	public boolean removerFuncHotel(FuncHotel fh) {
		for (int i = 0; i < funcsHotel.size(); i++) {
			if (fh == funcsHotel.get(i)) {
				funcsHotel.remove(i);
				return true;
			}
		}
		return false;
	}
}
