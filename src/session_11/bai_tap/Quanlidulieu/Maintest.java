package session_11.bai_tap.Quanlidulieu;

import java.util.*;

public class Maintest {

    public static void main(String[] args) {
        ArrayList<Employment> employmentArrayList=new ArrayList<>();
        employmentArrayList.add(new Employment("Ngọc","Nu","11/2/2210"));
        employmentArrayList.add(new Employment("Ngọc1","Nam","14/2/2210"));
        employmentArrayList.add(new Employment("Ngọc2","Nu","1/2/2210"));
        employmentArrayList.add(new Employment("Ngọc3","Nam","13/2/2210"));
        Queue<Employment> queueNam=new ArrayDeque<>();
        Queue<Employment> queueNu=new ArrayDeque<>();

        Collections.sort(employmentArrayList,new EmploymentComparBirthday());

        for (Employment employment: employmentArrayList){
            if (employment.getGender().equals("Nu")){
                queueNu.add(employment);
            }else {
                queueNam.add(employment);
            }
        }
        List<Employment> queueEmployment= new ArrayList<>();
        queueEmployment.addAll(queueNu);
        queueEmployment.addAll(queueNam);
       Iterator<Employment> iterator= queueEmployment.iterator();
       while (iterator.hasNext()){
           Object employ=iterator.next();
           System.out.println(employ);
       }
    }
}
