package co.edu.unbosque.model;
/**
* La clase Lista maneja la lógica de insercion,busqueda,eliminacion y edicion  de pacientes utilizando una lista compuesta por nodos.
*/
public class Lista {
	 Node cabeza;
	    int cantElementos;

	    public Lista(){
	    	
	        cabeza=null;
	        cantElementos=0;
	    }
	    
	    
	    public Lista insertarxcabeza(Paciente x){
	        Node nuevo= new Node(x);
	        nuevo.siguiente=cabeza;
	        cabeza=nuevo;
	        return this;
	    }
	    
	    public Lista insertarxcola(Paciente x) {
	    	
	    	Node nuevo= new Node(x);
	    	if(cabeza==null) {
	    		
	    		cabeza=nuevo;
	    	}else {
	    		
	    	Node actual=cabeza;
	    	while (actual.siguiente!=null) {
	    		actual=actual.siguiente;
	    		
	    		
	    	}
	    		actual.siguiente=nuevo;
	    }
	    	
	    	
		return this;
	    	
	    	
	    	
 }
	    
	    
	    public Lista insertarDespuesDeCodigo(int codigo, Paciente x) {
	        Node nuevo = new Node(x);  
	        
	        if (cabeza == null) {
	            cabeza = nuevo;  
	            return this;
	        }
	        
	        Node actual = cabeza;
	        while (actual != null) {
	            if (actual.dato.getCodigoUnico() == codigo) {
	                
	                nuevo.siguiente = actual.siguiente;
	                actual.siguiente = nuevo;
	                return this;
	            }
	            actual = actual.siguiente;  
	        }
	        
	       
	        return this;
	    }
	    
	    
	    
	    public Lista insertarAntesDeCodigo(int codigo, Paciente nuevoPaciente) {
	        Node nuevo = new Node(nuevoPaciente);  
	        if (cabeza == null) {
	            cabeza = nuevo; 
	        }
	        
	        if (cabeza.dato.getCodigoUnico() == codigo) {
	            
	            nuevo.siguiente = cabeza;
	            cabeza = nuevo;
	            return this;
	        }
	        
	        Node actual = cabeza;
	        while (actual.siguiente != null) {
	            if (actual.siguiente.dato.getCodigoUnico() == codigo) {
	          
	                actual.siguiente = nuevo;
	                return this;
	            }
	            actual = actual.siguiente;  
	        }
	        
	        
	        return this;
	    }
	    public void eliminar(Paciente x){
	         
	        Node anterior,actual;
	        boolean find=false;
	        actual=cabeza;
	        anterior=null;
	        while(actual!=null && !find)
	        {
	            find=actual.dato==x;
	            if(actual.dato==x)
	            {
	                anterior=actual;
	                actual=actual.siguiente;
	            }
	        }
	        if(actual!=null){
	            if(actual!=cabeza)
	                cabeza=actual.siguiente;
	            else{
	                anterior.siguiente=actual.siguiente;
	            }
	        }
	    }
	    
	    public Node buscar (Paciente x) {
	     for(Node indice= cabeza; indice!=null;indice=indice.siguiente) {
	    	 if(x==indice.dato) {
	    		return indice;
	    	 }
	     }
		return null;
	  }	  
	    
	    public  void eliminarporpos(int x,Paciente f) {
	    	Node anterior,actual;
	    	boolean find= false;
	    	int pos=0;
	    	actual=cabeza;
	    	anterior=null;
	    	while(actual!=null && !find) {
	    		pos++;
	    		find=actual.dato==f;
	    		if(pos==x) {
	    			anterior=actual;
	    			actual=actual.siguiente;
	    		}
	    		
	    	}
	    	if(actual!=null) {
	    		if(actual!=cabeza) 
	    			cabeza=actual.siguiente;
	    			else{
	    				anterior.siguiente=actual.siguiente;
	    		}
	    	}
	   
	    }
	    public void mostrarLista() {
	        Node actual = cabeza;

	        while (actual != null) {
	         System.out.println(actual.dato.toString());
	            actual = actual.siguiente;
	        }
	    }
}

	    
	

