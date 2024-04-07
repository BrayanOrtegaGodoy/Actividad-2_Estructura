def main():
    
    lista = Lista()
    lista.agregar(4)
    lista.agregar(3)
    lista.agregar(2)
    lista.agregar(1)
    
    bubbleSort(lista) // Algoritmo de ordenamiento de burbuja
    selectionSort(lista) // Algoritmo de ordenamiento de selección
    insertionSort(lista) // Algoritmo de ordenamiento de inserción
    lista.listar()

if __name__ == "__main__":
    main()
