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
		
		 
			String menu=" 1. Agregar Estudiante\n 2. Ordenar Burbuja\n 3. Ordenar Seleccion\n 4. Salir.5. otro";
			int option=0;
			do {
				option= vc.ReadInteger(menu);
				switch (option) {
				case 1:eliminar();
				break;
				case 2: lis.mostrarLista();
				break;
				case 3:Insertarantes();
				break;
				case 4: Insertarxcabeza();
				break;
				case 5: consultar();
				default:vc.SeeInfo("Incorrect option,please selected diferent option");

				}

			}while(option != 6);

		}
		
	
	
	
	
	
	
	public void Insertarxcabeza() {
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 int codigo=vc.ReadInteger("ingrese codigo");
		 String prio=vc.ReadString("Es remitido");
		 if ("si".equals(prio)) {
			 String donde=vc.ReadString("donde es remitido");
			 String diag=vc.ReadString("Ingrese diagnostico");
			 String gen=vc.ReadString("ingrese genero");
			 String fechain=vc.ReadString("ingrese fecha de inicio");
			 String medicontra=vc.ReadString("ingrese medico tratante");
			 pc=new Paciente(codigo,nombreapellido,prio,donde,diag,gen,fechain,medicontra);
				lis.insertarxcabeza(pc);

		 }else {
			String  donde=null;
			 
		 
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		
		pc=new Paciente(codigo,nombreapellido,prio,donde,diag,gen,fechain,medicontra);
		lis.insertarxcabeza(pc);

	}
	}
	
	public void Insertarxcola() {
		
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 int codigo=vc.ReadInteger("ingrese codigo");
		 String prio=vc.ReadString("Es remitido");
		 if ("si".equals(prio)) {
			 String donde=vc.ReadString("donde es remitido");
			 String diag=vc.ReadString("Ingrese diagnostico");
			 String gen=vc.ReadString("ingrese genero");
			 String fechain=vc.ReadString("ingrese fecha de inicio");
			 String medicontra=vc.ReadString("ingrese medico tratante");
			 pc=new Paciente(codigo,nombreapellido,prio,donde,diag,gen,fechain,medicontra);
				lis.insertarxcabeza(pc);

		 }else {
			String  donde=null;
			 
		 
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		
		pc=new Paciente(codigo,nombreapellido,prio,donde,diag,gen,fechain,medicontra);
		lis.insertarxcola(pc);

		 }
	}
	
	
	public void Insertarantes() {
		
		
		 String nombreapellido =vc.ReadString("ingrese nombre y apellido");
		 int codigo=vc.ReadInteger("ingrese codigo");
		 String prio=vc.ReadString("Es remitido");
		 if ("si".equals(prio)) {
			 String donde=vc.ReadString("donde es remitido");
			 String diag=vc.ReadString("Ingrese diagnostico");
			 String gen=vc.ReadString("ingrese genero");
			 String fechain=vc.ReadString("ingrese fecha de inicio");
			 String medicontra=vc.ReadString("ingrese medico tratante");
			 pc=new Paciente(codigo,nombreapellido,prio,donde,diag,gen,fechain,medicontra);
			 int codigoaux=vc.ReadInteger("ingrese codigo de donde quiere ingresar antes");
			
		
			lis.insertarAntescod(codigoaux, pc);
			 
		 }else {
			String  donde=null;
			 
		 
		 String diag=vc.ReadString("Ingrese diagnostico");
		 String gen=vc.ReadString("ingrese genero");
		 String fechain=vc.ReadString("ingrese fecha de inicio");
		 String medicontra=vc.ReadString("ingrese medico tratante");
		 
		
		pc=new Paciente(codigo,nombreapellido,prio,donde,diag,gen,fechain,medicontra);
		 int codigoaux=vc.ReadInteger("ingrese codigo de donde quiere ingresar antes");
		
	
		lis.insertarAntescod(codigoaux, pc);

		 }
	}
	
	
	public void eliminar() {
		
		int cod= vc.ReadInteger("ingrese el numero del paciente que desea eliminar");
		lis.eliminarporcodigo(cod, pc);
	}
	public void consultar() {
		
		int cod=vc.ReadInteger("ingrese codigo a buscar");
		
		lis.buscar(cod, pc);
	}
}
