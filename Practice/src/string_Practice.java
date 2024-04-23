
class abc {
    private void pt(){
        System.out.println("HIII");
    }

    public void pt2(){
        pt();
    }
}

public class string_Practice {

    public static void main(String[]args){
        abc test = new abc();
        test.pt2();


    }
}
