import com.hankcs.hanlp.HanLP;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String str0 = Txt.readTxt(args[0]);
        String str1 = Txt.readTxt(args[1]);
        String resultFileName = args[2];
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
}