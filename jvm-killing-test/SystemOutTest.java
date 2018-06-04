package you.really.care.about.path.mismatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SystemOutTest {

  @Test
  public void killJvm() {
    System.exit(1);
  }
}
