package model;

import java.util.Date;

public class Doacao extends Financas{
	Date dataDoacao;
	int idColaborador;
	int idDoacao;
	String moedaDoacao;
	double valorDoacao;
			
			public void setDataDoacao(Date dataDoacao){
				this.dataDoacao=dataDoacao;
			}	
			public Date getDataDoacao(){
				return this.dataDoacao;
			}
			public void setIdColaborador(int idColaborador){
				this.idColaborador=idColaborador;
			}
			public int getIdColaborador(){
				return this.idColaborador;
			}
			public void setIdDoacao(int idDoacao){
				this.idDoacao=idDoacao;
			}
			public int getIdDoacao(){
				return this.idDoacao;
			}
			public void setMoedaDoacao(String moedaDoacao){
				this.moedaDoacao=moedaDoacao;
			}
			public String getMoedaDoacao(){
				return this.moedaDoacao;
			}
			public void setValorDoacao(double valorDoacao){
				this.valorDoacao=valorDoacao;
			}
			public double getValorDoacao(){
				return this.valorDoacao;
			}
			
			
}
