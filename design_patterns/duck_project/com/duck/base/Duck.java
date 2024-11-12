package duck_project.com.duck.base;

import duck_project.com.duck.behaviour.FlyBehaviour;
import duck_project.com.duck.behaviour.QuackBehaviour;

public abstract class Duck {
  // These instances can reference to all of their subtypes.
  public QuackBehaviour quackBehaviour;
  public FlyBehaviour flyBehaviour;

  /*
   * Each duck has a unique display, so all subclasses have to take care of their own display logic.
   */
  public abstract void display();

  /*
   * Let's assume that this is the behaviour that all ducks have.
   */
  public void walk() {
    System.out.println("Walking...");
  }

  /*
   * Let's assume that this is the behaviour that all ducks have.
   */
  public void eat() {
    System.out.println("Eating...");
  }

  /*
   * Not all ducks quack and if they do, some of them quack different shounds. what should we do?
   * We should create another interface called QuackBehiour and there're *classes implement QuackBehaviour then define how the quack should behave.
   * void quack() {}
   */

  /*
   * These are methods to perform fly and quack;
   */

  public void performFly() {
    flyBehaviour.fly();
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

  /*
   * Define setter to be able to set fly or quack behaviour to a duck object during runtime.
   */

  public void setFlyBehaviour (FlyBehaviour fB) {
    flyBehaviour = fB;
  }

  public void setQuackBehaviour (QuackBehaviour qB) {
    quackBehaviour = qB;
  }
}
