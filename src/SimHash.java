import com.hankcs.hanlp.HanLP;
import org.junit.Test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
public class SimHash {
    public static String getHash(String str){
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }
    }
    public static String get(String str){
        try{
            if(str.length() < 200) try {
                throw new Exception("文本过短！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        int[] v = new int[128];
        List<String> list = HanLP.extractKeyword(str, str.length());
        int size = list.size();
        int i = 0;
        for(String keyword : list){
            String keywordHash = getHash(keyword);
            if (keywordHash.length() < 128) {
                int dif = 128 - keywordHash.length();
                for (int j = 0; j < dif; j++) {
                    keywordHash += "0";
                }
            }
            for (int j = 0; j < v.length; j++) {
                if (keywordHash.charAt(j) == '1') {
                    v[j] += (10 - (i / (size / 10)));
                }
                else {
                    v[j] -= (10 - (i / (size / 10)));
                }
            }
            i++;
        }
        String simHash = "";
        for (int j = 0; j < v.length; j++) {
            if (v[j] <= 0) {
                simHash += "0";
            } else {
                simHash += "1";
            }
        }
        return simHash;
    }
}
