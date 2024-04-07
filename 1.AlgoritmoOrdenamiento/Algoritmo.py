def main():
    
    lista = Lista()
    lista.agregar(4)
    lista.agregar(3)
    lista.agregar(2)
    lista.agregar(1)
    
    bubbleSort(lista) // Algoritmo de ordenamiento de burbuja
    selectionSort(lista) // Algoritmo de ordenamiento de selección
    insertionSort(lista) // Algoritmo de ordenamiento de inserción
    quickSort(lista) // Algoritmo de ordenamiento QuickSort
    mergeSort(lista) // Algoritmo de ordenamiento MergeSort
    lista.listar()

if __name__ == "__main__":
    main()
