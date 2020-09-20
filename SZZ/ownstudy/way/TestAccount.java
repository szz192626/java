package way;

public class TestAccount {
        public  static void main(String[] args ) {
//使用默认无参的构造方法创建一个PersonalAccount类的对象
        	PersonalAccount  account1 = new PersonalAccount();
        	System.out.println("account1账户ID："+account1.getAccountId());
        	System.out.println("account2账户余额："+account1.getBalance());
        	account1.deposit(1000);
        	System.out.println("存款后，account1账户余额："+account1.getBalance());
        	account1.withdraw(200);
        	System.out.println("取款后，account1账户余额："+account1.getBalance());
        	System.out.println("------------------------");
//使用有两个参数的构造方法
        	PersonalAccount account2 = new PersonalAccount("QWEEE12334","520ywyshnsntzwx"); 
        	System.out.println("目前的账户ID:"+account2.getAccountId());
        	
        	account2.deposit(1300);
        	System.out.println("目前金额："+account2.getBalance());
        	account2.withdraw(400);
        	
        	System.out.println("取款后，目前金额："+account2.getBalance());
        	System.out.println("-------------------------");
//使用有三个参数的构造方法
        	PersonalAccount account3 = new PersonalAccount("QWEEE12334","520ywyshnsntzwx",30000);
        	System.out.println("目前账户的ID："+account3.getAccountId());
        	System.out.println("目前账户的余额："+account3.getBalance());
        	account3.deposit(10000);
        	System.out.println("存款后账户的余额："+account3.getBalance());
        	account3.withdraw(23450);
        	System.out.println("取款后账户的余额："+account3.getBalance());
        	
        	//测试日志
        	PersonalAccount  account4=new PersonalAccount("9555","123",2000);
        	account4.deposit(2000);
        	account4.withdraw(1900);
        	account4.withdraw(200);
        	account4.withdraw(1200);
        	String[] logInfo=account4.getLogInfo();
        	for(String log:logInfo) {
        		System.out.println(log);
        	}
        	//测试static静态属性
        	PersonalAccount account5=new PersonalAccount("1231212","323",2000);
        	account5.deposit(3000);
        	System.out.println(account4.getBalanceSum());
        	System.out.println(account5.getBalanceSum());
        	//再用静态方法类名调用
        	System.out.println(PersonalAccount.getBalanceSum());
        	System.out.println(PersonalAccount.getBalanceSum());
        	
        	
        	
        	
        	
    }
}
