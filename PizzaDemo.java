public class PizzaDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();


        pizza1.AddTopping("Pepperoni");
        
        pizza2.AddTopping("Pepperoni");
        pizza2.AddTopping("Sausage");

        System.out.println("Comparing Pizza 1 to pizza 2 \n" + pizza1.equals(pizza2) + "\n" + pizza1.compareTo(pizza2));

        System.out.println("Comparing Pizza 1 to pizza 3 \n" + pizza1.equals(pizza3) + "\n" + pizza1.compareTo(pizza3));

        System.out.println("Comparing Pizza 2 to pizza 3 \n" + pizza2.equals(pizza3) + "\n" + pizza2.compareTo(pizza3));


        
    }
    
}
