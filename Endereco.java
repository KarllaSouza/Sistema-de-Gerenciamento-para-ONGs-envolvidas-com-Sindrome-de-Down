package model;

public class Endereco {
	protected String rua;
	protected String bairro;
	protected String cep;
	protected String cidade;
	protected String estado;
	protected String pais;
	
	public void setRua(String rua){
		this.rua=rua;
	}
	public void setBairro(String bairro){
		this.bairro=bairro;
	}
	public void setCep(String cep){
		this.cep=cep;
	}
	public void setCidade(String cidade){
		this.cidade=cidade;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}
	public void setPais(String pais){
		this.pais=pais;
	}
	public String getRua(){
		return this.rua;
	}
	public String getBairro(){
		return this.bairro;
	}
	public String getCep(){
		return this.cep;
	}
	public String getCidade(){
		return this.cidade;
	}
	public String getEstado(){
		return this.estado;
	}
	public String getPais(){
		return this.pais;
	}
}
