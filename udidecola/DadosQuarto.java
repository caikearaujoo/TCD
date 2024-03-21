package tcd;

import java.util.ArrayList;

public class DadosQuarto {
	private ArrayList<Quarto> Quartos;

	public ArrayList<Quarto> getQuartos() {
		return Quartos;
	}

	public boolean cadastrarQuarto(Quarto Quarto) {
		if (consultarQuarto(Quarto)) {
			return false;
		} else {
			this.Quartos.add(Quarto);
			return true;
		}
	}

	public boolean consultarQuarto(Quarto Quarto) {

		for (int i = 0; i < Quartos.size(); i++) {
			if (Quarto == Quartos.get(i))
				return true;
		}
		return false;
	}

	public boolean removerQuarto(Quarto Quarto) {
		for (int i = 0; i < Quartos.size(); i++) {
			if (Quarto == Quartos.get(i)) {
				Quartos.remove(i);
				return true;
			}
		}
		return false;
	}
}
