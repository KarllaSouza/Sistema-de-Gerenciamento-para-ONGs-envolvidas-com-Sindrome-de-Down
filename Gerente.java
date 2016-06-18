package model;

public class Gerente extends Funcionario{
	
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
		return true;
	}
	public void setCodigoGerente(int codigoFuncionario){
		this.codigoFuncionario=codigoFuncionario;
	}
}
