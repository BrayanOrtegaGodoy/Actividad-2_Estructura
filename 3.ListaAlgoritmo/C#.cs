class Program {

    static void Main(string[] args) {

        Lista lista = new Lista();
        lista.agregar(4);
        lista.agregar(3);
        lista.agregar(2);
        lista.agregar(1);
        
        BubbleSort.bubbleSort(lista); // Algoritmo de ordenamiento de burbuja
        SelectionSort.selectionSort(lista); // Algoritmo de ordenamiento de selección
        InsertionSort.insertionSort(lista); // Algoritmo de ordenamiento de inserción
        lista.listar();
    }
}
