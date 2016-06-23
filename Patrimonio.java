package model;

import java.util.Date;

public class Patrimonio {
	int idPatrimonio;
	String descricaoPatrimonio;
	String tipoPatrimonio;
	Date dataObtençãoPatrimonio;
	
	public void setIdPatrimonio(int idPatrimonio) {
		this.idPatrimonio = idPatrimonio;
	}
	public int getIdPatrimonio() {
		return this.idPatrimonio;
	}
	public void setDescricaoPatrimonio(String descricaoPatrimonio) {
		this.descricaoPatrimonio = descricaoPatrimonio;
	}
	public String getDescricaoPatrimonio() {
		return this.descricaoPatrimonio;
	}
	public void setTipoPatrimonio(String tipoPatrimonio) {
		this.tipoPatrimonio = tipoPatrimonio;
	}
	public String getTipoPatrimonio() {
		return this.tipoPatrimonio;
	}
	public void setDataObtençãoPatrimonio(Date dataObtençãoPatrimonio) {
		this.dataObtençãoPatrimonio = dataObtençãoPatrimonio;
	}
	public Date getDataObtençãoPatrimonio() {
		return this.dataObtençãoPatrimonio;
	}

}
