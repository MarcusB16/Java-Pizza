/*
 * Programmer Name: Marcus Brown
 * Class Name: Pizza
 * Date: 6/6/2023
 * Course CIS2353 O1568 
 * Purpose Statement: To apply knowledge of the Comparable interface to a problem and to understand and override the toString and equals methods.
 */

import java.util.ArrayList;

public class Pizza implements Comparable<Pizza> {
    enum Crust { Plain , Butter , Garlic , GarlicButter, Cheese}
    enum Size { Small, Medium, Large,XLarge, XXLarge, Party}
    private Crust crust;
    private ArrayList<String> toppings;
    private Size size;


       public Pizza() {
        crust = Crust.Plain;
        toppings = new ArrayList<>();
        size = Size.Small;
    }

    public Pizza(Crust crust, ArrayList<String> toppings, Size size) {
    this.crust = crust;
    this.toppings = toppings;
    this.size = size;
    }

    public void AddTopping(String Topping){
        toppings.add(Topping);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
    sb.append("This pizza has a ").append(crust).append(" crust and the following toppings:\n");
    if (toppings.isEmpty()) {
        sb.append("none");
    } else {
        for (String topping : toppings) {
            sb.append(topping).append("\n");
        }
    }
    return sb.toString();

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Pizza otherPizza = (Pizza) obj;
        
        return this.crust.equals(otherPizza.crust) && (this.toppings == null && otherPizza.toppings == null || 
       this.toppings != null && otherPizza.toppings != null && this.toppings.size() == otherPizza.toppings.size());
    }

    @Override
    public int compareTo(Pizza otherPizza){
        if (this.toppings.size() < otherPizza.toppings.size()){
            return -1;
        }
        else if (this.toppings.size() > otherPizza.toppings.size()){
            return 1;
        }
        return this.crust.compareTo(otherPizza.crust);
    }
}

