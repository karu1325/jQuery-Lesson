import java.util.Scanner;
import java.util.Random;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("グー: 1, チョキ: 2, パー: 3 のいずれかの数字を入力してください: ");
    String user = scanner.next();
    System.out.println("あなたは" + user + "をだしました");

    Random random = new Random();

    int cpu = random.nextInt(3) + 1; //1-3からランダムな数字を出力
    switch (cpu) {
      case 1:
        System.out.println("CPUはグーをだしました");
        break;
      case 2:
        System.out.println("CPUはチョキをだしました");
        break;
      case 3:
        System.out.println("CPUはパーをだしました");
        break;
    }

    String judge =
  }
}
