package templates.decorator;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;
import templates.decorator.sounds.QuietAnimal;
import templates.decorator.sounds.VowelsPullingAnimal;
import templates.strategy.Animal;
import templates.strategy.SimpleDuck;
import templates.strategy.Tiger;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;

class AnimalTest extends TestWithOwnWriter {
  private static List<Animal> animals;

  @BeforeAll
  static void setUp() {
    animals = new ArrayList<>(List.of(new SimpleDuck(), new Tiger()));
  }

  @Test
  void soundBehaviorTest() {
    animals.add(new QuietAnimal(new Tiger()));
    animals.add(new VowelsPullingAnimal(new Tiger()));
    for (Animal animal : animals) {
      Assert.assertThat(animal, instanceOf(Animal.class));
    }

  }
}