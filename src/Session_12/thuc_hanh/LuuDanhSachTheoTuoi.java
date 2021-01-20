package Session_12.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LuuDanhSachTheoTuoi {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Sang", 24);
        students.put("khoa", 19);
        students.put("người lạ ", 28);
        System.out.println("hiển thị " );
        System.out.println(students + "\n");
        Map<String,Integer> stringIntegerMap=new TreeMap<>();
        stringIntegerMap.put("người lạ ", 28);
        stringIntegerMap.put("Sang", 24);
        stringIntegerMap.put("khoa", 19);
        System.out.println("hiển thị sau khi sắp xếp");
        System.out.println(stringIntegerMap);
        Map<String,Integer> studentLinked= new LinkedHashMap<>();
        studentLinked.put("người lạ " , 28);
        studentLinked.put("Sang ", 24);
        studentLinked.put("nobody " , 00);
        System.out.println("linked");
        System.out.println(studentLinked);
    }
}
