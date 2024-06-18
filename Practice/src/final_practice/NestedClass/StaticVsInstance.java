package final_practice.NestedClass;
class oc{
    class ic{

    }

    static class sic{

    }
}

public class StaticVsInstance {
    public static void main(String[] args){
        oc temp = new oc();
        oc.ic test = temp.new ic();
        oc.sic test2 = new oc.sic();
    }
}
