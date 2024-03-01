package tcd;

public class Quarto 
{
	private double diariaSdesc;
	private double desconto;
	private double diariaCdesc;
	private int quantidade;
	
	public double getDiariaSdesc() {
		return diariaSdesc;
	}

	public void setDiariaSdesc(double diariaSdesc) {
		this.diariaSdesc = diariaSdesc;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getDiariaCdesc() {
		return diariaCdesc;
	}

	public void setDiariaCdesc(double diariaCdesc) {
		this.diariaCdesc = diariaCdesc;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Quarto(double diariaSdesc, double desconto, int quantidade)
	{
		this.diariaSdesc = diariaSdesc;
		this.diariaCdesc = (diariaSdesc - desconto);
		this.desconto = desconto;
		this.quantidade = quantidade;
	}
	
}
