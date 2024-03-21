package tcd;

import java.util.ArrayList;

public class DadosHotel {
	private ArrayList<Hotel> hoteis;
	
	public ArrayList<Hotel> getHoteis() {
		return hoteis;
	}

	public boolean cadastrarHotel(Hotel hotel) {
		if (consultarHotel(hotel.getCNPJ())) {
            return false;
        }
		else {
			this.hoteis.add(hotel);
	        return true;
		}
	}
	
	public boolean consultarHotel(String cnpj) {
	    	
	    	for(int i = 0; i < hoteis.size(); i++) {
	    		Hotel temp = hoteis.get(i);
	    		if(cnpj == temp.getCNPJ()) return true;
	    	} 
	    	return false;	
	}
	
	public boolean removerHotel(String cnpj) {
		for(int i = 0; i < hoteis.size(); i++) {
			Hotel temp = hoteis.get(i);
    		if(cnpj == temp.getCNPJ()) {
    			hoteis.remove(i);
    			return true;
    		}
    	}
		return false;
	}
}
