package projeto.model;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String rg;
	private Date dataDeNascimento;
	private String numeroDeContato;
	private String cidade;
	private String estado;
	private boolean isGerente;
	Pessoa pessoa;

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public void setDataDeNascimento(Date dataDeNascimento){
		this.dataDeNascimento = dataDeNascimento;
	}
	public void setNumeroDeContato(String numeroDeContato){
		this.numeroDeContato = numeroDeContato;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public void setIsGerente(boolean isGerente){
		this.isGerente = isGerente;
	}

	
	public String getNome(){
		return this.nome;
	}
	public String getRg(){
		return this.rg;
	}
	public Date getDataDeNascimento(){
		return this.dataDeNascimento;
	}
	public String getNumeroDeContato(){
		return this.numeroDeContato;
	}
	public String getCidade(){
		return this.cidade;
	}
	public String getEstado(){
		return this.estado;
	}
	public boolean getIsGerente(){
		return this.isGerente;
	}

}
