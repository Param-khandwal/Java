// 2.Write a Java program to replace a specified character with another
// character

// Sample Output:
// Original string: The quick brown fox jumps over the lazy dog.
// New String: The quick brown fox jumps over the lazy fog.

//str2=str1.replace("1st string","2nd word")

class stringChar{
	public static void main(String[] args) {
		String str1="The quick brown fox jumps over the lazy dog";
		System.out.println("Original String :\n "+str1);

		String str2=str1.replace("dog", "fog");
		System.out.println("New String: \n"+str2);
	}
}
