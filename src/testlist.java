import java.util.ArrayList;
import java.util.Collections;

public class testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> friend = new ArrayList<>();
	friend.add("Rittikeat");
	friend.add("Nathasorn");
	friend.add("Titaree");
	
	for(String list:friend){
		System.out.println(list);
	}
	
	   Collections.sort(friend);
	
	for(String list:friend){
		System.out.println(list);

	}
	}

}
