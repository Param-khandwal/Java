// 10. Define a class of type Distance that has Feet and Inches as members. 
// -Define a function that adds two Distances passed as argument and returns 
// the sum as another Distance object. 

// -Place the class in a package named user.own.pack . Compile and run the 
// java file using console (javac and java utility). 

// -Write a program that imports this package and uses class to find the sum 
// of two distances.
package user.own.pack;
public class distance{
	int feet;
	int inch;

	public distance(int feet,int inch){
		this.feet=feet;
		this.inch=inch;
	}

	public int add(int feet,int inch){
		int sum;
		sum=feet+inch;
		return sum;
	}

	public static void main(String[] args) {
		distance d=new distance(5,8);
		d.add(5,8);

	}
}