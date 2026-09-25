package structures;

//Abstracción de la clase de lista enlazada me permite manipular la lista enlazada
public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public LinkedList() {}

    // Operación de insertar al final
    public void insertNode(T data){
        Node<T> node = new Node<>(data);
        if(first==null){
            first = node;
            last = node;
        }
        last.setNext(node);
        node.setPrev(last);
        last = node;
    }

    //Operación de insertar en un punto especifico despues de un nodo
    public void insertNodeAfterNode(T data, T dataAfter){
        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = first;
        while(!currentNode.getData().equals(dataAfter)){
            currentNode = currentNode.getNext();
        }
        Node<T> temp = currentNode.getNext();
        // Modificar los enlaces a la izquierda del nuevo nodo
        currentNode.setNext(newNode);
        newNode.setPrev(currentNode);
        // Modificar los enlaces a la derecha del nuevo nodo
        newNode.setNext(temp);
        temp.setPrev(newNode);
    }

    //Operación de insertar en un punto especifico
    public void insertNodeBeforeNode(T data, T dataBefore){

    }

    //Operación de eliminar
    public void deleteNode(T data){

    }

    //Operación de búsqueda
    public void searchNode(T data){

    }

    //Operación de ordenar
    public void sort(){

    }
}
