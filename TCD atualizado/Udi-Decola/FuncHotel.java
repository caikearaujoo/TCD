package udidecola;

public class FuncHotel extends Pessoa {
	// atributos específicos
	private String carteiraTrab;
	private static double salarioFixo;
	private int hoteisCad;
	
	// construtor completo
	public FuncHotel(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, 
		             String cpf, int diaNasc, int mesNasc, int anoNasc,
		             String carteiraTrab, int hoteisCad) {
		
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, 
			  cpf, diaNasc, mesNasc, anoNasc);
		
		setCarteiraTrab(carteiraTrab);
		setHoteisCad(hoteisCad);
	}
		
	public String getCarteiraTrab() {
		return carteiraTrab;
	}

	public void setCarteiraTrab(String carteiraTrab) {
		this.carteiraTrab = carteiraTrab;
	}

	public static void setSalarioFixo(double salarioFixo) {
		FuncHotel.salarioFixo = salarioFixo;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public int getHoteisCad() {
		return hoteisCad;
	}

	public void setHoteisCad(int hoteisCad) {
		if (hoteisCad >= 0) this.hoteisCad = hoteisCad;
		else this.hoteisCad = -1;
	}
}
