package templates.observer;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;
import templates.strategy.SimpleDuck;
import templates.strategy.Tiger;

import java.io.IOException;

class ZooTest extends TestWithOwnWriter {

  private static final String SYSTEM_PREFIX = Zoo.SYSTEM_PREFIX;
  private static final String SYSTEM_GREETING = SYSTEM_PREFIX + "Открытие зоопарка";
  private static Zoo myZoo;

  @BeforeEach
  void setUp() throws IOException {
    myZoo = new Zoo(OUT);
  }

  @Test
  void addAnimals() {
    Assert.assertEquals(0, myZoo.getSize());
    Assert.assertEquals(1, myZoo.addNewAnimal(new Tiger()).getSize());
    Assert.assertEquals(2, myZoo.addNewAnimal(new Tiger()).getSize());
  }

  @Test
  void testZoo() throws IOException {
    Zoo tempZoo = new Zoo();
    Assert.assertNotNull(tempZoo.getWritet());
    Assert.assertEquals(SYSTEM_GREETING +"\n", tempZoo.getWritet().toString());
    tempZoo.close();
    Assert.assertNull(tempZoo.getWritet());
  }
  @Test
  void testZooWriter() {
    Assert.assertNotNull(OUT);
    Assert.assertEquals(SYSTEM_GREETING +"\n", OUT.toString());
  }

  @Test
  void testGreeting() {
    Assert.assertEquals(SYSTEM_GREETING + "\n", OUT.toString());
    Tiger firstTiger = new Tiger();
    myZoo.addNewAnimal(firstTiger);

    myZoo.addNewAnimal(new SimpleDuck());
    Assert.assertTrue(getStringAndClearWriter().contains(Tiger.GREETING));
    firstTiger.grow(1);

    myZoo.addNewAnimal(new Tiger());
    String currentOUT = getStringAndClearWriter();
    Assert.assertTrue(currentOUT.contains(Tiger.GREETING));
    Assert.assertTrue(currentOUT.contains("Привет Tiger!! Я добрая Утка!!!"));
  }
}