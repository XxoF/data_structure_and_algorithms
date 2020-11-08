class test implements testI{

    private int numer;
    private int denom;

    public test(){
        this(1,1);
    }

    public test(int number, int denom){
        setNumer(numer);
        setDenom(denom);
    }

    public int getNumer(){
        return this.numer;
    }

    public int getDenom(){
        return this.denom;
    }

    public void setNumer(int numer){
        this.numer = numer;
    }

    public void setDenom(int denom){
        this.denom = denom;
    }

    public void print(){
        System.out.println(getNumer() + "/" + getDenom());
    }

    public String toString(){
        String s = getNumer() + "/" + getDenom() + "\n";
        return s;
    }

    private static int gcd(int a, int b){
        int rem;
        while(b > 0){
            rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }

}