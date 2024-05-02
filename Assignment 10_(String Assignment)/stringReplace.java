//  3.Write a Java program to replace each substring of a given string that
// matches the given regular expression with the given replacement. 

// Sample string : "The quick brown fox jumps over the lazy dog."
// 			In the above string replace all the fox with cat. 

// Sample Output:
// Original string: The quick brown fox jumps over the lazy dog.
//  New String: The quick brown cat jumps over the lazy dog. 

class stringReplace{
	public static void main(String[] args) {
			String str1="The quick brown fox jumps over the lazy dog";
		System.out.println("Original String :\n "+str1);

		String str2=str1.replaceAll("fox", "cat");
		System.out.println("New String: \n"+str2);
	}
}

