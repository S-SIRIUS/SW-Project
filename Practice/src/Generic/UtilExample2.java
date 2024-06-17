package Generic;

class Pair2<K,V>{
    private K key;
    private V value;
    public Pair2(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){return key;}
    public V getValue(){return value;}
}

class ChildPair2<K, V> extends Pair2<K,V>{
    public ChildPair2(K k, V v){
        super(k,v);
    }
}

class Util2{
    public static <K,V> V getValue(Pair2<K,V> p, K k){
        if(p.getKey().equals(k)){
            return p.getValue();
        }
        return null;
    }
}

public class UtilExample2 {
    public static void main(String[] args){
        Pair2<String, Integer> pair = new Pair2<>("홍길동", 35);
        Integer age = Util2.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair2<String, Integer> childPair = new ChildPair2<>("홍길동", 20);
        Integer childAge = Util2.getValue(childPair, "홍길동");
        System.out.println(childAge);
    }
}