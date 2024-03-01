package udidecola;

public class FuncHotel extends Pessoa {
	// atributos específicos
	private String carteiraTrab;
	private static double salarioFixo;
	
	// construtor completo
	public FuncHotel(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, 
		             String cpf, int diaNasc, int mesNasc, int anoNasc,
		             String carteiraTrab) {
		
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, 
			  cpf, diaNasc, mesNasc, anoNasc);
		
		setCarteiraTrab(carteiraTrab);
	}
		
	public String getCarteiraTrab() {
		return carteiraTrab;
	}

	public void setCarteiraTrab(String carteiraTrab) {
		this.carteiraTrab = carteiraTrab;
	}

	public static void setSalarioFixo(double salarioFixo) {
		if (salarioFixo > 0) FuncHotel.salarioFixo = salarioFixo;
		else FuncHotel.salarioFixo = -1;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	// método: definir salário dos funcionários
	public void definirSalario(double salario) {
		setSalarioFixo(salario);
	}
}
