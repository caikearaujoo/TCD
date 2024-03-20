package tcd;

import java.util.ArrayList;

public class DadosHoteis {
	private ArrayList<Hotel> hoteis;
	
	public ArrayList<Hotel> getHoteis() {
		return hoteis;
	}

	public boolean cadastrarHotel(Hotel hotel) {
		if (consultarHotel(hotel)) {
            return false;
        }
		else {
			this.hoteis.add(hotel);
	        return true;
		}
	}
	
	public boolean consultarHotel(Hotel hotel) {
	    	
	    	for(int i = 0; i < hoteis.size(); i++) {
	    		if(hotel == hoteis.get(i)) return true;
	    	} 
	    	return false;	
	}
	
	public boolean removerHotel(Hotel hotel) {
		for(int i = 0; i < hoteis.size(); i++) {
    		if(hotel == hoteis.get(i)) {
    			hoteis.remove(i);
    			return true;
    		}
    	}
		return false;
	}
}
