package supermarket2;

import java.util.*;

import supermarket1.Festivalscost;

public class ShopMenu {
	// �������϶������ڴ洢��Ʒ��Ϣ����
	static List<Goods> array2 = Repository.getArray(); // ��Ʒ����
	static ArrayList<Goods> goodsArray = new ArrayList<Goods>(array2);
	static ArrayList<Bill> billArray = new ArrayList<Bill>(); // �˵�����
	static ArrayList<Vip> vipArray = new ArrayList<Vip>(); // ��Ա����

	public static void main(String[] args) {
		manageMenu();
	}
	
	// ���˵�
	static void manageMenu() {

		// ��ѭ������ٴλص�������
		while (true) {
			// ����������������ı�д
			System.out.println("---------��ӭ���뷽�۹���ϵͳ---------");
			System.out.println("1. ��Ʒ������ϵͳ");
			System.out.println("2. ����Ա����ϵͳ");
			System.out.println("3. ��Ա����ϵͳ");
			System.out.println("4. ��ڼ���۲鿴");
			System.out.println("5. �˳����۹���ϵͳ");
			System.out.println("������ָ�");
			// ��Scannerʵ�ּ���¼������
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// ��switch�����ɲ�����ѡ��
			switch (line) {

			case "1":
				GoodsManage.adminLogin(); // ����Ա��¼
				GoodsManage.goodsStockManage(goodsArray);
				break;

			case "2":
				MoneyManage.CashierLogin(); // ����Ա��½
				MoneyManage.moneyManage(goodsArray, billArray,vipArray);
				break;
			case "3":
				VipManage.adminLogin(); // ��Ա��½
				VipManage.vipManage(vipArray);
				break;
			case"4":
				Festivalscost fe=new Festivalscost();
        		fe.festivalscost();
				break;
			case "5":
				System.out.println("ллʹ�ã����˳�ϵͳ");
				// break;
				System.exit(0);// JVM�˳�
			}
		}
	}


}