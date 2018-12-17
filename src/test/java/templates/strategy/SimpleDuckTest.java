package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;

import java.io.IOException;

class SimpleDuckTest extends TestWithOwnWriter {
  private String defaultSound = "Кря-кря";

  @Test
  void testDuckSound() {
    Animal duck = new SimpleDuck();
    Assert.assertEquals(defaultSound , duck.makeSound());
    duck.grow(1);
    Assert.assertEquals(defaultSound , duck.makeSound());
  }

  @Test
  protected void testWithOwnWriter() throws IOException {
    Animal duck = new SimpleDuck();
    duck.makeSound(OUT);
    Assert.assertEquals(defaultSound + "\n", getStringAndClearWriter());
    duck.grow(1);
    duck.makeSound(OUT);
    Assert.assertEquals(defaultSound +"\n", getStringAndClearWriter());
  }
}
