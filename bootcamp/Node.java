public class Node<E>{
    private E element;
    private Node <E> next;

    public Node(){
        this(null,null);
    }

    public Node(E element){
        this(element,null);
    }

    public Node(E element, Node<E> next){
        this.element = element;
        this.next = next;
    }

    public E getData(){
        return this.element;
    }

    public Node<E> getNext(){
        return this.next;
    }

    public void setNext(Node<E> curr){
        this.next = curr;
    }
}