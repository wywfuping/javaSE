
public class DengLu {
	public static void main(String[] args) {
		String[] names = new String[10];
		String[] pwds = new String[names.length];
		
		while(true){
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("=== ��ӭ��¼����ϵͳ====");
            System.out.println("       1.��¼");
            System.out.println("       2.ע��");
            System.out.println("       3.�˳�");
            System.out.println("========================");
            System.out.print("��ѡ��");
            int num = sc.nextInt();
            if(num==1){
                System.out.println("ѡ���¼��");
                System.out.print("�û�����");
                String name2 = sc.next();
                System.out.print("���룺");
        		String pwd2 = sc.next();
                for(int i = 0; i < names.length; i++) {
					if (names[i] == null || pwds[i] == null) {
						System.out.println("�û������������");
						break;
					}
					if (name2.equals(names[i]) && pwd2.equals(pwds[i])) {
						System.out.println("��¼�ɹ���");
						break;
					}
				}
            }else if(num==2){
                System.out.println("ѡ��ע�ᣡ");
                System.out.print("�û�����");
                String name1 = sc.next();
                for (int i = 0; i < names.length; i++) {
                	if (names[i]!=null && name1.equals(names[i])) {
                    	System.out.println("�û����ظ���");
                    	break;
    				}
                	if (names[i] == null) {
                		System.out.print("���룺");
                		String pwd1 = sc.next();
                		names[i] = name1;
                		pwds[i] = pwd1;
                		System.out.println("ע��ɹ���");
                		break;
					}
				}
                
                
            }else if(num==3){
                System.out.println("�ɹ��˳���");
                break;
            }else{
                System.out.println("ѡ�����");
            }
        }
        System.out.println("�������н����������رգ�");
	}
}
