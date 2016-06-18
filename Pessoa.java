package model;
import java.util.Date;

public class Pessoa {
	protected String nome;
	protected Date dataNasc;
	protected String cpf;
	protected Endereco endereco;
	protected String telefone;
	protected String email;	
	
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
}
