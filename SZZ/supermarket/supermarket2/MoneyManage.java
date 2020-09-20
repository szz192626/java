package supermarket2;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class MoneyManage {

    //���ﳵ����
    static Map<String, String> map = new HashMap<String, String>();

    // ��������
    static void moneyManage(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        while (true) {
            // ����������������ı�д
            System.out.println("---------��ӭ��������Աϵͳ---------");
            System.out.println("1. �鿴���е��˵�");
            System.out.println("2. ���ﳵ");
            System.out.println("3. ����");
            System.out.println("4. ���ط��۳���ϵͳ���˵�");
            System.out.println("������ָ�");
            // ��Scannerʵ�ּ���¼������
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            // ��switch�����ɲ�����ѡ��
            switch (line) {

                case "1":
                    searchBill(goodsArray, billArray, vipArray);
                    break;

                case "2":
                    shoppingCart(goodsArray, billArray, vipArray);
                    break;

                case "3":
                    closeAccounts(goodsArray, billArray, vipArray);
                    break;

                case "4":
                    ShopMenu.manageMenu(); // ���ص����˵�
            }
        }
    }

    // ����
    private static void closeAccounts(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        showShopCart(map, goodsArray, billArray, vipArray); // ��ʾ���ﳵ����
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        System.out.println("�Ƿ��л�Ա��?(1��, 0û��)");
        String vipFlag = sc.nextLine();
        int index = 0;

        if("1".equals(vipFlag)) {
            while (true) {
                System.out.println("��������Ļ�Ա����: ");
                String vid = sc.nextLine();
                index = isVip(vipArray, vid); //��������ֵ, �����ӡ�˵�
                if(index!=-1) {
                    break;
                }else if("-1".equals(vid)){
                    closeAccounts(goodsArray, billArray, vipArray);
                }else {
                    System.out.println("�Բ���, ���ǻ�Ա, �����������Ա���(���߰�-1���½���)");
                }
            }

            Vip vip = vipArray.get(index); // ͨ�������õ���Ա
            bill.setBid(getBid());
            bill.setVipFlag(vipFlag);
            bill.setVipName(vip.getVipName());
            Map<String, String> actualMap = (Map<String, String>) ((HashMap<String, String>) map).clone();
            bill.setIdAndNum(actualMap);
            // ��ʼ�����ܽ��
            String total = vipPrintBill(map, goodsArray,vipArray, index);
            bill.setTotal(total);
            bill.setVipMoney(vip.getVipMoney());
            bill.setVipIntegral(vip.getVipIntegral());
            billArray.add(bill);


        }else {
            bill.setBid(getBid());
            bill.setVipFlag(vipFlag);
            Map<String, String> actualMap = (Map<String, String>) ((HashMap<String, String>) map).clone();
            bill.setIdAndNum(actualMap);
            // ��ʼ�����ܽ��
            String total = printBill(map, goodsArray);
            bill.setTotal(total);
            billArray.add(bill);

        }
    }

    // ��ʾ���ﳵ
    private static void showShopCart(Map<String, String> map, ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        if(map.isEmpty()) {
            System.out.println("���ȹ�����, �ٽ��н���!");
            moneyManage(goodsArray, billArray, vipArray);
        } else {
            System.out.println("���ﳵ����������Ʒ: ");
            Iterator it = map.keySet().iterator(); // ������

            System.out.println("--------------���ﳵ----------------");

            System.out.println("��Ʒ����\t\t����\t����");
            // ����map����
            while (it.hasNext()) {
                String key = it.next().toString(); // ����
                // ��Ʒ����
                String goodsName = findGoodsName(key, goodsArray);
                // ��Ʒ����
                String goodsSize = map.get(key);
                // ��Ʒ����
                String goodsPrice = findGoodsPrice(key, goodsArray);
                // ��Ʒ
                System.out.println(goodsName + "\t\t" + goodsSize + "\t" + goodsPrice);

            }
            System.out.println("1. ����");
            System.out.println("2. ��������");
            Scanner sc = new Scanner(System.in);
            String selectNum = sc.nextLine();
            if ("2".equals(selectNum)) {
                moneyManage(goodsArray, billArray, vipArray);
            }
        }

    }
    // �ղ������ﳵ
    private static void shoppingCart(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        GoodsManage.showGoods(goodsArray);
        System.out.println("�ѽ��빺�ﳵ,�������Ʒ���,��ӵ����ﳵ");
        System.out.println("����������Ҫ����Ʒ(��д��Ʒ���, ����-1�˳�ѡ��): ");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("��������Ʒ���: ");
            String goodsId = sc.nextLine();

            if("-1".equals(goodsId)) {
                System.out.println("���˳����ﳵѡ��");
                break;
            }
            String goodsSize = "0";
            while(true) {
                System.out.println("��������Ʒ��������: ");
                goodsSize = sc.nextLine();
                int actualStock = findGoodsStock(goodsId, goodsArray);
                if( actualStock >= Integer.parseInt(goodsSize) || "-1".equals(goodsSize)) {
                    break;
                }else {
                    System.out.println("��治��, �ִ��" + actualStock + ", �����¹���(��-1��������Ʒ����)");
                }
            }

            map.put(goodsId, goodsSize);

        }
        moneyManage(goodsArray, billArray, vipArray);

    }

    // ��ѯ���е��˵�
    private static void searchBill(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {

        // �����Ʒ����Ϊ��
        if (billArray.isEmpty()) {
            System.out.println("�����˵�, ������ӹ��ﳵ,�ڽ��������˵�!");
            moneyManage(goodsArray, billArray, vipArray);
        }

        // չʾ�˵�
        showBill(goodsArray,billArray);
    }
    //չʾ�˵�
    private static void showBill(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray) {

        // ��ʾ��ͷ��Ϣ
        System.out.println("------------�˵�-----------");

        // ������������ȡ�����ն�Ӧ��ʽ��ʾ��Ʒ��Ϣ
        for (int i = 0; i < billArray.size(); i++) {
            Bill b = billArray.get(i);
            System.out.println("�˵����: " + b.getBid());

            // �ж��Ƿ�Ϊ��Ա
            if ("1".equals(b.getVipFlag())) {
                Map<String, String> idAndNum = b.getIdAndNum();
                Iterator it = idAndNum.keySet().iterator();
                double totalMoney = 0; // �ܽ��

                System.out.println("��Ʒ����\t\t����\t����");

                // ����map����
                while (it.hasNext()) {

                    String key = it.next().toString(); // ����
                    // ��Ʒ����
                    String goodsName = findGoodsName(key, goodsArray);
                    // ��Ʒ����
                    String goodsSize = idAndNum.get(key);
                    // ��Ʒ����
                    String goodsPrice = findGoodsPrice(key, goodsArray);
                    // ��Ʒ
                    System.out.println(goodsName + "\t\t" + goodsSize + "\t" + goodsPrice);

                }

                System.out.println("��Ʒ����: " + idAndNum.size());
                System.out.println("��Ʒ�ܽ��: " + b.getTotal());
                System.out.println("��Ա����: " + b.getVipName());
                System.out.println("��Ա�����: " + b.getVipMoney());
                System.out.println("��Ա������: " + b.getVipIntegral());
                System.out.println("-------------------------");
            } else {

                Map<String, String> idAndNum = b.getIdAndNum();
                Iterator it = idAndNum.keySet().iterator();
                double totalMoney = 0; // �ܽ��

                System.out.println("��Ʒ����\t\t����\t����");

                // ����map����
                while (it.hasNext()) {
                    String key = it.next().toString(); // ����
                    // ��Ʒ����
                    String goodsName = findGoodsName(key, goodsArray);
                    // ��Ʒ����
                    String goodsSize = idAndNum.get(key);
                    // ��Ʒ����
                    String goodsPrice = findGoodsPrice(key, goodsArray);
                    // ��Ʒ
                    System.out.println(goodsName + "\t\t" + goodsSize + "\t" + goodsPrice);

                }


                System.out.println("��Ʒ����: " + idAndNum.size());
                System.out.println("��Ʒ�ܽ��: " + b.getTotal());
                System.out.println("-------------------------");


            }
        }
    }
    // ����Ա��¼
    public static void CashierLogin() {

        Scanner scan = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        String username = null, password = null;
        String username1 = "bncmy";
        String password1 = "247246";
        boolean flag = true;
        do {
            System.out.println("�������û���(bncmy)��");
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

    // ͨ����Ʒid����Ʒ����
    public static String findGoodsName(String goodsId, ArrayList<Goods> goodsArray) {

        String goodsName = "";

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsName = goodsArray.get(i).getName();
            }
        }

        return goodsName;
    }

    // ͨ����Ʒid����Ʒ���
    public static int findGoodsStock(String goodsId, ArrayList<Goods> goodsArray) {

        int goodsStock = 0;

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsStock = goodsArray.get(i).getStock();
            }
        }

        return goodsStock;
    }

    // ͨ����Ʒid����Ʒ����
    public static String findGoodsPrice(String goodsId, ArrayList<Goods> goodsArray) {

        String goodsPrice = "";

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsPrice = goodsArray.get(i).getPrice();
            }
        }

        return goodsPrice;
    }

    // ͨ����Ʒid���ٿ��
    public static void reduceGoodsStock(String goodsId, ArrayList<Goods> goodsArray, String goodsSize) {
        int goodsStock = 0;

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsStock = goodsArray.get(i).getStock();
                goodsArray.get(i).setStock(goodsStock-Integer.parseInt(goodsSize));
            }
        }

    }
 // ͨ����Աid�һ�Ա����
    public static String findVipName(String vid, ArrayList<Vip> vipArray) {

        String vipName = "";

        for (int i = 0; i < vipArray.size(); i++) {
            if(vipArray.get(i).getVid().equals(vid)) {
                vipName = vipArray.get(i).getVipName();
            }
        }

        return vipName;
    }

    // ͨ����Աid����Ʒ���
    public static String findVipMoney(String vid, ArrayList<Vip> vipArray) {

        String vipMoney = "";

        for (int i = 0; i < vipArray.size(); i++) {
            if(vipArray.get(i).getVid().equals(vid)) {
                vipMoney = vipArray.get(i).getVipMoney();
            }
        }

        return vipMoney;
    }

    // ͨ����Աid���ӻ�Ա����
    public static int addVipIntegral(int index, ArrayList<Vip> vipArray, int vipIntegral) {

        int newVipIntegral = vipArray.get(index).getVipIntegral() + vipIntegral;  // ���ֵļ������
        vipArray.get(index).setVipIntegral(newVipIntegral);

        return newVipIntegral;
    }

    // ͨ����Աid���ٻ�Ա���
    public static String reduceVipMoney(String vid, ArrayList<Vip> vipArray, String vipMoney) {
        String newVipMoney = "";
        String newVipMoneyCpoy = "";
        BigDecimal money1 = new BigDecimal(vipMoney);

        for (int i = 0; i < vipArray.size(); i++) {
            if(vipArray.get(i).getVid().equals(vid)) {
                newVipMoney = vipArray.get(i).getVipMoney();
                BigDecimal money2 = new BigDecimal(newVipMoney);
                vipArray.get(i).setVipMoney(money2.subtract(money1).toString());
                newVipMoneyCpoy = vipArray.get(i).getVipMoney();
            }
        }
        return newVipMoneyCpoy;
    }

    // ��ѯ��Աid�Ƿ����
    public static int isVip(ArrayList<Vip> vipArray, String vid) {

        int flag = -1;
        for (int j = 0; j < vipArray.size(); j++) {

            Vip v = vipArray.get(j);
            if (v.getVid().equals(vid)) {

                flag = j;
                break;
            }

        }
        return flag;
    }

    // ����˵��ı�� ��������ʱ������Ϊ�˵��ı��
    public static String getBid () {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String format = sdf.format(date);
        return format;
    }
 // ��ӡ��Ʊ
    public static String printBill(Map<String, String> map, ArrayList<Goods> goodsArray) {

        Iterator it = map.keySet().iterator(); // ������

        double totalMoney = 0; // �ܽ��
        System.out.println("---------��ӭʹ�÷��۹���ϵͳ----------");
        System.out.println("---------------СƱ-----------------");
        System.out.println("��Ʒ����\t\t����\t����");
        int totalSize = 0 ; // ��Ʒ������
        BigDecimal sum = new BigDecimal("0");  // �ܽ��
        int mapSize = map.size();

        // ����map����
        while (it.hasNext()) {
            String key = it.next().toString(); // ����
            // ��Ʒ����
            String goodsName = findGoodsName(key ,goodsArray);
            // ��Ʒ����
            String goodsSize = map.get(key);
            BigDecimal goods_Size = new BigDecimal(goodsSize);
            totalSize += Integer.parseInt(goodsSize);
            // ��Ʒ����
            String goodsPrice = findGoodsPrice(key, goodsArray);
            BigDecimal goods_Price = new BigDecimal(goodsPrice);
            sum = sum.add(goods_Price.multiply(goods_Size));
            // ��Ʒ
            System.out.println(goodsName +"\t\t" + goodsSize + "\t" + goodsPrice);

            // ���ٿ��
            reduceGoodsStock(key, goodsArray, goodsSize);

            // ��ӡ��ȥ��Map�е�����
            it.remove();
            map.remove(key);
        }


        System.out.println("��Ʒ����: " + mapSize);
        System.out.println("��Ʒ������: " + totalSize);
        System.out.println("��Ʒ�ܶ�: " + sum.toString());
        System.out.println("-----------------------------------");

        return sum.toString();
    }

    // Vip��ӡ��Ʊ
    public static String vipPrintBill(Map<String, String> map, ArrayList<Goods> goodsArray, ArrayList<Vip> vipArray, int index) {

        Iterator it1 = map.keySet().iterator(); // ������
        Iterator it2 = map.keySet().iterator(); // ������

        int totalSize = 0 ; // ��Ʒ������
        BigDecimal sum = new BigDecimal("0");  // �ܽ��
        BigDecimal advanceSum = new BigDecimal("0");  // ��ǰ�����ܽ��
        
        Vip vip = vipArray.get(index); // ��Ա����
        BigDecimal vipMoney = new BigDecimal(vip.getVipMoney());  // ��Ա�����
        String balance = ""; // ֧�����Ա���
        int totalIntegral = 0; // ֧�����Ա����

        int mapSize = map.size();

        // ����map����
        while (it1.hasNext()) {
            String key = it1.next().toString(); // ����

            // ��Ʒ����
            String goodsSize = map.get(key);
            BigDecimal goods_Size = new BigDecimal(goodsSize);

            // ��Ʒ����
            String goodsPrice = findGoodsPrice(key, goodsArray);
            BigDecimal goods_Price = new BigDecimal(goodsPrice);
            advanceSum = advanceSum.add(goods_Price.multiply(goods_Size));
        }

        if(vipMoney.compareTo(advanceSum) > -1) {
            System.out.println("��Ա���������ڵ���֧�����ܽ��,�Ƿ�ѡ���Ա�����֧��?");
            System.out.println("1. ��Ա֧��");
            System.out.println("2. ֱ��֧��");
            Scanner sc = new Scanner(System.in);
            String payType = sc.nextLine();
            if("1".equals(payType)) {
                balance = reduceVipMoney(vip.getVid(), vipArray, advanceSum.toString()); // ֧���ۿ������

            }
            totalIntegral = addVipIntegral(index, vipArray, Integer.parseInt(advanceSum.toString().split("\\.")[0])); // ��Ա���ӻ���
        }

        System.out.println("---------��ӭʹ�÷��۹���ϵͳ----------");
        System.out.println("---------------СƱ-----------------");
        System.out.println("��Ʒ����\t\t����\t����");
        // ����map����
        while (it2.hasNext()) {
            String key = it2.next().toString(); // ����
            // ��Ʒ����
            String goodsName = findGoodsName(key ,goodsArray);
            // ��Ʒ����
            String goodsSize = map.get(key);
            BigDecimal goods_Size = new BigDecimal(goodsSize);
            totalSize += Integer.parseInt(goodsSize);
            // ��Ʒ����
            String goodsPrice = findGoodsPrice(key, goodsArray);
            BigDecimal goods_Price = new BigDecimal(goodsPrice);
            sum = sum.add(goods_Price.multiply(goods_Size));
            // ��Ʒ
            System.out.println(goodsName +"\t\t" + goodsSize + "\t" + goodsPrice);

            // ���ٿ��
            reduceGoodsStock(key, goodsArray, goodsSize);

            // ��ӡ��ȥ��Map�е�����
            it2.remove();
            map.remove(key);
        }




        System.out.println("��Ʒ����: " + mapSize);
        System.out.println("��Ʒ������: " + totalSize);
        System.out.println("��Ʒ�ܶ�: " + sum.toString());
        System.out.println("��Ա���:" + vip.getVid());
        System.out.println("��Ա���:" + vip.getVipMoney());
//        System.out.println("����Ա����Ƿ��޸�" + balance);
        System.out.println("��Ա����:" + vip.getVipIntegral());
//        System.out.println("����Ա�����Ƿ��޸�:" + totalIntegral);
        System.out.println("-----------------------------------");

        return sum.toString();
    }
}
