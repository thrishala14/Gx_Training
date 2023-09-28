package javaDemo;

public class LocalVariable {
	public static String name = "Galaxe";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Local Variables");
		for(int i = 0; i<3;i++) {
			String loopMessage = "iteration...";
			System.out.print(i + "  ");
			System.out.println(loopMessage);
			//loopMessage is a local variable and is accessed within the block
		}
		//System.out.println(loopMessage); throws error
		/* loopMessage is a local variable and within the scope*/
	}
}

