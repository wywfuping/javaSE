
public class DengLu {
	public static void main(String[] args) {
		String[] names = new String[10];
		String[] pwds = new String[names.length];
		
		while(true){
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("=== 欢迎登录管理系统====");
            System.out.println("       1.登录");
            System.out.println("       2.注册");
            System.out.println("       3.退出");
            System.out.println("========================");
            System.out.print("请选择：");
            int num = sc.nextInt();
            if(num==1){
                System.out.println("选择登录！");
                System.out.print("用户名：");
                String name2 = sc.next();
                System.out.print("密码：");
        		String pwd2 = sc.next();
                for(int i = 0; i < names.length; i++) {
					if (names[i] == null || pwds[i] == null) {
						System.out.println("用户名或密码错误！");
						break;
					}
					if (name2.equals(names[i]) && pwd2.equals(pwds[i])) {
						System.out.println("登录成功！");
						break;
					}
				}
            }else if(num==2){
                System.out.println("选择注册！");
                System.out.print("用户名：");
                String name1 = sc.next();
                for (int i = 0; i < names.length; i++) {
                	if (names[i]!=null && name1.equals(names[i])) {
                    	System.out.println("用户名重复！");
                    	break;
    				}
                	if (names[i] == null) {
                		System.out.print("密码：");
                		String pwd1 = sc.next();
                		names[i] = name1;
                		pwds[i] = pwd1;
                		System.out.println("注册成功！");
                		break;
					}
				}
                
                
            }else if(num==3){
                System.out.println("成功退出！");
                break;
            }else{
                System.out.println("选择错误！");
            }
        }
        System.out.println("程序运行结束，正常关闭！");
	}
}
