package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TigerTest {
  private static String roarSound = "Ррррр";
  private static String meowSound = "Мяу";
  private static String addMeow= "-мяу";
  private static int untilWeawAge = 2;

  @Test
  void testTigerSound() {
    Tiger bigTiger = new Tiger().grow(2);
    Tiger littleTiger = new Tiger();

    for (int i = 0; i < untilWeawAge; i++) {
      Assert.assertEquals(meowSound + addMeow.repeat(i), littleTiger.makeSound());
      littleTiger.grow(1);
    }
    Assert.assertEquals(roarSound + "!", littleTiger.makeSound());
    littleTiger.grow(1);

    Assert.assertEquals(roarSound + "!", bigTiger.makeSound());
    bigTiger.grow(1);
    Assert.assertEquals(roarSound + "р!", bigTiger.makeSound());
    bigTiger.grow(2);
    Assert.assertEquals(roarSound + "ррр!", bigTiger.makeSound());
  }
}