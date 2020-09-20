package supermarket2;

import java.util.ArrayList;
import java.util.Scanner;

public class VipManage {

	// ��Ա������
	static void vipManage(ArrayList<Vip> vipArray) {

		while (true) {
			// ����������������ı�д
			System.out.println("---------��ӭ�����Ա����ϵͳ---------");
			System.out.println("1. �鿴��Ա");
			System.out.println("2. ������Ա");
			System.out.println("3. �޸Ļ�Ա");
			System.out.println("4. ɾ����Ա");
			System.out.println("5. ������һ���˵�");
			System.out.println("���������ѡ��");
			// ��Scannerʵ�ּ���¼������
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// ��switch�����ɲ�����ѡ��
			switch (line) {

			case "1":
				searchVip(vipArray);
				break;

			case "2":
				addVip(vipArray);
				break;

			case "3":
				updateVip(vipArray);
				break;

			case "4":
				deleteVip(vipArray);
				break;

			case "5":
				ShopMenu.manageMenu(); // ���ص����˵�
			}
		}

	}

	// ��ѯ��Ա
	public static void searchVip(ArrayList<Vip> vipArray) {

		// �����Ա����Ϊ��
		if (vipArray.isEmpty()) {
			System.out.println("���޻�Ա, ������ӻ�Ա!");
			vipManage(vipArray);
		}

		// չʾ��Ա
		showVip(vipArray);
	}

	// չʾ��Ա
	public static void showVip(ArrayList<Vip> vipArray) {

		// ��ʾ��ͷ��Ϣ
		System.out.println("��Ա���\t\t��Ա����\t��Ա���\t��Ա����");

		// ������������ȡ�����ն�Ӧ��ʽ��ʾ��Ա��Ϣ
		for (int i = 0; i < vipArray.size(); i++) {
			Vip v = vipArray.get(i);
			System.out.println(v.getVid() + "\t" + v.getVipName() + "\t" + v.getVipMoney() + "\t\t" + v.getVipIntegral());
		}
	}

	// ������Ա
	private static void addVip(ArrayList<Vip> vipArray) {

		// ����¼���Ա��������Ҫ�����ݣ���ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
		Scanner input = new Scanner(System.in);

		// Ϊ��vid��whileѭ�����汻���ʵ������ǾͰ�����������ѭ���⣻
		String vid;

		// Ϊ���ó���ص��������ʹ��ѭ��ʵ��
		while (true) {
			System.out.println("�������Ա���(�����ֻ���)");
			vid = input.nextLine();
			boolean flag = isUsed(vipArray, vid);
			if (flag) {
				System.out.println("������Ļ�Ա����Ѿ���ʹ�ã�����������!");
			} else {
				break;
			}
		}

		System.out.println("�������Ա����");
		String vipName = input.nextLine();
		System.out.println("�������Ա���");
		String vipMoney = input.nextLine();
		System.out.println("�������Ա����");
		int vipIntegral = input.nextInt();
		// ������Ա���󣬰Ѽ���¼������ݸ�ֵ����Ա����ĳ�Ա����
				Vip v = new Vip();
				v.setVid(vid);
				v.setVipName(vipName);
				v.setVipMoney(vipMoney);
				v.setVipIntegral(vipIntegral);
				// �ѻ�Ա������ӵ�������
				vipArray.add(v);
				System.out.println("��ӻ�Ա�ɹ�");
			}

			// �޸Ļ�Ա
			private static void updateVip(ArrayList<Vip> vipArray) {
				// ����¼��Ҫ�޸ĵĻ�Ա��ţ���ʾ��ʾ��Ϣ
				Scanner input = new Scanner(System.in);

				System.out.println("��������Ҫ�޸ĵĻ�Ա���");
				String vid = input.nextLine();
				int flag = -1;
				flag = getFlag(vipArray, vid); // ��ȡ��Ա��ŵ�����
				if (flag == -1) {

					System.out.println("����Ϣ�����ڣ��޷��޸ģ����������룡");
					return;

				} else {

					// ����¼��Ҫ�޸ĵĻ�Ա��Ϣ
					System.out.println("�������Ա�������ƣ�");
					String vipName = input.nextLine();
					System.out.println("�������Ա���»�Ա��");
					String vipMoney = input.nextLine();
					System.out.println("�������Ա���»��֣�");
					int vipIntegral = input.nextInt();

					// ������Ա����
					Vip v = new Vip();
					v.setVid(vid);
					v.setVipName(vipName);
					v.setVipMoney(vipMoney);
					v.setVipIntegral(vipIntegral);

					// �������������ֵ�޸Ķ�Ӧ�Ļ�Ա��Ϣ
					vipArray.set(flag, v);

				}

				// �����޸ĳɹ���ʾ
				System.out.println("�޸Ļ�Ա��Ϣ�ɹ�");
			}

			// ɾ����Ա
			private static void deleteVip(ArrayList<Vip> vipArray) {
				// ����¼��Ҫɾ���Ļ�Ա��ţ���ʾ��ʾ��Ϣ��
				Scanner input = new Scanner(System.in);

				System.out.println("��������Ҫɾ���Ļ�Ա��ţ�");
				String vid = input.nextLine();
				// ��ɾ��/�޸Ļ�Ա����ǰ���Ի�Ա�Ƿ���ڽ����ж�
				// ��������ڣ���ʾ��ʾ��Ϣ
				// ���ڴ��ڣ����б������ϲ�������Ӧ��Ա����Ӽ�����ɾ��
				int index = -1;
				index = getFlag(vipArray, vid); // �������
				if (index == -1) {
					System.out.println("�û�Ա��Ϣ�����ڣ�����������");
				} else {
					vipArray.remove(index);
					// ����ɾ���ɹ���ʾ
					System.out.println("ɾ����Ա�ɹ�");
				}

			}
			// ����Ա��¼
			public static void adminLogin() {

				Scanner scan = new Scanner(System.in);
				Scanner reader = new Scanner(System.in);
				String username = null, password = null;
				String username1 = "alnecmy";
				String password1 = "247246";
				boolean flag = true;
				do {
					System.out.println("�������û���(alnecmy)��");
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

			// �жϻ�Ա����Ƿ�ʹ��
			public static boolean isUsed(ArrayList<Vip> vipArray, String vid) {
				// ����뼯���е�ĳһ����Ա�����ͬ������true�����������ͬ������false
				boolean flag = false;
				for (int i = 0; i < vipArray.size(); i++) {
					Vip s = vipArray.get(i);
					if (s.getVid().equals(vid)) {
						flag = true;
						break;
					}
				}
				return flag;
			}

			// ����һ����Ա���
			public static int getFlag(ArrayList<Vip> vipArray, String vid) {
				int flag = -1;
				for (int j = 0; j < vipArray.size(); j++) {

					Vip g1 = vipArray.get(j);
					if (g1.getVid().equals(vid)) {

						flag = j;
						break;
					}

				}
				return flag;
			}

		}
