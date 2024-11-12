package duck_project.com.duck;

import duck_project.com.duck.base.Duck;
import duck_project.com.duck.behaviour.bahaviour_implementations.fly.FlySlow;
import duck_project.com.duck.behaviour.bahaviour_implementations.quack.Sqeak;
import duck_project.com.duck.derived_class.DuckA;
import duck_project.com.duck.derived_class.DuckB;

/**
 * From head first design patterns chapter 1
 * - nitmoni
 */
public class Main {
  public static void main(String[] args) {
    /*
     * Instantiate object type duck.
     */
    Duck duckA = new DuckA();
    Duck duckB = new DuckB();

    duckA.display();
    duckA.eat();
    duckA.performFly();
    duckA.performQuack();

    System.out.println("---------------");

    duckB.display();
    duckB.eat();
    duckB.performFly();

    /*
     * Set new behaviours to DuckB during run time
     */
    duckB.setFlyBehaviour(new FlySlow());
    duckB.setQuackBehaviour(new Sqeak());

    duckB.performQuack();
    duckB.performFly();
  }
}