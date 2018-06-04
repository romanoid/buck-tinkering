package you.really.care.about.path.mismatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TimeOutTest {

  @Test
  public void forkError() {
    try {
      while (true) {
        Thread.sleep(100);
        new Thread(() -> forkError()).start();
        System.out.println("foobar");
      }
    } catch (Throwable t) {
      forkError();
    }
  }
}
