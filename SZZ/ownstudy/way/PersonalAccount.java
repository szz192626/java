package way;

/**
 * �����˻���
 * 
 * @author ��̬��
 *
 */
public class PersonalAccount {
//�������ԣ���ʹ���κ����η�
	private String accountId;
	private String pwd;
	private double balance;
	// �������и����˻����������
	private static double balancesum;
	// �������飬������־
	private String[] logInfo = new String[3];
	private int index;
//��̬�飬���������һ��	
	static {
		System.out.println("��̬�飺������Դ�ļ�....");
	}
//ʵ���飬ÿ�ε��ù��췽��ǰ������һ��
	{
		System.out.println("ʵ���飺�½���һ�������˻�....");
	}

//�ڲ��ֻ࣬��Ϊ����ʾ����ʵ������
	public class Helper {
		int x;

		public void help() {
			balance++;
		}

	}

//Ĭ���޲εĹ��췽��
	public PersonalAccount() {
		System.out.println("����PersonalAccount()");
	}

//��2�������Ĺ��췽��
	public PersonalAccount(String accounId, String pwd) {
		System.out.println("PersonalAccount(String accounId,String pwd)");
		this.accountId = accounId;
		this.pwd = pwd;

	}

//��3�������Ĺ��췽��
	public PersonalAccount(String accountId, String pwd, double balance) {
		System.out.println("PersonalAccount (String accountId,String pwd,double balance)");
		this.accountId = accountId;
		this.pwd = pwd;
		this.balance = balance;
		balancesum += balance;
	}

//�鿴ID
	public String getAccountId() {
		return accountId;
	}

//�޸�����
	public void setPwd(String newPwd) {

		pwd = newPwd;

	}

//�鿴���
	public double getBalance() {
		return balance;
	}

//������
	public void deposit(double amount) {
		balance += amount;
		balancesum += balance;
		if (index > 2) {
			index = 0;
		}
		logInfo[index] = "���ڴ��ɹ���" + amount;
		index++;
	}

//�����ڣ�ʹ�÷�������
	public void deposit(double amount, int term) {
		balance += amount;
		balancesum += balance;
		System.out.println("���ڣ�" + term);
		if (index > 2) {
			index = 0;
		}
		logInfo[index] = "���ڴ��ɹ���" + amount;
		index++;
	}

//ȡ�����͸֧
	public boolean withdraw(double amount) {
		if (amount > balance) {
			if (index > 2) {
				index = 0;
			}
			logInfo[index] = "ȡ��ʧ�ܣ�" + amount;
			index++;
			return false;
		} else {
			balance -= amount;
			balancesum-=balance;
			if(index>2) {
				index=0;
			}
			logInfo [index]="ȡ��ɹ���"+amount;
			index++;
			return true;
		}

	}
//�����������//Ϊ��̬����
	public static double getBalanceSum() {
		return balancesum;
	}
//������־����
	public String[] getLogInfo() {
		return this.logInfo;
	}

}