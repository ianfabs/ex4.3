/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ex4;

public class App {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("First custsomer ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Second custsomer ordered a " + pizza.getName() + "\n");

    }
}
