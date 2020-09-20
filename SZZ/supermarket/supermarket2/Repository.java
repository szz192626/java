package supermarket2;

import java.util.Arrays;
import java.util.List;

public class Repository {

    public static List<Goods> getArray() {

        Goods[] data = new Goods[38];
        data[0]= new Goods("201912000","°Ë±¦Öà","4.5",10);
        data[1]= new Goods("201912001","¿ÉÀÖ","3",10);
        data[2]= new Goods("201912002","¿óÈªË®","2",10);
        data[3]= new Goods("201912003","Ò¬×ÓÖ­","8",10);
        data[4]= new Goods("201912004","Å£ÄÌ","2",10);
        data[5]= new Goods("201912005","ÊíÆ¬","6",10);
        data[6]= new Goods("201912006","µ°¸â","5",10);
        data[7]= new Goods("201912007","±ı¸É","6",10);
        data[8]= new Goods("201912008","µ°»ÆËÖ","8",10);
        data[9]= new Goods("201912009","À±Ìõ","1.5",10);
        data[10]= new Goods("201912010","Ğ¡Óã¸É","2",10);
        data[11]= new Goods("201912011","Çà²Ë","2",10);
        data[12]= new Goods("201912012","ÂÜ²·","1",10);
        data[13]= new Goods("201912013","½ğÕë¹½","3",10);
        data[14]= new Goods("201912014","Î÷À¼»¨","4",10);
        data[15]= new Goods("201912015","Ïã½¶","6",10);
        data[16]= new Goods("201912016","»ğÁú¹û","8",10);
        data[17]= new Goods("201912017","Æ»¹û","16",10);
        data[18]= new Goods("201912018","²İİ®","38",10);
        data[19]= new Goods("201912019","Å£Èâ","50",10);
        data[20]= new Goods("201912020","ÑòÈâ","50",10);
        data[21]= new Goods("201912021","ÖíÈâ","60",10);
        data[22]= new Goods("201912022","¼¦Èâ","50",10);
        data[23]= new Goods("201912023","»ùÎ§Ïº","38",10);
        data[24]= new Goods("201912024","´øÓã","26",10);
        data[25]= new Goods("201912025","ÈıÎÄÓã","45",10);
        data[26]= new Goods("201912026","²Í½íÖ½","15",10);
        data[27]= new Goods("201912027","Ã«½í","8",10);
        data[28]= new Goods("201912028","ÑÀË¢","6",10);
        data[29]= new Goods("201912029","½à²ŞÁé","25",10);
        data[30]= new Goods("201912030","Ï´½à¾«","25",10);
        data[31]= new Goods("201912031","±ùÏä","8000",10);
        data[32]= new Goods("201912032","¿Õµ÷","8000",10);
        data[33]= new Goods("201912033","´µ·ç»ú","200",10);
        data[34]= new Goods("201912034","·çÉÈ","300",10);
        data[35]= new Goods("201912035","Ğ¡ºÅËÜÁÏ´ü","0.5",10);
        data[36]= new Goods("201912036","ÖĞºÅËÜÁÏ´ü","0.8",10);
        data[37]= new Goods("201912037","´óºÅËÜÁÏ´ü","1",10);
        List<Goods> goodsArray = Arrays.asList(data);
        return goodsArray;
    }


}
