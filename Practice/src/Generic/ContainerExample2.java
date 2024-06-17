package Generic;

class Container2 <T,E>{
    T value1;
    E value2;

    public void set(T test1, E test2){
        this.value1 = test1;
        this.value2 = test2;
    }

    public T getKey(){
        return this.value1;
    }

    public E getValue(){
        return this.value2;
    }
}

public class ContainerExample2 {
    public static void main(String [] args){
        Container2<String, String> container1 = new Container2<>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        System.out.println(name1+job);

        Container2<String, Integer> container2 = new Container2<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println(name2+age);
    }
}
