package supermarket2;

import java.util.List;
import java.util.Map;

/**
 * �˵���
 */
public class Bill {
    private String bid; //�˵����
    private Map<String, String> idAndNum; // ��Ʒid������
    private String vipFlag; // vip��� 1.�����ǻ�Ա 0.�����ǻ�Ա
    private String vipName; // vip����
    private String vipMoney; // vip���
    private int vipIntegral; // vip����
    private String total; // �ܽ��

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Map<String, String> getIdAndNum() {
        return idAndNum;
    }

    public void setIdAndNum(Map<String, String> idAndNum) {
        this.idAndNum = idAndNum;
    }

    public String getVipFlag() {
        return vipFlag;
    }

    public void setVipFlag(String vipFlag) {
        this.vipFlag = vipFlag;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getVipMoney() {
        return vipMoney;
    }

    public void setVipMoney(String vipMoney) {
        this.vipMoney = vipMoney;
    }

    public int getVipIntegral() {
        return vipIntegral;
    }

    public void setVipIntegral(int vipIntegral) {
        this.vipIntegral = vipIntegral;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bid='" + bid + '\'' +
                ", idAndNum=" + idAndNum +
                ", vipFlag='" + vipFlag + '\'' +
                ", vipName='" + vipName + '\'' +
                ", vipMoney=" + vipMoney +
                ", vipIntegral=" + vipIntegral +
                ", total=" + total +
                '}';
    }
}
