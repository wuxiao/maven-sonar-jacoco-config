package sonar.jacoco.config;

import org.junit.Test;

import sonar.jacoco.config.Foo;

public class FooTest {
  @Test
  public void foo() {
    new Foo().doA();
  }
}
