package templates.decorator.sounds;

import templates.decorator.AnimalDecorator;
import templates.observer.Zoo;
import templates.strategy.Animal;
import templates.strategy.greetBehavior.GreetAnimal;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.io.Writer;

public abstract class SoundDecorator extends AnimalDecorator {
  private GreetAnimal innerAnimal;

  public SoundDecorator(GreetAnimal animal) {
    innerAnimal = animal;
  }

  @Override
  public int getAge() {
    return innerAnimal.getAge();
  }


  @Override
  public String makeSound() {
    return changeSound(innerAnimal.makeSound());
  }

  @Override
  public void makeSound(Writer writer) throws IOException {
    writer.write(makeSound());
    writer.write('\n');
    writer.flush();
  }

  @Override
  public Animal grow(int i) {
    return innerAnimal.grow(i);
  }

  @Override
  public void propertyChange(PropertyChangeEvent changeEvent) {
    try {
      Zoo zoo = (Zoo) changeEvent.getSource();
      zoo.getWritet().write(changeSound(innerAnimal.getGreeting(changeEvent)) + '\n');
    } catch (IOException ignored) {}
  }

  protected abstract String changeSound(String makeSound);
}
