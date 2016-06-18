package model;
import java.util.Date;

public class Funcionario extends Pessoa {
	
	public void setNome(String nome){
		this.nome=nome;
	}	
	public String getNome(){
		return this.nome;
	}
	public void setDataNasc(Date dataNasc){
		this.dataNasc=dataNasc;
	}
	public Date getDataNasc(){
		return this.dataNasc;
	}
	public void setCpf(String cpf){
		this.cpf=cpf;
	}
	public String getCpf(){
		return this.cpf;
	}
	public void setEndereco(Endereco endereco){
		this.endereco=endereco;
	}
	public Endereco getEndereco(){
		return this.endereco;
	}
	public void setTelefone(String telefone){
		this.telefone=telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	int codigoFuncionario;
	boolean isGerente;
	public void setCodigoFuncionario(int codigoFuncionario){
		this.codigoFuncionario=codigoFuncionario;
	}
	public int getCodigoFuncionario(){
		return this.codigoFuncionario;
	}
	public void setIsGerente(boolean isGerente){
		this.isGerente=isGerente;
	}
	public boolean getIsGerente(){
		return this.isGerente;
	}
}
