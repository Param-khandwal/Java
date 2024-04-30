public class sumPrime{
	public static void main(String[] args) {
		int c,sum=0;
		for(int i=1;i<=100;i++){
			c=0;
			for(int j=1;j<=i;j++){
				
				if(i%j==0)
					c++;
		}
		if(c==2)
			sum+=i;
		} 
		System.out.println(sum);
	}
}