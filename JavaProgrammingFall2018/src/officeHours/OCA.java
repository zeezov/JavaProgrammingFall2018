package officeHours;

public class OCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		
		if(a == "2cfalse") System.out.println("==");
		if(a.equals("2cfalse")) System.out.println("equals");
				
		StringBuilder b = new StringBuilder("ruble");
		b.append(4).deleteCharAt(3).delete(3, b.length()-1);
		System.out.println(b);

	}

}
