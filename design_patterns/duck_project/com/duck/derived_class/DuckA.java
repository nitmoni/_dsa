package duck_project.com.duck.derived_class;

import duck_project.com.duck.base.Duck;
import duck_project.com.duck.behaviour.bahaviour_implementations.fly.FlySlow;
import duck_project.com.duck.behaviour.bahaviour_implementations.quack.Quack;

public class DuckA extends Duck {
  /*
   * Construct a default behaviour to duckA. Since it flies slowly and does quack.
   */
  public DuckA() {
    flyBehaviour = new FlySlow();
    quackBehaviour = new Quack();
  }

  @Override
  public void display() {
    System.out.println("This is DuckA...!");
  }
}