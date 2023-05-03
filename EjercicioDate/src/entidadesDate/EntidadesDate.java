
package entidadesDate;

import java.util.Date;


public class EntidadesDate {
    private int día;
private int mes ;
private int anio;

    public EntidadesDate() {
    }

    public EntidadesDate(int día, int mes, int anio) {
	this.día = día;
	this.mes = mes;
	this.anio = anio;
    }

    public int getDía() {
	return día;
    }

    public void setDía(int día) {
	this.día = día;
    }

    public int getMes() {
	return mes;
    }

    public void setMes(int mes) {
	this.mes = mes;
    }

    public int getAnio() {
	return anio;
    }

    public void setAnio(int anio) {
	this.anio = anio;
    }


}