package supermarket2;

/**
 * ��Ա��
 */
public class Vip {

    private String vid; // vip���
    private String vipFlag; // vip ���
    private String vipName; // vip����
    private String vipMoney; // vip���
    private int vipIntegral; // vip����

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
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

    @Override
    public String toString() {
        return "Vip{" +
                "vid='" + vid + '\'' +
                ", vipFlag='" + vipFlag + '\'' +
                ", vipName='" + vipName + '\'' +
                ", vipMoney='" + vipMoney + '\'' +
                ", vipIntegral=" + vipIntegral +
                '}';
    }
}

