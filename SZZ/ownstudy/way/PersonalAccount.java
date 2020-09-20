package way;

/**
 * 个人账户类
 * 
 * @author 囧态汗
 *
 */
public class PersonalAccount {
//声明属性，不使用任何修饰符
	private String accountId;
	private String pwd;
	private double balance;
	// 储存所有个人账户的余额总数
	private static double balancesum;
	// 声明数组，保存日志
	private String[] logInfo = new String[3];
	private int index;
//静态块，类加载运行一次	
	static {
		System.out.println("静态块：加载资源文件....");
	}
//实例块，每次调用构造方法前，运行一次
	{
		System.out.println("实例块：新建了一个银行账户....");
	}

//内部类，只是为了演示，无实际意义
	public class Helper {
		int x;

		public void help() {
			balance++;
		}

	}

//默认无参的构造方法
	public PersonalAccount() {
		System.out.println("调用PersonalAccount()");
	}

//有2个参数的构造方法
	public PersonalAccount(String accounId, String pwd) {
		System.out.println("PersonalAccount(String accounId,String pwd)");
		this.accountId = accounId;
		this.pwd = pwd;

	}

//有3个参数的构造方法
	public PersonalAccount(String accountId, String pwd, double balance) {
		System.out.println("PersonalAccount (String accountId,String pwd,double balance)");
		this.accountId = accountId;
		this.pwd = pwd;
		this.balance = balance;
		balancesum += balance;
	}

//查看ID
	public String getAccountId() {
		return accountId;
	}

//修改密码
	public void setPwd(String newPwd) {

		pwd = newPwd;

	}

//查看金额
	public double getBalance() {
		return balance;
	}

//存款，活期
	public void deposit(double amount) {
		balance += amount;
		balancesum += balance;
		if (index > 2) {
			index = 0;
		}
		logInfo[index] = "活期存款成功：" + amount;
		index++;
	}

//存款，定期，使用方法重载
	public void deposit(double amount, int term) {
		balance += amount;
		balancesum += balance;
		System.out.println("存期：" + term);
		if (index > 2) {
			index = 0;
		}
		logInfo[index] = "定期存款成功：" + amount;
		index++;
	}

//取款，不能透支
	public boolean withdraw(double amount) {
		if (amount > balance) {
			if (index > 2) {
				index = 0;
			}
			logInfo[index] = "取款失败：" + amount;
			index++;
			return false;
		} else {
			balance -= amount;
			balancesum-=balance;
			if(index>2) {
				index=0;
			}
			logInfo [index]="取款成功："+amount;
			index++;
			return true;
		}

	}
//返回余额总数//为静态方法
	public static double getBalanceSum() {
		return balancesum;
	}
//返回日志数组
	public String[] getLogInfo() {
		return this.logInfo;
	}

}