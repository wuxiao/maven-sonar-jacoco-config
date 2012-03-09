package sonar.jacoco.config.core;

import org.junit.Test;

import sonar.jacoco.config.core.Foo;

public class FooTest {
  @Test
  public void foo() {
    new Foo().regularTest();
  }
}
