package templates.decorator;

import templates.observer.Zoo;
import templates.strategy.Animal;
import templates.strategy.greetBehavior.GreetAnimal;

import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.io.Writer;

public class QuietAnimal extends AnimalDecorator {
  private final GreetAnimal animal;

  public QuietAnimal(GreetAnimal animal) {
    this.animal = animal;
  }

  @Override
  public int getAge() {
    return animal.getAge();
  }

  @Override
  public Animal grow(int i) {
    return animal.grow(i);
  }

  @Override
  public String makeSound() {
    return animal.makeSound().toLowerCase();
  }

  @Override
  public void makeSound(Writer writer) throws IOException {
    writer.write(makeSound());
    writer.write('\n');
    writer.flush();
  }

  @Override
  public void propertyChange(PropertyChangeEvent changeEvent) {
    try {
      Zoo zoo = (Zoo) changeEvent.getSource();
      zoo.getWritet().write(animal.getGreeting(changeEvent).toLowerCase() + '\n');
    } catch (IOException ignored) {}
  }
}
