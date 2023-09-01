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
		
		 
			String menu=" 1. Agregar Estudiante\n 2. Ordenar Burbuja\n 3. Ordenar Seleccion\n 4. Salir.";
			int option=0;
			do {
				option= vc.ReadInteger(menu);
				switch (option) {
				case 1:Insertarxcola();
				break;
				case 2: lis.mostrarLista();
				break;
				case 3:Insertarantes();
				break;
				case 4: vc.SeeInfo("See you soon");
				break;
				default:vc.SeeInfo("Incorrect option,please selected diferent option");

				}

			}while(option != 4);

		}
		
	
	
	
	
	
	
	public void Insertarxcabeza() {
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 int codigo=vc.ReadInteger("ingrese codigo");
		 int prio=vc.ReadInteger("ingrese prioridad");
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		
		pc=new Paciente(codigo,nombreapellido,true,diag,gen,fechain,medicontra,prio);
		lis.insertarxcabeza(pc);

		
	}
	
	public void Insertarxcola() {
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 int codigo=vc.ReadInteger("ingrese codigo");
		 int prio=vc.ReadInteger("ingrese prioridad");
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		
		pc=new Paciente(codigo,nombreapellido,true,diag,gen,fechain,medicontra,prio);
		lis.insertarxcola(pc);

		
	}
	
	
	public void Insertarantes() {
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 int codigo=vc.ReadInteger("ingrese codigo");
		 int prio=vc.ReadInteger("ingrese prioridad");
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		 int codigoaux=vc.ReadInteger("ingrese codigo de donde quiere ingresar antes");
		
		pc=new Paciente(codigo,nombreapellido,true,diag,gen,fechain,medicontra,prio);
		lis.insertarAntesDeCodigo(codigoaux, pc);

		
	}
	
}
