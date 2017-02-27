

public class Lista {

    private Nodo inicio;
    private Integer valorMasGrande;

    public Integer getValorMasGrande() {
		return valorMasGrande;
	}

	public void setValorMasGrande(Integer valorMasGrande) {
		this.valorMasGrande = valorMasGrande;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Lista() {
        inicio = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void insertarFinal(Integer elem) {
        Nodo nuevo = new Nodo(elem);
        if (inicio == null) {
            inicio = nuevo;

        } else {

            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
    }


    
    public String imprimirDatos(){
	 	String a ="";
    	Nodo auxiliar = inicio;
    	while ( auxiliar != null){
    		
    		System.out.printf(""+auxiliar.getDato()+" ");
    		a = a + auxiliar.getDato()+"\n";
    		auxiliar = auxiliar.getSiguiente();
    		}
    		//System.out.printf("\n");
		return a;
 }

  
    
   
    
    
    public void ordenarBurbuja() {
		Nodo actual= inicio;
		Nodo siguiente;
		int t;
		while (actual.getSiguiente()!=null){
			siguiente= actual.getSiguiente();
			while ( siguiente!=null){
				if (actual.getDato()>siguiente.getDato()){
					t = siguiente.getDato();
					siguiente.setDato(actual.getDato());
					actual.setDato(t);
				}
				siguiente = siguiente.getSiguiente();
			}
			actual = actual.getSiguiente();
			siguiente = actual.getSiguiente();
		}
		
		System.out.printf("\nLista Ordenada!");
	 }


    
}
