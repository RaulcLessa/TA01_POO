package cadastro;

/*
 * Dúvida em relação à criar uma classe de atributo comum à pessoas
 */

public class Paciente {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String celular;
	private String endereço;
	private String dataAtendimento;
	private String medico;
	private String dataCadastro;
	private String convenio;
	private String estadoCivil;
	private String email;
	private String endereco;
	private String sexo;
	private String RG;
	private String CPF;
	private String dataNasc;
	private String ID;
	private String exames;
	private String consultas;

	public void setExames(String exames){
		this.exames = exames;
	}
	
	public String getExames(){
		return this.exames;
	}
	
	public void setConsultas(String consultas){
		this.consultas = consultas;
	}
	
	public String getConsultas(){
		return this.consultas;
	}
	
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
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
	public void setEstadoCivil(String estadoCivil){
		this.estadoCivil = estadoCivil;
	}
	
	public String getEstadoCivil(){
		return this.estadoCivil;
	}
	
	public void setConvenio(String convenio){
		this.convenio = convenio;
	}
	
	public String getConvenio(){
		return this.convenio;
	}
	
	public void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}
	
	public String getDataCadastro(){
		return this.dataCadastro;
	}
	
	public void setMedico(String medico){
		this.medico = medico;
	}
	
	public String getMedico(){
		return this.medico;
	}
	
	public void setDataAtendimento(String dataAtendimento){
		this.dataAtendimento = dataAtendimento;
	}
	
	public String getDataAtendimento(){
		return this.dataAtendimento;
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
	
	public void setEndereço(String endereço){
		this.endereço = endereço;
	}
	
	public String getEndereço(){
		return this.endereço;
	}
	
}
