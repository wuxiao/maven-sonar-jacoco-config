package sonar.jacoco.config.nested.b;

import org.junit.Test;

import sonar.jacoco.config.core.Foo;

public class FooBIT {
  @Test
  public void doB() {
    new Foo().doNestedBIntegrationTest();
  }
}
