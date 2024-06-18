package final_practice.Generics;
class Pair3<K,V>{
    private K key;
    private V value;
    public Pair3(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){return key;}
    public V getValue(){return value;}
}

class ChildPair3<K, V> extends Pair3<K,V> {
    public ChildPair3(K k, V v){
        super(k,v);
    }
}

class Util3{
    public static <K,V> V getValue(Pair3<K,V> p, K key){
        if(p.getKey().equals(key)){
            return p.getValue();
        }
        return null;

    }
}

public class UtilExample2 {
    public static void main(String[] args){
        Pair3<String, Integer> pair = new Pair3<>("홍길동", 35);
        Integer age = Util3.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair3<String, Integer> childPair = new ChildPair3<>("홍길동", 20);
        Integer childAge = Util3.getValue(childPair, "홍길동");
        System.out.println(childAge);
    }
}