package ie.gmit.sw.Examples;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		TestString ts = new TestString();
		TestString ts1 = new TestString();
		
		String str1 = new String("will");
		String str2 = new String("will");
		
		
		
		if(str1.equals(str2)) {
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			System.out.println("Equal");
		}
		else {
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			System.out.println("Not Equal");
		}
		
		
		
//		System.out.println(ts + " " + ts.hashCode());
//		System.out.println(ts1 + " " + ts1.hashCode());
//		
//		if(ts.equals(ts1))
//			System.out.println("equal");
//		else
//			System.out.println("not equal");
	}

	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}
}


class TestString{
	
}