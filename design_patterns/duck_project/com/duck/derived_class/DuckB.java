package duck_project.com.duck.derived_class;

import duck_project.com.duck.base.Duck;
import duck_project.com.duck.behaviour.bahaviour_implementations.fly.FlyFast;
import duck_project.com.duck.behaviour.bahaviour_implementations.quack.QuackNoWay;

public class DuckB extends Duck {
  /**
   * Construct a default behaviour to duckA. Since it flies very fast and cannot quack.
   */
  public DuckB() {
    flyBehaviour = new FlyFast();
    quackBehaviour = new QuackNoWay();
  }

  @Override
  public void display() {
    System.out.println("This is DuckB...!");
  }
}
