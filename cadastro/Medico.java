package cadastro;

public class Medico {

	private String nome;
	private String sobrenome;
	private String especialidade;
	private String telefone;
	private String celular;
	private String ID;
	private String endereço;
	private String email;
	private String turno;
	private String pacientes;
	private String consultas;
	private String estadoCivil;
	private String sexo;
	private String RG;
	private String CPF;
	private String dataNasc;
	
	public void setDataNasc(String dataNasc){
		this.dataNasc = dataNasc; 
	}
	
	public String getDataNasc(){
		return this.dataNasc;
	}
	
	public void setCPF(String CPF){
		this.CPF = CPF;
	}
	
	public String getCPF(){
		return this.CPF;
	}
	
	public void setRG(String RG){
		this.RG = RG;
	}
	
	public String getRG(){
		return this.RG;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public void setEstadoCivil(String estadoCivil){
		this.estadoCivil = estadoCivil;
	}
	
	public String getEstadoCivil(){
		return this.estadoCivil;
	}
	
	public void setConsultas(String consultas){
		this.consultas = consultas;
	}
	
	public String getConsultas(){
		return this.consultas;
	}
	
	public void setPacientes(String pacientes){
		this.pacientes = pacientes;
	}
	
	public String getPacientes(){
		return this.pacientes;
	}
	
	public void setTurno(String turno){
		this.turno = turno;
	}
	
	public String getTurno(){
		return this.turno;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome(){
		return this.sobrenome;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setCelular(String celular){
		this.celular = celular;
	}
	
	public String celular(){
		return this.celular;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade(){
		return this.especialidade;
	}
	
	public void setEndereço(String endereço){
		this.endereço = endereço;
	}
	
	public String getEndereço(){
		return this.endereço;
	}
	
}
