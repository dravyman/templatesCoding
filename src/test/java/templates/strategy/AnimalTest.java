package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class AnimalTest {
  private static List<Animal> animals;

  @BeforeAll
  static void setUp() {
    animals = List.of(new SimpleDuck(), new Tiger());
  }

  @Test
  void soundBehaviorTest() {
    for (Animal animal : animals) {
      Assert.assertNotNull(animal.makeSound());
    }
  }

  @Test
  void ageTest() {
    for (Animal animal : animals) {
      Assert.assertTrue(animal.getAge() >= 0);
      animal.grow(1);
      Assert.assertEquals(1, animal.getAge());
      animal.grow(2);
      Assert.assertEquals(3, animal.getAge());
    }
  }
}