package co.edu.unbosque.model;

public class Paciente {
private  int CodigoUnico;
private  String NombreApellidos;
private String Remitido;
private String Donderemitido;
private String Diagnostico;
private String Genero;
private String Fechadeingreso;
private String medicotratante;
/**
 * Constructor de la clase Paciente que inicializa los atributos del paciente.
 */
public Paciente(int codigo,String nombreape,String rem,String Donderemitido,String diag,String gene,String fechaingreso,String medicotratante) {
	this.CodigoUnico=codigo;
	this.NombreApellidos=nombreape;
	this.Remitido=rem;
	this.Donderemitido=Donderemitido;
	this.Diagnostico=diag;
	this.Genero=gene;
	this.Fechadeingreso=fechaingreso;
	this.medicotratante=medicotratante;
	
	
}

//Getters y setters para los atributos
public int getCodigoUnico() {
	return CodigoUnico;
}

public void setCodigoUnico(int codigoUnico) {
	CodigoUnico = codigoUnico;
}

public String getNombreApellidos() {
	return NombreApellidos;
}

public void setNombreApellidos(String nombreApellidos) {
	NombreApellidos = nombreApellidos;
}



public String getDiagnostico() {
	return Diagnostico;
}

public void setDiagnostico(String diagnostico) {
	Diagnostico = diagnostico;
}

public String getGenero() {
	return Genero;
}

public void setGenero(String genero) {
	Genero = genero;
}

public String getFechadeingreso() {
	return Fechadeingreso;
}

public void setFechadeingreso(String fechadeingreso) {
	Fechadeingreso = fechadeingreso;
}

public String getMedicotratante() {
	return medicotratante;
}

public void setMedicotratante(String medicotratante) {
	this.medicotratante = medicotratante;
}

public String getRemitido() {
	return Remitido;
}

public void setRemitido(String remitido) {
	Remitido = remitido;
}

public String getDonderemitido() {
	return Donderemitido;
}

public void setDonderemitido(String donderemitido) {
	Donderemitido = donderemitido;
}
/**
 * Devuelve una representación en cadena de texto de un objeto Paciente.
 */
public String toString() {
	return "Paciente [CodigoUnico=" + CodigoUnico + ", NombreApellidos=" + NombreApellidos + ", Remitido=" + Remitido
			+ ", Donderemitido=" + Donderemitido + ", Diagnostico=" + Diagnostico + ", Genero=" + Genero
			+ ", Fechadeingreso=" + Fechadeingreso + ", medicotratante=" + medicotratante + "]";
}




}
