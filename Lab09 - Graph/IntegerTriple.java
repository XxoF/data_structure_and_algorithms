public class IntegerTriple{
    private Integer weight;
    private Integer source;
    private Integer dest;

    private IntegerTriple(Integer w, Integer s, Integer d){
        weight = w;
        source = s;
        dest = d;
    }

    private IntegerTriple(Integer s, Integer d){
        this(1,d,s);
    }

    private Integer getWeight(){
        return weight;
    }

    private Integer getSource(){
        return source;
    }

    private Integer getDest(){
        return dest;
    }

    @Override
    public String toString(){
        return weight + " " + source + " " + dest;
    }
}