package supermarket2;

import java.util.Arrays;
import java.util.List;

public class Repository {

    public static List<Goods> getArray() {

        Goods[] data = new Goods[38];
        data[0]= new Goods("201912000","�˱���","4.5",10);
        data[1]= new Goods("201912001","����","3",10);
        data[2]= new Goods("201912002","��Ȫˮ","2",10);
        data[3]= new Goods("201912003","Ҭ��֭","8",10);
        data[4]= new Goods("201912004","ţ��","2",10);
        data[5]= new Goods("201912005","��Ƭ","6",10);
        data[6]= new Goods("201912006","����","5",10);
        data[7]= new Goods("201912007","����","6",10);
        data[8]= new Goods("201912008","������","8",10);
        data[9]= new Goods("201912009","����","1.5",10);
        data[10]= new Goods("201912010","С���","2",10);
        data[11]= new Goods("201912011","���","2",10);
        data[12]= new Goods("201912012","�ܲ�","1",10);
        data[13]= new Goods("201912013","���빽","3",10);
        data[14]= new Goods("201912014","������","4",10);
        data[15]= new Goods("201912015","�㽶","6",10);
        data[16]= new Goods("201912016","������","8",10);
        data[17]= new Goods("201912017","ƻ��","16",10);
        data[18]= new Goods("201912018","��ݮ","38",10);
        data[19]= new Goods("201912019","ţ��","50",10);
        data[20]= new Goods("201912020","����","50",10);
        data[21]= new Goods("201912021","����","60",10);
        data[22]= new Goods("201912022","����","50",10);
        data[23]= new Goods("201912023","��ΧϺ","38",10);
        data[24]= new Goods("201912024","����","26",10);
        data[25]= new Goods("201912025","������","45",10);
        data[26]= new Goods("201912026","�ͽ�ֽ","15",10);
        data[27]= new Goods("201912027","ë��","8",10);
        data[28]= new Goods("201912028","��ˢ","6",10);
        data[29]= new Goods("201912029","�����","25",10);
        data[30]= new Goods("201912030","ϴ�ྫ","25",10);
        data[31]= new Goods("201912031","����","8000",10);
        data[32]= new Goods("201912032","�յ�","8000",10);
        data[33]= new Goods("201912033","�����","200",10);
        data[34]= new Goods("201912034","����","300",10);
        data[35]= new Goods("201912035","С�����ϴ�","0.5",10);
        data[36]= new Goods("201912036","�к����ϴ�","0.8",10);
        data[37]= new Goods("201912037","������ϴ�","1",10);
        List<Goods> goodsArray = Arrays.asList(data);
        return goodsArray;
    }


}
