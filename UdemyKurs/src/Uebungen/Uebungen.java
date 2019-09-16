package Uebungen;


public class Uebungen {
	public static void main(String[] args) {
//		 ProzentRechnung pr = new ProzentRechnung(500); 
//		 System.out.println(pr.wertZuProzent(1000)); 
//		 System.out.println(pr.wertZuProzent(23)); 
//		 System.out.println(pr.prozentZuWert(50));
//		 System.out.println(pr.prozentZuWert(1)); 
		
		
		MyArrayList<String> list = new MyArrayList<String>(null);
		System.out.println("Size: " + list.size());
		list.add("s1"); 
		list.add("s2"); 
		System.out.println("Contains s1: " + list.contains("s1")); 
		System.out.println("Size: " + list.size());
		System.out.println("--------------------------------------------------");
		// --- bis hier korrekt
		
		
		
		list.clear();   
		System.out.println("List cleared."); 
		System.out.println("List[0]: " + list.get(0)); 
		System.out.println("Die liste hat " + list.size() + " elmente");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Empty: " + list.isEmpty()); 
		System.out.println("Size: " + list.size()); 
		System.out.println("List[0]: " +list.get(0));
		System.out.println("--------------------------------------------------");
		//korrekt
		
		
		list.add("s3"); 
		list.add("s4");  
		System.out.println("List[0]: " + list.get(0)); 
		System.out.println("List[1]: " + list.get(1));
		System.out.println("--------------------------------------------------");
		// korrekt
		
		list.remove("s3"); 
		System.out.println("List[0]: " + list.get(0));
		System.out.println("Removed s3"); 
		System.out.println("List[0]: " + list.get(0)); 
		System.out.println("Empty: " + list.isEmpty()); 
		 
		System.out.println("Contains s1: " + list.contains("s1"));
		
		
		for(int i = 0; i <56 ; i++) {
			list.add(Character.toString(((char)(i+ 65))));
		}
		System.out.println(list.size());
	}
}
