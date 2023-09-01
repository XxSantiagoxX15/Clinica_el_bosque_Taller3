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
	    
	    
	    public Lista insertarDespcod(int codigo, Paciente x) {
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
	    
	    
	    
	    public Lista insertarAntescod(int codigo, Paciente x) {
	        Node nuevo = new Node(x);  
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
	
	    
	    public Node buscar (int cod,Paciente x) {
	     for(Node indice= cabeza; indice!=null;indice=indice.siguiente) {
	    	 if(cod==indice.dato.getCodigoUnico()) {
	    		
	    		 System.out.println(indice.dato.toString());
	    		 return indice;
	    		
	    	 }
	     }
		return null;
	  }	  
	    
	    public void eliminarporcodigo(int cod,Paciente x) {
	        Node anterior = null;
	        Node actual = cabeza;

	        while (actual != null) {
	            if (actual.dato.getCodigoUnico() == cod) {
	                if (anterior == null) {
	                   
	                    cabeza = actual.siguiente;
	                } else {
	                    anterior.siguiente = actual.siguiente;
	                }
	                return; 
	            }
	            anterior = actual;
	            actual = actual.siguiente;
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

	    
	

