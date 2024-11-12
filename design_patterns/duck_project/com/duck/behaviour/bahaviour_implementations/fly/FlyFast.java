package duck_project.com.duck.behaviour.bahaviour_implementations.fly;

import duck_project.com.duck.behaviour.FlyBehaviour;

public class FlyFast implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("Flying fast...");
  }
}