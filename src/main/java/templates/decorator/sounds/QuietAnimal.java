package templates.decorator.sounds;

import templates.strategy.greetBehavior.GreetAnimal;

public class QuietAnimal extends SoundDecorator {

  public QuietAnimal(GreetAnimal animal) {
    super(animal);
  }

  protected String changeSound(String makeSound) {
    return makeSound.toLowerCase();
  }
}
