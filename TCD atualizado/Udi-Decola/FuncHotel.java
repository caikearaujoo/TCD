package udidecola;

// item 4: funcionário do hotel é subclasse de pessoa
public class FuncHotel extends Pessoa {
	private String carteiraTrab;
	private static double salarioFixo;

	// item 3D: construtor criado por nós
	public FuncHotel(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf,
			String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, String carteiraTrab) {

		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc);

		setCarteiraTrab(carteiraTrab);
	}

	public String getCarteiraTrab() {
		return carteiraTrab;
	}

	public void setCarteiraTrab(String carteiraTrab) {
		this.carteiraTrab = carteiraTrab;
	}

	public static void setSalarioFixo(double salarioFixo) {
		if (salarioFixo > 0)
			FuncHotel.salarioFixo = salarioFixo;
		else
			FuncHotel.salarioFixo = -1;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	// método para definir salário dos funcionários
	public void definirSalario(double salario) {
		setSalarioFixo(salario);
	}
}
