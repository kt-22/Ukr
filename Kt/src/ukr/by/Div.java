package ukr.by;
import java.lang.ArithmeticException;
public class Div {
	public static void main(String args[]){
		int z = 10;
		try{
		int k = z/0;
		System.out.println("k"+ k);
		}catch (ArithmeticException e){
			System.out.println("0L");
		}
		
	}

}
