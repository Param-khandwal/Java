
// 5. write a program to demonstrate the use of following operators. 
// a)right shift with sign bit operator >> 
// b)left shift operator << 
// c)right shift with zero fill operator >>> 

import java.util.Scanner;
public class right_shift{

		public int rightShift(int a){
			int rS=a>>2;
			System.out.println(rS);
			return rS;
		}

		public int leftShift(int a){
			int lS=a<<2;
			System.out.println(lS);
			return lS;
		}

		public int rShift(int a){
			int rrS=a>>>2;
			System.out.println(rrS);
			return rrS;
		}

		public static void main(String[] args) {

			right_shift r=new right_shift();

			

			int a=(int) (Math.random()*10)+1;
			System.out.println(a);

			System.out.println("Right Shift");
			r.rightShift(a);
			System.out.println("Left Shift");
			r.leftShift(a);
			System.out.println("Right Shift 2");
			r.rShift(a);


		}
}