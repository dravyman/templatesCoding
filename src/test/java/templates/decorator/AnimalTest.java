package templates.decorator;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;
import templates.strategy.Animal;
import templates.strategy.SimpleDuck;
import templates.strategy.Tiger;

import java.util.List;

class AnimalTest extends TestWithOwnWriter {
  private static List<Animal> animals;

  @BeforeAll
  static void setUp() {
    animals = List.of(new SimpleDuck(), new Tiger());
  }

  @Test
  void soundBehaviorTest() {
    for (Animal animal : animals) {
//      Assert.assertNotNull(animal.getDescription());
    }
  }
}