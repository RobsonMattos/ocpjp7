package estudo_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		
		String words = "now is the time or now is not the time";
		String patt = "now";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(words);
		System.out.println(words);
		while(match.find()) {
			System.out.println("Found " + patt + " at: " + match.start());
			System.out.println("Match: " + match.group());
		}
	}

}
