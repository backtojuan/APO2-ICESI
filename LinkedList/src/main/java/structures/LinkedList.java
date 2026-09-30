package structures;

//Abstracción de la clase de lista enlazada me permite manipular la lista enlazada
public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int totalNodes;

    public LinkedList() {}

    // Operación de insertar al final
    public void insertNode(T data){
        Node<T> node = new Node<>(data);
        if(first==null){
            first = node;
            last = node;
            totalNodes++;
        }
        last.setNext(node);
        node.setPrev(last);
        last = node;
        totalNodes++;
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
        totalNodes++;
    }

    //Operación de insertar en un punto especifico antes de un nodo
    public void insertNodeBeforeNode(T data, T dataBefore) {
        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = first;
        while (!currentNode.getData().equals(dataBefore)) {
            currentNode = currentNode.getNext();
        }
        newNode.setNext(currentNode);
        newNode.setPrev(currentNode.getPrev());
        currentNode.setPrev(newNode);
        newNode.getPrev().setNext(newNode);
        totalNodes++;
    }

    //Operación de eliminar al principio
    public void deleteNodeAtFirst(T data){
        if(first.getData().equals(data)){
            if(first.getNext()==null){
                first = null;
            }
            Node<T> temp = first.getNext();
            first.setNext(null);
            temp.setPrev(null);
            first = temp;
            totalNodes--;
        }
    }

    //Operación de eliminar al final
    public void deleteNodeAtLast(T data){
        if(last.getData().equals(data)){
            Node<T> temp = last.getPrev();
            last.setPrev(null);
            temp.setNext(null);
            last = temp;
            totalNodes--;
        }
    }
    //Operación de eliminar entre dos
    public void deleteNode(T data){
        Node<T> currentNode = first;
        while(!currentNode.getData().equals(data)){
            currentNode = currentNode.getNext();
            //Cuando no se encuentra el dato
            if(currentNode==last){
                break;
                //Lanzar una excepción personalizada DataNotFound, NodeNotFound
            }
        }
        if(currentNode!=last){
            Node<T> temp = currentNode.getPrev();
            currentNode.setPrev(null);
            temp.setNext(currentNode.getNext());
            currentNode.getNext().setPrev(temp);
            currentNode.setNext(null);
            totalNodes--;
        }
    }

    //Operación de búsqueda
    public boolean searchNode(T data){
        Node<T> currentNode = first;
        while(currentNode.getNext()!=null){
            if(currentNode.getData().equals(data)){
                return true;
            }
        }
        return false;
    }

    //Operación de ordenar
    /**
    public void bubbleSort(){
        Node<T> currentNode1 = first;
        Node<T> currentNode2 = first.getNext();
        for (int i = 1; i < totalNodes + 1; i++){
            while(){
                //Intercambio
                if(){

                }
                currentNode1 = currentNode1.getNext();
                currentNode2 = currentNode2.getNext();
            }
        }
    }*/
}
