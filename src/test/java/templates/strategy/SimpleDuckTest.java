package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SimpleDuckTest {
  private String defaultSound = "Кря-кря";

  @Test
  void testDuckSound() {
    Animal duck = new SimpleDuck();
    Assert.assertEquals(defaultSound , duck.makeSound());
    duck.grow(1);
    Assert.assertEquals(defaultSound , duck.makeSound());
  }
}
