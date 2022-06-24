package eltag;
 
import java.util.Date;
import java.text.SimpleDateFormat;
 
public class DateUtil {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
 
    public static String format(Date date) {
        return formatter.format(date);
    }
}

//표현언어에서 클래스 메서드(static)를 호출할 수 있음.
//1. 예제에서 사용할 클래스 작성