import javax.annotation.processing.SupportedAnnotationTypes;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class tinhNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to do count?");
        int month = scanner.nextInt();
        String day;
        switch (month){
            case 2:
                day ="28 or 29 day";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = "31 day";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = "30 day";
                break;
            default:
                    day = "";
                    break;
        }
        if(day != ""){
            System.out.println("Month "+month+ " have" + day);
        } else {
            System.out.println("Invalid input");
        }
    }

}
