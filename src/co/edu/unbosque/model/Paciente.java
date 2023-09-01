package co.edu.unbosque.model;

public class Paciente {
private  int CodigoUnico;
private  String NombreApellidos;
private int prioridad;
private boolean Estado;
private String Diagnostico;
private String Genero;
private String Fechadeingreso;
private String medicotratante;
/**
 * Constructor de la clase Paciente que inicializa los atributos del paciente.
 */
public Paciente(int codigo,String nombreape,boolean Estado,String diag,String gene,String fechaingreso,String medicotratante,int prio) {
	this.CodigoUnico=codigo;
	this.NombreApellidos=nombreape;
	this.Estado=Estado;
	this.Diagnostico=diag;
	this.Genero=gene;
	this.Fechadeingreso=fechaingreso;
	this.medicotratante=medicotratante;
	this.prioridad=prio;
	
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

public int getPrioridad() {
	return prioridad;
}

public void setPrioridad(int prioridad) {
	this.prioridad = prioridad;
}

public boolean isEstado() {
	return Estado;
}

public void setEstado(boolean estado) {
	Estado = estado;
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

/**
 * Devuelve una representación en cadena de texto de un objeto Student.
 */
public String toString() {
	return "Paciente [CodigoUnico=" + CodigoUnico + ", NombreApellidos=" + NombreApellidos + ", prioridad=" + prioridad
			+ ", Estado=" + Estado + ", Diagnostico=" + Diagnostico + ", Genero=" + Genero + ", Fechadeingreso="
			+ Fechadeingreso + ", medicotratante=" + medicotratante + "]";
}

}
