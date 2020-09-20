package supermarket2;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsManage {

	// ��Ʒ������
	static void goodsStockManage(ArrayList<Goods> goodsArray) {

		while (true) {
			// ����������������ı�д
			System.out.println("---------��ӭ������Ʒ������ϵͳ---------");
			System.out.println("1. �鿴��Ʒ");
			System.out.println("2. ������Ʒ");
			System.out.println("3. �޸���Ʒ");
			System.out.println("4. ɾ����Ʒ");
			System.out.println("5. ���ط���ϵͳ���˵�");
			System.out.println("������ָ��");
			// ��Scannerʵ�ּ���¼������
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// ��switch�����ɲ�����ѡ��
			switch (line) {

			case "1":
				searchGoods(goodsArray);
				break;

			case "2":
				addGoods(goodsArray);
				break;

			case "3":
				updateGoods(goodsArray);
				break;

			case "4":
				deleteGoods(goodsArray);
				break;

			case "5":
				ShopMenu.manageMenu(); // ���ص����˵�
			}
		}

	}
	// ��ѯ��Ʒ
		public static void searchGoods(ArrayList<Goods> goodsArray) {

			// �����Ʒ����Ϊ��
			if (goodsArray.isEmpty()) {
				System.out.println("������Ʒ, ���������Ʒ!");
				goodsStockManage(goodsArray);
			}

			// չʾ��Ʒ
			showGoods(goodsArray);
		}

		// չʾ��Ʒ
		public static void showGoods(ArrayList<Goods> goodsArray) {

			// ��ʾ��ͷ��Ϣ
			System.out.println("��Ʒ���\t\t��Ʒ����\t����\t�������");

			// ������������ȡ�����ն�Ӧ��ʽ��ʾ��Ʒ��Ϣ
			for (int i = 0; i < goodsArray.size(); i++) {
				Goods g = goodsArray.get(i);
				System.out.println(g.getGid() + "\t" + g.getName() + "\t" + g.getPrice() + "\t" + g.getStock());
			}
		}

		// ������Ʒ
		private static void addGoods(ArrayList<Goods> goodsArray) {

			// ����¼��ѧ����������Ҫ�����ݣ���ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
			Scanner input = new Scanner(System.in);

			// Ϊ��gid��whileѭ�����汻���ʵ������ǾͰ�����������ѭ���⣻
			String gid;

			// Ϊ���ó���ص��������ʹ��ѭ��ʵ��
			while (true) {
				System.out.println("��������Ʒ���(����9λ)");
				gid = input.nextLine();
				boolean flag = isUsed(goodsArray, gid);
				if (flag) {
					System.out.println("���������Ʒ����Ѿ���ʹ�ã�����������!");
				} else {
					break;
				}
			}

			System.out.println("��������Ʒ����");
			String name = input.nextLine();
			System.out.println("��������Ʒ����");
			String price = input.nextLine();
			System.out.println("��������Ʒ���");
			int stock = input.nextInt();

			// ����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
			Goods g = new Goods();
			g.setGid(gid);
			g.setName(name);
			g.setPrice(price);
			g.setStock(stock);
			// ��ѧ��������ӵ�������
			goodsArray.add(g);
			System.out.println("�����Ʒ�ɹ�");
		}
		// �޸���Ʒ
		private static void updateGoods(ArrayList<Goods> goodsArray) {
			// ����¼��Ҫ�޸ĵ���Ʒ��ţ���ʾ��ʾ��Ϣ
			Scanner input = new Scanner(System.in);

			System.out.println("��������Ҫ�޸ĵ���Ʒ���");
			String gid = input.nextLine();
			int flag = -1;
			flag = getFlag(goodsArray, gid); // ��ȡ��Ʒ��ŵ�����
			if (flag == -1) {

				System.out.println("����Ϣ�����ڣ��޷��޸ģ����������룡");
				return;

			} else {

				// ����¼��Ҫ�޸ĵ�ѧ����Ϣ
				System.out.println("��������Ʒ�������ƣ�");
				String name = input.nextLine();
				System.out.println("��������Ʒ���µ��ۣ�");
				String price = input.nextLine();
				System.out.println("��������Ʒ���¿�棺");
				int stock = input.nextInt();

				// ����ѧ������
				Goods g = new Goods();
				g.setGid(gid);
				g.setName(name);
				g.setPrice(price);
				g.setStock(stock);

				// �������������ֵ�޸Ķ�Ӧ����Ʒ��Ϣ
				goodsArray.set(flag, g);

			}

			// �����޸ĳɹ���ʾ
			System.out.println("�޸���Ʒ��Ϣ�ɹ�");
		}

		// ɾ����Ʒ
		private static void deleteGoods(ArrayList<Goods> goodsArray) {
			// ����¼��Ҫɾ������Ʒ��ţ���ʾ��ʾ��Ϣ��
			Scanner input = new Scanner(System.in);

			System.out.println("��������Ҫɾ������Ʒ��");
			String gid = input.nextLine();
			// ��ɾ��/�޸���Ʒ����ǰ������Ʒ�Ƿ���ڽ����ж�
			// ��������ڣ���ʾ��ʾ��Ϣ
			// ���ڴ��ڣ����б������ϲ�������Ӧ��Ʒ����Ӽ�����ɾ��
			int index = -1;
			index = getFlag(goodsArray, gid); // �������
			if (index == -1) {
				System.out.println("����Ʒ��Ϣ�����ڣ�����������");
			} else {
				goodsArray.remove(index);
				// ����ɾ���ɹ���ʾ
				System.out.println("ɾ����Ʒ�ɹ�");
			}

		}
		// ����Ա��¼
		public static void adminLogin() {

			Scanner scan = new Scanner(System.in);
			Scanner reader = new Scanner(System.in);
			String username = null, password = null;
			String username1 = "szzcmy";
			String password1 = "247246";
			boolean flag = true;
			do {
				System.out.println("�������û���(szzcmy)��");
				username = reader.next();
				System.out.println("���������룺");
				password = reader.next();
				if (username.equals(username1) && password.equals(password1)) {
					System.out.println("����ɹ�!");
					flag = false;
				} else {
					System.out.println("�û��������������������������:");
				}

			} while (flag);
		}

		// �ж���Ʒ����Ƿ�ʹ��
		public static boolean isUsed(ArrayList<Goods> goodsArray, String gid) {
			// ����뼯���е�ĳһ����Ʒ�����ͬ������true�����������ͬ������false
			boolean flag = false;
			for (int i = 0; i < goodsArray.size(); i++) {
				Goods s = goodsArray.get(i);
				if (s.getGid().equals(gid)) {
					flag = true;
					break;
				}
			}
			return flag;
		}

		// ����һ����Ʒ���
		public static int getFlag(ArrayList<Goods> goodsArray, String gid) {
			int flag = -1;
			for (int j = 0; j < goodsArray.size(); j++) {

				Goods g1 = goodsArray.get(j);
				if (g1.getGid().equals(gid)) {

					flag = j;
					break;
				}

			}
			return flag;
		}

	}
