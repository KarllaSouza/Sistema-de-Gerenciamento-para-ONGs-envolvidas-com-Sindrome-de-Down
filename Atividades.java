package model;
import java.util.Timer;

public class Atividades {
	int idAtividade;
	String descricaoAtividade;
	Timer horarioEntrada1;
	Timer horarioEntrada2;
	Timer horarioSaida1;
	Timer horarioSaida2;
	String responsavelAtividade;
	String materialParaAtividade;
	
	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}
	public int getIdAtividade() {
		return this.idAtividade;
	}
	public void setDescricaoAtividade(String descricaoAtividade) {
		this.descricaoAtividade = descricaoAtividade;
	}
	public String getDescricaoAtividade() {
		return this.descricaoAtividade;
	}
	public void setHorarioEntrada1(Timer horarioEntrada1) {
		this.horarioEntrada1 = horarioEntrada1;
	}
	public Timer getHorarioEntrada1() {
		return this.horarioEntrada1;
	}
	public void setHorarioEntrada2(Timer horarioEntrada2) {
		this.horarioEntrada2 = horarioEntrada2;
	}
	public Timer getHorarioEntrada2() {
		return this.horarioEntrada2;
	}
	public void setHorarioSaida1(Timer horarioSaida1) {
		this.horarioSaida1 = horarioSaida1;
	}
	public Timer getHorarioSaida1() {
		return this.horarioSaida1;
	}
	public void setHorarioSaida2(Timer horarioSaida2) {
		this.horarioSaida2 = horarioSaida2;
	}
	public Timer getHorarioSaida2() {
		return this.horarioSaida2;
	}
	public void setMaterialParaAtividade(String materialParaAtividade) {
		this.materialParaAtividade = materialParaAtividade;
	}
	public String getMaterialParaAtividade() {
		return this.materialParaAtividade;
	}
	public void setResponsavelAtividade(String responsavelAtividade) {
		this.responsavelAtividade = responsavelAtividade;
	}
	public String getResponsavelAtividade() {
		return this.responsavelAtividade;
	}
	
	
}
