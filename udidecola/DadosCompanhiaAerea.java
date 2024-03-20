package tcd;

import java.util.ArrayList;

public class DadosCompanhiaAerea {
private ArrayList<CompanhiaAerea> CompanhiasAereas;
	
	public ArrayList<CompanhiaAerea> getCompanhiasAereas() {
		return CompanhiasAereas;
	}

	public boolean cadastrarCompanhiaAerea(CompanhiaAerea CompanhiaAerea) {
		if (consultarCompanhiaAerea(CompanhiaAerea)) {
            return false;
        }
		else {
			this.CompanhiasAereas.add(CompanhiaAerea);
	        return true;
		}
	}
	
	public boolean consultarCompanhiaAerea(CompanhiaAerea CompanhiaAerea) {
	    	
	    	for(int i = 0; i < CompanhiasAereas.size(); i++) {
	    		if(CompanhiaAerea == CompanhiasAereas.get(i)) return true;
	    	} 
	    	return false;	
	}
	
	public boolean removerCompanhiaAerea(CompanhiaAerea CompanhiaAerea) {
		for(int i = 0; i < CompanhiasAereas.size(); i++) {
    		if(CompanhiaAerea == CompanhiasAereas.get(i)) {
    			CompanhiasAereas.remove(i);
    			return true;
    		}
    	}
		return false;
	}
}
