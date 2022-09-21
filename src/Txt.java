import java.io.*;

public class Txt {
    public static String readTxt(String txtPath) {
        String str = "";
        String strLine;
        File file = new File(txtPath);
        FileInputStream fileInputStream ;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
    public static void writeTxt(double txtElem,String txtPath){
        String str = Double.toString(txtElem);
        File file = new File(txtPath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            fileWriter.write("\r\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
