package udidecola;

public class Funcionario extends Pessoa{
	private String carteiraTrab;
	private static double salarioFixo = 3000.0;
	private int hoteisCad;
	
	public Funcionario(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, String carteiraTrab, int hoteisCad) {
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc);
		setCarteiraTrab(carteiraTrab);
		setHoteisCad(hoteisCad);
	}
	
	public String getCarteiraTrab() {
		return carteiraTrab;
	}
	
	public void setCarteiraTrab(String carteiraTrab) {
		if (carteiraTrab.length() == 9) this.carteiraTrab = carteiraTrab;
		else this.carteiraTrab = null;
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
