package Session_12.thuc_hanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<SxVoiComparableVaComparator.Student> {


    @Override
    public int compare(SxVoiComparableVaComparator.Student o1, SxVoiComparableVaComparator.Student o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }else if(o1.getAge().equals(o2.getAge())){
                return 0;
            }else{
                return -1;
            }
        }
}
