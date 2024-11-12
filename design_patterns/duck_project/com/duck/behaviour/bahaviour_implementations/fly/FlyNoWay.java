package duck_project.com.duck.behaviour.bahaviour_implementations.fly;

import duck_project.com.duck.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("Can't fly...");
  }
}