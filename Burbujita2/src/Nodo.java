public class Nodo {
	private Nodo siguiente;
	private Nodo anterior;
	private Integer dato;
	private String dato2;

//constructor
	public Nodo(Integer d){
		this.dato=d;
		siguiente=null;
		anterior=null;
	}

	public Nodo(String d){
		this.dato2=d;
		siguiente=null;
		anterior=null;
	}
	public String getDato2() {
		return dato2;
	}

	public void setDato2(String dato2) {
		this.dato2 = dato2;
	}

	public Nodo(){
		
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Integer getDato() {
		return dato;
	}

	public void setDato(Integer dato) {
		this.dato = dato;
	}

}