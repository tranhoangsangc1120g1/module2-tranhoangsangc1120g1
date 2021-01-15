package session_11.bai_tap.Quanlidulieu;

import session_11.bai_tap.Quanlidulieu.Employment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

class EmploymentComparBirthday implements Comparator<Employment> {
    @Override
    public int compare(Employment o1, Employment o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1= null;
        Date date2= null;
        try {
            date1 = simpleDateFormat.parse(o1.getBirthday());
            date2 = simpleDateFormat.parse(o2.getBirthday());
            return date1.compareTo(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
