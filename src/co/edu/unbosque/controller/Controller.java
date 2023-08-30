package co.edu.unbosque.controller;

import co.edu.unbosque.model.Lista;
import co.edu.unbosque.model.Paciente;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
private VistaConsola vc;
private Paciente pc;	
private Lista lis;
	public Controller() {
		vc= new VistaConsola();
		lis=new Lista();
		Funcionar();
	}
	
	
	public void Funcionar() {
		
		Insertar();
		
	}
	
	
	
	
	
	public void Insertar() {
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 String codigo=vc.ReadString("ingrese codigo");
		 int prio=vc.ReadInteger("ingrese prioridad");
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		
		pc=new Paciente(codigo,nombreapellido,true,diag,gen,fechain,medicontra,prio);
		lis.insertarxcola(pc);
	lis.mostrarLista();
		
	}
}
