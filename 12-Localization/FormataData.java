import java.text.DateFormat;
import java.util.Calendar;


public class FormataData {

	public static void main(String[] args) {
		// Date data = new Date(); // foi substituida por Calendar
		Calendar calendar = Calendar.getInstance();
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(calendar.getTime()));

	}

}
