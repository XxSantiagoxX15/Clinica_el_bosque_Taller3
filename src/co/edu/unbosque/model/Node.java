package co.edu.unbosque.model;

public class Node {

    Paciente dato;
    Node siguiente;

    public Node(Paciente x){
        dato=x;
    }
    
    public Node(Paciente x,Node s){
        dato=x;
        siguiente=s;
    }
}

