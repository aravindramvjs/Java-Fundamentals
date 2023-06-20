public class StringBufferLearning{
	public static void main(String[] args){
		
		//to append more string in normal string cuz string is immutable it creates new string again again which is memory inefficient 
		
		//so using stringbuffer or stringbuilder we are creating mutable string
		
		//stringbuffer is used when creating multithreaded application
		
		
		String firstName = "aravind";
		String lastName = "ram";
		
		//creating StringBuffer object
		StringBuffer fullName = new StringBuffer();
		
		//append strings 
		fullName.append(firstName);
		fullName.append(" ");
		fullName.append(lastName);
		
		//or easy way to append
		fullName.append(firstName).append(" ").append(lastName);
		
		System.out.println(fullName);
	}
}