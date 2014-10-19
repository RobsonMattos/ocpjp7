import java.util.Enumeration;
import java.util.ResourceBundle;

// ResourceBundle é uma classe abstrata
public class ResourceEstudo {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("myResource");
		
		Enumeration bundleKeys = rb.getKeys();

		while (bundleKeys.hasMoreElements()) {
		    String key = (String)bundleKeys.nextElement();
		    String value = rb.getString(key);
		    System.out.println("key = " + key + ", " + "value = " + value);
		}
	}

}
