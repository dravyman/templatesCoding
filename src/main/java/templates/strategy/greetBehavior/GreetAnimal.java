package templates.strategy.greetBehavior;

import templates.strategy.Animal;
import templates.strategy.soundBehavior.SoundBehaviar;

import java.beans.PropertyChangeEvent;

public abstract class GreetAnimal extends Animal {


  public abstract String getGreeting(PropertyChangeEvent changeEvent);

  public GreetAnimal(SoundBehaviar soundBehaviar) {
    super(soundBehaviar);
  }
}
