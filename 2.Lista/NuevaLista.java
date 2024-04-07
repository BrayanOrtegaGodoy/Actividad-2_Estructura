class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Lista {
    Nodo inicio;

    public Lista() {
        this.inicio = null;
    }

    public void agregar(int dato) {
        if (inicio == null) {
            inicio = new Nodo(dato);
        } else {
            Nodo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = new Nodo(dato);
        }
    }

    public void listar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }
}


