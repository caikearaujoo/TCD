package tcd;

import java.util.Date;
import java.time.LocalTime;
import java.util.Calendar;

class Hotel extends Empresa
{
	private int numEstrelas;
	private int accPet;
	private int numQuartos;
	private LocalTime horaCheckin;
	private LocalTime horaCheckout;
	private String msgDivulg;
	private String desc;
	private String cidade;
	private final static double taxa = 0.05;
	private Quarto qluxo;
	private Quarto qstandartS;
	private Quarto qstandartD;
	private Quarto qstandartT;
	private Date dataPoliticaCancelamento;
    private boolean cancelamentoAceito;
    
	public LocalTime getHoraCheckin() {
		return horaCheckin;
	}



	public void setHoraCheckin(LocalTime horaCheckin) {
		this.horaCheckin = horaCheckin;
	}



	public LocalTime getHoraCheckout() {
		return horaCheckout;
	}



	public void setHoraCheckout(LocalTime horaCheckout) {
		this.horaCheckout = horaCheckout;
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
	
	
	public double getTaxa() {
		return taxa;
	}


	public int getNumEstrelas() {
		return numEstrelas;
	}



	public void setNumEstrelas(int numEstrelas) {
		if(numEstrelas>0 && numEstrelas<=5) this.numEstrelas = numEstrelas;
		else numEstrelas = -1;
	}



	public int getAccPet() {
		return accPet;
	}



	public void setAccPet(int accPet) {
		if(accPet == 0 || accPet == 1) this.accPet = accPet;
		else this.accPet = -1;
	}



	public int getNumQuartos() {
		return numQuartos;
	}



	public void setNumQuartos(int numQuartos) {
		if(numQuartos>0) this.numQuartos = numQuartos;
		else this.numQuartos = -1;
	}

	public String getMsgDivulg() {
		return msgDivulg;
	}



	public void setMsgDivulg(String msgDivulg) {
		if (msgDivulg != null && !msgDivulg.isEmpty()) 
		{
			this.msgDivulg = msgDivulg;
		}
		else this.msgDivulg = null;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		if (desc != null && !desc.isEmpty()) 
		{
			this.desc = desc;
		}
		else this.desc = null;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		if (cidade != null && !cidade.isEmpty()) 
		{
			this.cidade = cidade;
		}
		else this.cidade = null;
	}


	public Hotel(String CNPJ, String nome, String nomeDivulg, Date dataCria, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, int numEstrelas, int accPet, int numQuartos, String msgDivulg, String desc, String cidade)
	{
		super(CNPJ, nome, nomeDivulg, dataCria, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep);
		
		setNumEstrelas(numEstrelas);
		setAccPet(accPet);
		setNumQuartos(numQuartos);
		setMsgDivulg(msgDivulg);
		setDesc(desc);
		setCidade(cidade);
		
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
	
    

	public boolean CancelamentoAceito(Date data) {
	    Calendar cal1 = Calendar.getInstance();
	    cal1.setTime(data);
	    
	    Calendar cal2 = Calendar.getInstance();
	    cal2.setTime(dataPoliticaCancelamento);
	    
	    return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
	           cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
	           cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH) &&
	           cancelamentoAceito;
	}

    public void definirPoliticaCancelamento(Date data, boolean cancelamentoAceito) 
    {
        this.dataPoliticaCancelamento = data;
        this.cancelamentoAceito = cancelamentoAceito;
    }
	

}
