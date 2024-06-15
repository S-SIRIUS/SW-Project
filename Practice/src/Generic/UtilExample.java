package Generic;
class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value= value;
    }
    public K getKey(){return key;}
    public V getValue(){return value;}
}

class ChildPair<K, V> extends Pair<K, V>{
    public ChildPair(K k, V v){
        super(k,v);
    }
}

class Util{
    public static <K,V> V getValue(Pair <K, V> p, K k){
        if(p.getKey().equals(k)){
            return p.getValue();
        }
        return null;
    }
}

public class UtilExample {
    public static void main(String [] args){
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);
    }
}
