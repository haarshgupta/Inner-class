package empty_rec;
import java.util.*;

public class EmptyRec {
	
		String st;
		void show() {
			System.out.println("in show.");
		};
		class C{
			void cl0 (){
				System.out.println("cl0 classss");
			}
		}
		static class B{
			void cl() {
			System.out.println("in ckasss b");
		}}
	
	
	
	
public static void main(String args[]) {
	EmptyRec obj=new EmptyRec();
	obj.show();
	
	EmptyRec.C obj0=obj.new C();// Non static class 
	obj0.cl0();
	
	B obj1= new EmptyRec.B();//Static class 
	obj1.cl();
}
}
