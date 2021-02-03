package Casestudy.regExp;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.regex.Pattern;

public class Validation {
    private static final String VALIDATE_IDOFSERVICE = "^SV(VL|HO|RO)-[0-9]{4}$";
    private static final String VALIDATE_NAMEOFSERVICE = "^[A-Z][a-z]*$";
    private static final String VALIDATE_AREA = "^(30\\.\\d*[1-9]|((3[1-9])|([4-9]\\d)|([1-9]\\d{2,}))(\\.\\d+)?)$";
    private static final String VALIDATE_PRICE = "^([1-9]+)*\\.?\\d*$";
    private static final String VALIDATE_PEOPLE = "^([1-9])|(1\\d])$";
    private static final String VALIDATE_FLOORS = "^[1-9]\\d*$";
    private static final String VALIDATE_TYPEOFRENT = "^[A-Z][a-z]*$";
    private static final String VALIDATE_DATE = "^((0[1-9])|([1-2][0-9])|(3[0-1]))/(0([1-9])|(1[0-2]))/((19\\d[1-9])|(19[1-9]\\d)|(2\\d{3}))$";
    private static final String VALIDATE_NAMEOFCUSTOMER = "^[A-Z][a-z]*\\s[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String VALIDATE_EMAIL = "^^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    private static final String VALIDATE_IDCUSTOMER = "^(\\d{3}\\s){2}\\d{3}$";
    private static final String VALIDATE_GENDER="^Male|Female|Unknow$";
    private static final String VALIDATE_PHONENUM = "^\\+84\\s(\\d{3}\\s){2}\\d{3}$";


    public boolean checkIdServeice(String idservice) {
        try {
            if (!Pattern.matches(VALIDATE_IDOFSERVICE, idservice)) {
                throw new Exception("sai định dạng");
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean checkGender(String gender){
        return Pattern.matches(VALIDATE_GENDER,gender);
    }
    public boolean checkArea(String string) {
        return Pattern.matches(VALIDATE_AREA, string);
    }
    public boolean checkPhoneNum(String phoneNum){
        return Pattern.matches(VALIDATE_PHONENUM,phoneNum);
    }

    public boolean checkNameofService(String string) {
        return Pattern.matches(VALIDATE_NAMEOFSERVICE, string);
    }

    public boolean checkPrice(String price) {
        return Pattern.matches(VALIDATE_PRICE, price);
    }

    public boolean checkNumPeople(String numPeople) {
        return Pattern.matches(VALIDATE_PEOPLE, numPeople);
    }

    public boolean checkFloors(String floors) {
        return Pattern.matches(VALIDATE_FLOORS, floors);
    }

    public boolean checkTypeofRent(String typeOfRent) {
        return Pattern.matches(VALIDATE_TYPEOFRENT, typeOfRent);
    }

    public boolean checkDate(String birthday) {
        try {
            if (!Pattern.matches(VALIDATE_DATE, birthday)) {
                throw new Exception("sai định dạng , dd/MM/yyyy");
            } else {
                int currentYear = Year.now().getValue();
                int year = Integer.parseInt(birthday.substring(6));
                if (year <= 1900) {
                    throw new Exception("Sống hơi lâu rồi đó bạn");
                } else {
                    if (year + 18 > currentYear) {
                        throw new Exception("Bạn chưa đủ tuổi ");
                    } else {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean checkNameofCustomer(String nameCus) {
        try {
            if (!Pattern.matches(VALIDATE_NAMEOFCUSTOMER, nameCus)) {
                throw new Exception("Tên phải viết hoa chữ cái đầu của mỗi từ, không được nhập số");
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean checkEmail(String email) {
        try {
            if (!Pattern.matches(VALIDATE_EMAIL, email)) {
                throw new Exception("Email phải đúng định dạng Email chứ nhỉ ");
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        return false;
    }

    public boolean checkIdCustomer(String idC) {
        try {
            if (!Pattern.matches(VALIDATE_IDCUSTOMER, idC)) {
                throw new Exception("Id Nên là 9 số thì hơn ");
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
