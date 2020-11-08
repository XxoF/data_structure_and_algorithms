class MyLinkedList<E> implements ListInterface<E>{

    private Node<E> head;
    private Node<E> tail;
    private int numNode;

    public MyLinkedList(){
        head = null;
        numNode = 0;
    }
    @Override
    public void addFirst(E item){
        head = new Node<E>(item,head);
        numNode++;
    }
    @Override
    public void addAfter(Node<E> curr,E item){
        if (curr == null){
            addFirst(item);
        }
        else{
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
        }
        numNode++;
    }
    @Override
    public void addLast(E item){

    }
    @Override
    public E removeFirst() throws NoSuchElementException{
        E temp = null;
        return temp;
    }
    @Override
    public E removeAfter(Node <E> curr) throws NoSuchElementException{
        E temp = null;
        return temp;
    }
    @Override
    public E removeLast() throws NoSuchElementException{
        E temp = null;
        return temp;
    }
    @Override
    public int size(){
        return this.numNode;
    }
    @Override
    public boolean contains(E item){
        return false;
    }
    @Override
    public void print(){

    }
    @Override
    public boolean isEmpty(){
        return false;
    }
    @Override
    public Node<E> getHead(){
        return head;
    }
    @Override
    public E getFirst() throws NoSuchElementException{
        return head.getData();
    }
}