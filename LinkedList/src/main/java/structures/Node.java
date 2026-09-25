package structures;

//Abstracción de la clase nodo para una lista doblemente enlazada
public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> prev;

    //Para crear el nodo solamente paso la info. que voy a guardar
    public Node(E data) {
        this.data = data;
    }

   // Consultar la información guardada en el nodo
    public E getData() {
        return data;
    }

    //Los getters me permiten consultas los enlaces (referencias a los otros nodos)
    public Node<E> getNext() {
        return next;
    }
    public Node<E> getPrev() {
        return prev;
    }

    //Los setters me permiten modificar los enlaces (referencias a los otros nodos)
    public void setNext(Node<E> next) {
        this.next = next;
    }
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
