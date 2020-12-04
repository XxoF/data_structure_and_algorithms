public class TestLinkedList {
    
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.addFirst("aaa");
        list.addFirst("bbb");
        list.addFirst("ccc");
        list.print();

        System.out.println("Testing removal");
        list.removeFirst();
        list.print();

        if(list.contains("aaa")){
            list.addFirst("xxxx");
        }
        list.print();
    }
}
