 public class main{
 	public static void main(String[] args) {
 		int a[]={12,4,5,7,8};  //max=12 // second=8

 		 int i,max=a[0],max2=-1; 
 		for(i=0;i<5;i++){
 			if(a[i]>max)
 				max=a[i];

 		}

 		for(i=0;i<5;i++){
 			if(a[i]>max2){
 				if(a[i]!=max){
 					max2=a[i];
 				}
 			}

 		}
 		System.out.println(max2);



 		 	}
 }