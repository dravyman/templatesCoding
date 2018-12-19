package templates.strategy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;

import java.io.IOException;

public class TigerTest extends TestWithOwnWriter {
  protected static String roarSound = "Ррррр";
  protected static String meowSound = "Мяу";
  private static String addMeow= "-мяу";
  protected static int untilWeawAge = 2;

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

  @Test
  protected void testWithOwnWriter() throws IOException {
    Tiger bigTiger = new Tiger().grow(2);
    Tiger littleTiger = new Tiger();

    for (int i = 0; i < untilWeawAge; i++) {
      littleTiger.makeSound(OUT);
      Assert.assertEquals(meowSound + addMeow.repeat(i) + "\n", getStringAndClearWriter());
      littleTiger.grow(1);
    }

    littleTiger.makeSound(OUT);
    Assert.assertEquals(roarSound + "!\n", getStringAndClearWriter());
    littleTiger.grow(1);

    bigTiger.makeSound(OUT);
    Assert.assertEquals(roarSound + "!\n", getStringAndClearWriter());
    bigTiger.grow(1);
    bigTiger.makeSound(OUT);
    Assert.assertEquals(roarSound + "р!\n", getStringAndClearWriter());
    bigTiger.grow(2);
    bigTiger.makeSound(OUT);
    Assert.assertEquals(roarSound + "ррр!\n", getStringAndClearWriter());
  }
}