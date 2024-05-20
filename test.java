public class test {

  public static void main(String[] args) {
    String[] names = {"Bob", "John", "Lily"};
    for (String name:names) {
      System.out.println("Hello" + name);
    }
    num();
  }

  public static void num() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
  }
}