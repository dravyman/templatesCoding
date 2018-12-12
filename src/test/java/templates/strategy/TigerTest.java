package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TigerTest {
  int untilWeawAge = 2;

  private String meawSound = "Мяу";
  private String roarSound = "Ррррр";

  @Test
  void testTigerSound() {
    Tiger littleTiger = new Tiger();

    for (int i = 0; i < untilWeawAge; i++) {
      Assert.assertEquals(meawSound, littleTiger.makeSound());
      littleTiger.grow(1);
    }
    Assert.assertEquals(roarSound + "!", littleTiger.makeSound());
    littleTiger.grow(1);
    Assert.assertEquals(roarSound + "р!", littleTiger.makeSound());
    littleTiger.grow(2);
    Assert.assertEquals(roarSound + "ррр!", littleTiger.makeSound());
  }
}