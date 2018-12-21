package templates.decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;
import templates.strategy.Animal;
import templates.strategy.SimpleDuck;
import templates.strategy.Tiger;

import java.io.IOException;

class VowelsPullingAnimalTest extends TestWithOwnWriter {
  private static final String roarSound = "Ррррр";
  private static final String quakSoubd = "Кряя-кряя";
  private static final String meowSound = "Мяяуу";
  private static final String addMeow= "-мяяуу";
  private static final int untilMeowAge = 2;

  @Test
  void testQuietAnimal() throws IOException {
    Animal duck = new VowelsPullingAnimal(new SimpleDuck());
    Animal littleTiger = new VowelsPullingAnimal(new Tiger());

    for (int i = 0; i < untilMeowAge; i++) {
      Assert.assertEquals(meowSound + addMeow.repeat(i), littleTiger.makeSound());
      littleTiger.grow(1);
    }
    Assert.assertEquals(roarSound + "!", littleTiger.makeSound());
    littleTiger.grow(1);

    Assert.assertEquals(quakSoubd, duck.makeSound());
  }

  @Test
  void testAge() {
    Animal bigTiger = new VowelsPullingAnimal(new Tiger().grow(2));
    Animal littleTiger = new VowelsPullingAnimal(new Tiger());

    for (int i = 0; i < untilMeowAge; i++) {
      Assert.assertEquals(i, littleTiger.getAge());
      littleTiger.grow(1);
    }

    Assert.assertEquals(2, bigTiger.getAge());
  }

  @Test
  protected void testWithOwnWriter() throws IOException {
    Animal littleTiger = new VowelsPullingAnimal(new Tiger());
    littleTiger.makeSound(OUT);
    Assert.assertEquals("Мяяуу\n", getStringAndClearWriter());
  }

}