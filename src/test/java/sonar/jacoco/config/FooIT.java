package sonar.jacoco.config;

import org.junit.Test;

import sonar.jacoco.config.Foo;

public class FooIT {
  @Test
  public void doB() {
    new Foo().doB();
  }
}
