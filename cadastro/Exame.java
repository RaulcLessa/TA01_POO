package cadastro;

public class Exame {

	private String medico;
	private String solicitacao;
	private String tipo;
	private String Data;
	private String prazo;
	private String paciente;
	private String preco;
	private String convenio;
	
	public void setConvenio(String convenio){
		this.convenio = convenio;
	}
	
	public String getConvenio(){
		return this.convenio;
	}
	
	public void setPreco(String preco){
		this.preco = preco;
	}
	
	public String getPreco(){
		return this.preco;
	}
	
	public void setPaciente(String paciente){
		this.paciente = paciente;
	}
	
	public String getPaciente(){
		return this.paciente;
	}
	
	public void setMedico(String medico){
		this.medico = medico;
	}
	
	public String getMedico(){
		return this.medico;
	}
	
	public void setSolicitacao(String solicitacao){
		this.solicitacao = solicitacao;
	}
	
	public String getSolicitacao(){
		return this.solicitacao;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public void setData(String Data){
		this.Data = Data;
	}
	
	public String getData(){
		return this.Data;
	}
	
	public void setPrazo(String prazo){
		this.prazo = prazo;
	}
	
	public String getPrazo(){
		return this.prazo;
	}
	
	
	
}
