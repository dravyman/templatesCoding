package templates.decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import templates.decorator.sounds.QuietAnimal;
import templates.strategy.Animal;
import templates.strategy.Tiger;
import templates.strategy.TigerTest;

import java.io.IOException;


class QuietAnimalTest extends TigerTest {
  private static final String roarSound = "ррррр";
  private static final String meowSound = "мяу";
  private static final String addMeow= "-мяу";
  private static final int untilWeawAge = 2;

  @Test
  void testQuietAnimal() throws IOException {
    Animal bigTiger = new QuietAnimal(new Tiger().grow(2));
    Animal littleTiger = new QuietAnimal(new Tiger());

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
  void testAge() {
    Animal bigTiger = new QuietAnimal(new Tiger().grow(2));
    Animal littleTiger = new QuietAnimal(new Tiger());

    for (int i = 0; i < untilWeawAge; i++) {
      Assert.assertEquals(i, littleTiger.getAge());
      littleTiger.grow(1);
    }

    Assert.assertEquals(2, bigTiger.getAge());
  }

  @Test
  protected void testWithOwnWriter() throws IOException {
    Animal littleTiger = new QuietAnimal(new Tiger());
    littleTiger.makeSound(OUT);
    Assert.assertEquals("мяу\n", getStringAndClearWriter());
  }
}