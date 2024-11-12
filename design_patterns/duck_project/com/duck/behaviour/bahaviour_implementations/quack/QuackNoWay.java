package duck_project.com.duck.behaviour.bahaviour_implementations.quack;

import duck_project.com.duck.behaviour.QuackBehaviour;

public class QuackNoWay implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Can't quack...");
  }
}