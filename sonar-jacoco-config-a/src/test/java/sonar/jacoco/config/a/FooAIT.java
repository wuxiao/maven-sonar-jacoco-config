package sonar.jacoco.config.a;

import org.junit.Test;

import sonar.jacoco.config.core.Foo;

public class FooAIT {
  @Test
  public void doA() {
    new Foo().doAIntegrationTest();
  }
}
