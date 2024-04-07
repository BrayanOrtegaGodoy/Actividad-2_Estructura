class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

class Lista:
    def __init__(self):
        self.inicio = None

    def agregar(self, dato):
        if not self.inicio:
            self.inicio = Nodo(dato)
        else:
            aux = self.inicio
            while aux.siguiente:
                aux = aux.siguiente
            aux.siguiente = Nodo(dato)

    def listar(self):
        aux = self.inicio
        while aux:
            print(aux.dato)
            aux = aux.siguiente
