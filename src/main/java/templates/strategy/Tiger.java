package templates.strategy;

import templates.strategy.soundBehavior.TigerSound;

public class Tiger extends Animal {

  public Tiger() {
    super(new TigerSound());
  }
}
