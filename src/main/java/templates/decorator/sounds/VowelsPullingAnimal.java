package templates.decorator.sounds;

import templates.decorator.sounds.SoundDecorator;
import templates.strategy.greetBehavior.GreetAnimal;
import java.util.regex.Pattern;

public class VowelsPullingAnimal extends SoundDecorator {
  private static Pattern pattern = Pattern.compile("[eyuioaуеыаоэяию]");

  public VowelsPullingAnimal(GreetAnimal animal) {
    super(animal);
  }

  protected String changeSound(String makeSound) {
    return pattern.matcher(makeSound).replaceAll("$0$0");
  }
}
