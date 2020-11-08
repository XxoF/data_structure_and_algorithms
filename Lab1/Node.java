class Node<E>{

    private E element;
    private Node<E> next;

    public Node(){
        this(null,null);
    }

    public Node(E data){
        this(data,null);
    }

    public Node(E data, Node<E>next){
        setData(data);
        setNext(next);
    }

    public E getData(){
        return this.element;
    }

    public Node<E> getNext(){
        return this.next;
    }

    public void setData(E data){
        this.element = data;
    }

    public void setNext(Node <E> curr){
        this.next = curr;
    }

}

