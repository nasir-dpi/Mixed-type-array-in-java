
public class UdefinedDType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s  = "123.5MA1C2034";
		for(int i = 0; i < s.length(); i++)
			if(((int) s.charAt(i)>= 65 && (int)s.charAt(i)<= 91)||(int) s.charAt(i)>= 97 && (int)s.charAt(i)<= 122)
				System.out.println(s.charAt(i));
			
	}

}
