package templates;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.io.StringWriter;

public abstract class TestWithOwnWriter {
  protected static final StringWriter OUT = new StringWriter();
  private static final StringBuffer BUF = OUT.getBuffer();

  @BeforeEach
  void  refreshOUT() {
    getStringAndClearWriter();
  }
  @AfterAll
  static void setOut() throws IOException {
    OUT.close();
  }

  protected static String getStringAndClearWriter() {
    String res = "";
    int len;
    if ((len = BUF.length()) > 0) {
      res = OUT.toString();
      BUF.delete(0, len);
    }
    return res;
  }
}
