
import java.util.Optional;
public class Test1 {

	public static void main(String[] args) {
		String [] s  = new String[10];
		optional<String> checkword = optional.ofNullable(s[9]);
		if(checkword.isPresent()){
			String word =  checkword.get().concat("suffix");
			System.out.println(String.format("word with suffix : %s , word"));
					
		}
		else {
			System.out.println("no word is present to append suffix to");
		}
		

}
}
