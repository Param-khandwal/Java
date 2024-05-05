package acts;
import cdac.*;
import hyd.Sample;
public class SR{

	public void function(){
		System.out.println("hello i am act ");
	}

	public static void main(String[] args) {
	
		R r=new R();
		r.fun();

		Sample s=new Sample();
		s.msg();

		SR sr =new SR();
		sr.function();

		hyd.ameerpet.DAC d=new hyd.ameerpet.DAC();
		d.method();

	}
}