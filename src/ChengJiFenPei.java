
public class ChengJiFenPei {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] names = new String[10];
		int[] scores = new int[10];
		
		names[0] = "张三";
		scores[0] = 79;
		names[1] = "李四";
		scores[1] = 89;
		names[2] = "李雷";
		scores[2] = 95;
		System.out.println("请输入名字：");		
		String name = sc.next();
		System.out.println("请输入分数：");
		int score = sc.nextInt();
		
	}
}
