package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TigerTest {

  @Test
  void testTigerSound() {
    Tiger tiger = new Tiger();
    Assert.assertEquals("Ррррр!", tiger.makeSound());
  }
}