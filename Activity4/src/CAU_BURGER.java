import java.util.Scanner;
class Orders{
    double sum;
    double defaultprice;

    Orders(double defaultprice){
        this.defaultprice = defaultprice;
    }

    double cal(){
        this.sum += this.defaultprice;
        return this.sum;
    }
}

class Burger extends Orders{
    int options;
    Burger(double defaultprice){
        super(defaultprice);
    }
    Burger(double defaultprice, int options){
        super(defaultprice);
        this.options= options;
    }

    double cal(){
        super.cal();
        if (this.options == 1) {
            sum += 600;
            System.out.print("You selected Cheese Burger.");
        }
        System.out.println("Price: $" + this.sum);
        return sum;
    }

}

class Nuggets extends Burger{

    int options;
    Nuggets(double defaultprice, int options) {
        super(defaultprice);
        this.options=options;
    }
    double cal(int counts){
        if(this.options == 1){
            this.sum += counts * this.defaultprice;
            System.out.println("You selected Chicken Nugget" + counts + " Price:$"+this.sum);
        }
        else{
            System.out.println("Price: "+this.sum+"$");
        }
        return sum;

    }

}

class Drink extends Orders{

    String options2;
    Drink(double defaultprice, String options) {
        super(defaultprice);
        this.options2 = options;
    }

    double cal(){
        super.cal();
        if(this.options2.equals("Large")){
            sum+=1000;
            System.out.println("You selected Soda Large. Price:$"+this.sum);
        }
        else{
            System.out.println("You selected Soda Medium. Price:$"+this.sum);
        }
        return sum;
    }

}

public class CAU_BURGER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        while(true){
            System.out.println("Please select the food you want to order (1:Burger, 2:Side, 3: Drink, 0: Finish ordering");
            int user_Choose = scanner.nextInt();

            switch(user_Choose){
                case 0:
                    System.out.println("The total price is "+sum+" won");
                    System.exit(1);


                case 1:
                    System.out.println("Want to add cheese? (1: add, 0: do not add)");
                    int options = scanner.nextInt();
                    Burger burger = new Burger(1500.0, options);
                    sum += burger.cal();
                    break;
                case 2:
                    System.out.println("How many would you like to order?");
                    int counts = scanner.nextInt();
                    Nuggets nuggets = new Nuggets(1500.0, 1);
                    sum += nuggets.cal(counts);
                    break;
                case 3:
                    System.out.println("Do you want a drink Large or Medium size");
                    String options2 = scanner.next();
                    Drink drink = new Drink(500.0, options2);
                    sum += drink.cal();
                    break;

            }

        }
    }
}