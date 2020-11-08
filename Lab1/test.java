class test{

    public static void main(String[] args) {
        Object a = new Integer(10);
        Object b = a;
        System.out.println(a);
        System.out.println(b);
        a = 1230;
        System.out.println(a);
        System.out.println(b);
    }
}