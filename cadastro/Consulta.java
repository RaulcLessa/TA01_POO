package cadastro;

public class Consulta {

	private String paciente;
	private String Data;
	private String medico;
	private String diagnostico;
	private String prazo;
	private String preco;
	
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
	
	public void setData(String Data){
		this.Data = Data;
	}
	
	public String getData(){
		return this.Data;
	}
	
	public void setDiagnostico(String diagnostico){
		this.diagnostico = diagnostico;
	}
	
	public String getDiagnostico(){
		return this.diagnostico;
	}
	
	public void setMedico(String medico){
		this.medico = medico;
	}
	
	public String getMedico(){
		return this.medico;
	}
	
	public void setPrazo(String prazo){
		this.prazo = prazo;
	}
	
	public String getPrazo(){
		return this.prazo;
	}
	
}