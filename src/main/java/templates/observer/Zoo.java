package templates.observer;

import templates.strategy.Animal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
  private List<Animal> allAnimals;
  private Writer zooWriter;

  public Zoo() throws IOException {
    this(new StringWriter());
  }
  public Zoo(Writer writer) throws IOException {
    allAnimals = new ArrayList<>();
    zooWriter = writer;
    writer.append("Открытие зоопарка").append('\n');
  }

  public Zoo addNewAnimal(Animal newAnilmal) {
    allAnimals.add(newAnilmal);
    return this;
  }

  public int getSize() {
    return allAnimals.size();
  }

  public Writer getWritet() {
    return zooWriter;
  }

  public void close() throws IOException {
    zooWriter.close();
    zooWriter = null;
  }
}
