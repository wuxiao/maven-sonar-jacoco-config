package sonar.jacoco.config.nested.c;

import org.junit.Test;

import sonar.jacoco.config.core.Foo;

public class FooCIT {
  @Test
  public void doC() {
    new Foo().doNestedCIntegrationTest();
  }
}
