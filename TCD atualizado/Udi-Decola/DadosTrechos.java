package tcd;

import java.util.ArrayList;

public class DadosTrechos {
	
	private ArrayList<Trechos> trechos;
	
	public boolean cadastrarTrecho (Trechos trecho) {
		if (consultarTrecho(trecho)) {
            return false;
        }
		else {
			this.trechos.add(trecho);
	        return true;
		}
	}
	
	public boolean consultarTrecho(Trechos trecho) {
	    	
	    	for(int i = 0; i < trechos.size(); i++) {
	    		if(trecho == trechos.get(i)) return true;
	    	} 
	    	return false;	
	}
	
	public boolean removerTrecho(Trechos trecho) {
		for(int i = 0; i < trechos.size(); i++) {
    		if(trecho == trechos.get(i)) {
    			trechos.remove(i);
    			return true;
    		}
    	}
		return false;
	}
}
