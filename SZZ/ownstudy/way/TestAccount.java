package way;

public class TestAccount {
        public  static void main(String[] args ) {
//ʹ��Ĭ���޲εĹ��췽������һ��PersonalAccount��Ķ���
        	PersonalAccount  account1 = new PersonalAccount();
        	System.out.println("account1�˻�ID��"+account1.getAccountId());
        	System.out.println("account2�˻���"+account1.getBalance());
        	account1.deposit(1000);
        	System.out.println("����account1�˻���"+account1.getBalance());
        	account1.withdraw(200);
        	System.out.println("ȡ���account1�˻���"+account1.getBalance());
        	System.out.println("------------------------");
//ʹ�������������Ĺ��췽��
        	PersonalAccount account2 = new PersonalAccount("QWEEE12334","520ywyshnsntzwx"); 
        	System.out.println("Ŀǰ���˻�ID:"+account2.getAccountId());
        	
        	account2.deposit(1300);
        	System.out.println("Ŀǰ��"+account2.getBalance());
        	account2.withdraw(400);
        	
        	System.out.println("ȡ���Ŀǰ��"+account2.getBalance());
        	System.out.println("-------------------------");
//ʹ�������������Ĺ��췽��
        	PersonalAccount account3 = new PersonalAccount("QWEEE12334","520ywyshnsntzwx",30000);
        	System.out.println("Ŀǰ�˻���ID��"+account3.getAccountId());
        	System.out.println("Ŀǰ�˻�����"+account3.getBalance());
        	account3.deposit(10000);
        	System.out.println("�����˻�����"+account3.getBalance());
        	account3.withdraw(23450);
        	System.out.println("ȡ����˻�����"+account3.getBalance());
        	
        	//������־
        	PersonalAccount  account4=new PersonalAccount("9555","123",2000);
        	account4.deposit(2000);
        	account4.withdraw(1900);
        	account4.withdraw(200);
        	account4.withdraw(1200);
        	String[] logInfo=account4.getLogInfo();
        	for(String log:logInfo) {
        		System.out.println(log);
        	}
        	//����static��̬����
        	PersonalAccount account5=new PersonalAccount("1231212","323",2000);
        	account5.deposit(3000);
        	System.out.println(account4.getBalanceSum());
        	System.out.println(account5.getBalanceSum());
        	//���þ�̬������������
        	System.out.println(PersonalAccount.getBalanceSum());
        	System.out.println(PersonalAccount.getBalanceSum());
        	
        	
        	
        	
        	
    }
}
