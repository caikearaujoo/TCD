package tcd;

import java.util.ArrayList;

public class DadosCompanhiaAerea {
	private ArrayList<CompanhiaAerea> CompanhiasAereas;

	public ArrayList<CompanhiaAerea> getCompanhiasAereas() {
		return CompanhiasAereas;
	}

	public boolean cadastrarCompanhiaAerea(CompanhiaAerea CompanhiaAerea) {
		if (consultarCompanhiaAerea(CompanhiaAerea.getCNPJ())) {
			return false;
		} else {
			this.CompanhiasAereas.add(CompanhiaAerea);
			return true;
		}
	}

	public boolean consultarCompanhiaAerea(String cnpj) {
		for (int i = 0; i < CompanhiasAereas.size(); i++) {
			CompanhiaAerea temp = CompanhiasAereas.get(i);
			if (cnpj == temp.getCNPJ()) {
				return true;
			}
		}
		return false;
	}

	public boolean removerCompanhiaAerea(String cnpj) {
		for (int i = 0; i < CompanhiasAereas.size(); i++) {
			CompanhiaAerea temp = CompanhiasAereas.get(i);
			if (cnpj == temp.getCNPJ()) {
				CompanhiasAereas.remove(i);
				return true;
			}
		}
		return false;
	}
}
