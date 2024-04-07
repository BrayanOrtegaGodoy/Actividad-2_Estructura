public class Main {
    public static void main(String[] args) {

        NuevaLista lista = new NuevaLista();

        lista.agregarAlFinal(4);
        lista.agregarAlFinal(3);
        lista.agregarAlFinal(2);
        lista.agregarAlFinal(1);
        
        BubbleSort.bubbleSort(lista); // Algoritmo de ordenamiento de burbuja
        SelectionSort.selectionSort(lista); // Algoritmo de ordenamiento de selección
        InsertionSort.insertionSort(lista); // Algoritmo de ordenamiento de inserción
        lista.listar();
    }
}

