
public class Test {
    @org.junit.Test
    public void compare_same()//比较相同文本
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_null()//空路径比较
    {
        String str0 = Txt.readTxt("");
        String str1 = Txt.readTxt("");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_add()//比较添加文本
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_add.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_del()//比较减少的文本
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_del.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_1()//比较不同文本
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_dis_1.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_10()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_dis_10.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void compare_15()
    {
        String str0 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig.txt");
        String str1 = Txt.readTxt("D:\\java\\仓库\\测试文本\\orig_0.8_dis_15.txt");
        String resultFileName = "D:\\java\\仓库\\测试文本\\result.txt";
        String simHash0 = SimHash.get(str0);
        String simHash1 = SimHash.get(str1);
        double similarity = Hamming.getSimilarity(simHash0, simHash1);
        Txt.writeTxt(similarity, resultFileName);
        System.exit(0);;
    }
    @org.junit.Test
    public void get() {
        String str="ddd";
        try {
            if (str.length() < 200) try {
                throw new Exception("文本过短！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
