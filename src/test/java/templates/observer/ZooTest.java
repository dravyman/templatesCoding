package templates.observer;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import templates.TestWithOwnWriter;
import templates.strategy.Tiger;

import java.io.IOException;

class ZooTest extends TestWithOwnWriter {

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
    Assert.assertEquals("Открытие зоопарка\n", tempZoo.getWritet().toString());
    tempZoo.close();
    Assert.assertNull(tempZoo.getWritet());
  }
  @Test
  void testZooWriter() {
    Assert.assertNotNull(myZoo.getWritet());
    Assert.assertEquals("Открытие зоопарка\n", myZoo.getWritet().toString());
  }

  @Test
  void testGreeting() {
    myZoo.addNewAnimal(new Tiger());
  }
}