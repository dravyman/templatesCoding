package templates.observer;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import templates.strategy.Tiger;

class ZooTest {

  private static Zoo myZoo;

  @BeforeAll
  static void setUp() {
    myZoo = new Zoo();
  }

  @Test
  void zooTest() {
    Assert.assertEquals(0, myZoo.getSize());
    Assert.assertEquals(1, myZoo.addNewAnimal(new Tiger()).getSize());
  }
}