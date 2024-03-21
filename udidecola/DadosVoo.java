package tcd;

import java.util.ArrayList;

public class DadosVoo {
	private ArrayList<Voos> Vooss;
	
	public ArrayList<Voos> getVooss() {
		return Vooss;
	}

	public boolean cadastrarVoos(Voos Voos) {
		if (consultarVoos(Voos)) {
            return false;
        }
		else {
			this.Vooss.add(Voos);
	        return true;
		}
	}
	
	public boolean consultarVoos(Voos Voos) {
	    	
	    	for(int i = 0; i < Vooss.size(); i++) {
	    		if(Voos == Vooss.get(i)) return true;
	    	} 
	    	return false;	
	}
	
	public boolean removerVoos(Voos Voos) {
		for(int i = 0; i < Vooss.size(); i++) {
    		if(Voos == Vooss.get(i)) {
    			Vooss.remove(i);
    			return true;
    		}
    	}
		return false;
	}
}
