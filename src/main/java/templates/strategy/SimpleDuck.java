package templates.strategy;

import templates.strategy.soundBehavior.QuakSound;

public class SimpleDuck extends Animal {

  public SimpleDuck() {
    super(new QuakSound());
  }
}
