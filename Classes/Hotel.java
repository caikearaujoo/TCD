package tcd;

import java.util.Date;

class Hotel extends Empresa
{
	private int numEstrelas;
	private int accPet;
	private int numQuartos;
	private int horaCheckin;
	private int minCheckin;
	private int segCheckin;
	private int horaCheckout;
	private int minCheckout;
	private int segCheckout;
	private String msgDivulg;
	private String desc;
	private String cidade;
	final static double taxa = 0.05;
	private Quarto qluxo;
	private Quarto qstandartS;
	private Quarto qstandartD;
	private Quarto qstandartT;
	private Date dataPoliticaCancelamento;
    private boolean cancelamentoAceito;
    
    
    
	public Date getDataPoliticaCancelamento() {
		return dataPoliticaCancelamento;
	}



	public void setDataPoliticaCancelamento(Date dataPoliticaCancelamento) {
		this.dataPoliticaCancelamento = dataPoliticaCancelamento;
	}



	public boolean isCancelamentoAceito() {
		return cancelamentoAceito;
	}



	public void setCancelamentoAceito(boolean cancelamentoAceito) {
		this.cancelamentoAceito = cancelamentoAceito;
	}



	public Quarto getQluxo() {
		return qluxo;
	}



	public void setQluxo(Quarto qluxo) {
		this.qluxo = qluxo;
	}



	public Quarto getQstandartS() {
		return qstandartS;
	}



	public void setQstandartS(Quarto qstandartS) {
		this.qstandartS = qstandartS;
	}



	public Quarto getQstandartD() {
		return qstandartD;
	}



	public void setQstandartD(Quarto qstandartD) {
		this.qstandartD = qstandartD;
	}



	public Quarto getQstandartT() {
		return qstandartT;
	}



	public void setQstandartT(Quarto qstandartT) {
		this.qstandartT = qstandartT;
	}
	
	
	
	public double getTaxa() {
		return taxa;
	}



	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}



	public int getNumEstrelas() {
		return numEstrelas;
	}



	public void setNumEstrelas(int numEstrelas) {
		this.numEstrelas = numEstrelas;
	}



	public int getAccPet() {
		return accPet;
	}



	public void setAccPet(int accPet) {
		this.accPet = accPet;
	}



	public int getNumQuartos() {
		return numQuartos;
	}



	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}



	public int getHoraCheckin() {
		return horaCheckin;
	}



	public void setHoraCheckin(int horaCheckin) {
		this.horaCheckin = horaCheckin;
	}



	public int getMinCheckin() {
		return minCheckin;
	}



	public void setMinCheckin(int minCheckin) {
		this.minCheckin = minCheckin;
	}



	public int getSegCheckin() {
		return segCheckin;
	}



	public void setSegCheckin(int segCheckin) {
		this.segCheckin = segCheckin;
	}



	public int getHoraCheckout() {
		return horaCheckout;
	}



	public void setHoraCheckout(int horaCheckout) {
		this.horaCheckout = horaCheckout;
	}



	public int getMinCheckout() {
		return minCheckout;
	}



	public void setMinCheckout(int minCheckout) {
		this.minCheckout = minCheckout;
	}



	public int getSegCheckout() {
		return segCheckout;
	}



	public void setSegCheckout(int segCheckout) {
		this.segCheckout = segCheckout;
	}



	public String getMsgDivulg() {
		return msgDivulg;
	}



	public void setMsgDivulg(String msgDivulg) {
		this.msgDivulg = msgDivulg;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Hotel(String CNPJ, String nome, String nomeDivulg, int diaCria, int mesCria, int anoCria, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, int numEstrelas, int accPet, int numQuartos, int horaCheckin, int minCheckin, int horaCheckout, int minCheckout, String msgDivulg, String desc, String cidade, int diaCheckin, int diaCheckout, int mesCheckin, int mesCheckout, int anoCheckin, int anoCheckout)
	{
		super(CNPJ, nome, nomeDivulg, diaCria, mesCria, anoCria, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep);
		
		if(numEstrelas>0 && numEstrelas<=5) this.numEstrelas = numEstrelas;
		else numEstrelas = -1;
		
		this.accPet = accPet;
		
		this.numQuartos = numQuartos;
		
		if(horaCheckin > 0 && horaCheckin <60) this.horaCheckin = horaCheckin;
		else this.horaCheckin = -1;
		
		if(minCheckin > 0 && minCheckin <60) this.minCheckin = minCheckin;
		else this.minCheckin = -1;
		
		this.segCheckin = 0;
		
		if(horaCheckout > 0 && horaCheckout <60) this.horaCheckout = horaCheckout;
		else this.horaCheckout = -1;
		
		if(minCheckout > 0 && minCheckout <60) this.minCheckout = minCheckout;
		else this.minCheckout = -1;
		
		this.segCheckout = 0;
		
		if (msgDivulg != null && !msgDivulg.isEmpty()) 
		{
			this.msgDivulg = msgDivulg;
		}
		else this.msgDivulg = null;
		
		if (desc != null && !desc.isEmpty()) 
		{
			this.desc = desc;
		}
		else this.desc = null;
		
		if (cidade != null && !cidade.isEmpty()) 
		{
			this.cidade = cidade;
		}
		else this.cidade = null;
		
	}
	
	public void registrarQuarto(double diariaSdesc, double desconto, double diariaCdesc, int quantidade, int opcao) 
	{
        Quarto quarto = new Quarto(diariaSdesc, desconto, diariaCdesc, quantidade);
        
        switch (opcao) 
        {
            case 1:
                qluxo = quarto;
                break;
            case 2:
                qstandartS = quarto;
                break;
            case 3:
                qstandartD = quarto;
                break;
            case 4:
                qstandartT = quarto;
                break;
            default:
                return;
        }
    }
	
    

    public boolean CancelamentoAceito(Date data) 
    {
        return data.equals(dataPoliticaCancelamento) && cancelamentoAceito;
    }

    public void definirPoliticaCancelamento(Date data, boolean cancelamentoAceito) 
    {
        this.dataPoliticaCancelamento = data;
        this.cancelamentoAceito = cancelamentoAceito;
    }
	

}
