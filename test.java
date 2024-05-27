public class test {

  public static void main(String[] args) {
    String[] names = {"Bob", "John", "Lily"};
      for (String name:names) {
        System.out.println("Hello" + name);
      }
      num(3);
      for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
      }
  }

  public static void num(int number) {
    switch (number) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("吉");
        break;
      default:
        System.out.println("凶");
        break;
    }
  }
}