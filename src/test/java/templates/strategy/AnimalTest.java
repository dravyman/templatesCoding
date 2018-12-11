package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

class AnimalTest {

  @Test
  void firstTest() {
    List<Animal> animals = List.of(new SimpleDuck(), new Tiger());

    for (int i = 0; i < animals.size(); i++) {
      Assert.assertNotNull(animals.get(i).makeSound());
    }
  }
}