package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TigerTest {
  private String defaultSound = "Ррррр";


  @Test
  void testTigerSound() {
    Tiger tiger = new Tiger();
    Assert.assertEquals(defaultSound + "!", tiger.makeSound());
    tiger.grow(1);
    Assert.assertEquals(defaultSound + "р!", tiger.makeSound());
    tiger.grow(2);
    Assert.assertEquals(defaultSound + "ррр!", tiger.makeSound());
  }
}