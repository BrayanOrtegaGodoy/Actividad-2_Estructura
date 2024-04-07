public class Nodo
{
    public int dato;
    public Nodo siguiente;

    public Nodo(int d)
    {
        dato = d;
        siguiente = null;
    }
}

public class Lista
{
    private Nodo inicio;

    public Lista()
    {
        inicio = null;
    }

    public void agregar(int dato)
    {
        if (inicio == null)
        {
            inicio = new Nodo(dato);
        }
        else
        {
            Nodo aux = inicio;
            while (aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
            aux.siguiente = new Nodo(dato);
        }
    }

    public void listar()
    {
        Nodo aux = inicio;
        while (aux != null)
        {
            Console.WriteLine(aux.dato);
            aux = aux.siguiente;
        }
    }
}
