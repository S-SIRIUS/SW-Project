package final_practice;

public class generic_Type {
    public static class Product<K, M>{
        private K kind;
        private M model;
        private K getKind () { return this.kind; }
        private M getModel() { return this.model; }
        public void setKind(K kind) { this.kind = kind;}
        public void setModel(M model){this.model = model;}
    }
    public static class Tv{}
    public static class Car{}
    public static void main(String [] args){
        Product<Tv, String> product1 = new Product<>();
        Tv tv1 = new Tv();
        product1.setKind(tv1);
        product1.setModel("Smart Tv");

        Tv tv2 = product1.getKind();
        String tvModel = product1.getModel();

        Car car1 = new Car();
        Product<Car, String> product2 = new Product<>();
        product2.setKind(car1);
        product2.setModel("SUV");

        Car car2 = product2.getKind();
        String carModel = product2.getModel();
    }
}
