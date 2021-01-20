package Session_12.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        SxVoiComparableVaComparator.Student student1 = new SxVoiComparableVaComparator.Student("sang ", 24, "133");
        SxVoiComparableVaComparator.Student student2 = new SxVoiComparableVaComparator.Student("sang1 ", 21, "133");
        SxVoiComparableVaComparator.Student student3 = new SxVoiComparableVaComparator.Student("sang2", 27, "134");
        List<SxVoiComparableVaComparator.Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.sort(new AgeComparator());
        for (SxVoiComparableVaComparator.Student student : list){
            System.out.println(student.toString());
        }
    }
}
