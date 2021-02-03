package session_15_IOtext.bai_tap;

import java.io.*;

public class Copyfile {
    private static final String PATH="src/session_15_IOtext/bai_tap";
    public static void main(String[] args) throws IOException {

        File source=new File("src/session_15_IOtext/bai_tap/test1.txt");

        File dest=new File("src/session_15_IOtext/bai_tap/test2.txt");

        if(source.exists()&&dest.exists()){
            System.out.println("có rồi");
        }
        FileWriter fileWriter =null;
        try {
            fileWriter =new FileWriter("src/session_15_IOtext/bai_tap/test1.txt");
            fileWriter.write("tran hoang sang"+"\n");
            fileWriter.write("6/5/1996");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileWriter !=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileReader reader=null;
        BufferedReader bufferedReader = null;
        try {
            reader=new FileReader("src/session_15_IOtext/bai_tap/test1.txt");
            bufferedReader =new BufferedReader(reader);
            StringBuffer result=new StringBuffer();
            String line;
            while ((line=bufferedReader.readLine())!=null){
                    result.append(line);
            }
            System.out.println(result);
            bufferedReader.close();
            reader.close();
            fileWriter =new FileWriter(dest);
            fileWriter.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileWriter !=null){
                try {
                    fileWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
