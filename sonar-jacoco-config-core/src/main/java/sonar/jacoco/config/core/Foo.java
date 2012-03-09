package sonar.jacoco.config.core;

public class Foo {
  void regularTest() {
    System.out.println("regular test");
  }

  public void doAIntegrationTest() {
    System.out.println("A");
    System.out.println("A again");
  }

  public void doNestedBIntegrationTest() {
    System.out.println("B");
  }

  public void doNestedCIntegrationTest() {
    System.out.println("C");
  }
}
