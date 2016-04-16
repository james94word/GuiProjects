/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;


public class Calc {

	 private String op_sym;
	 private MathOp[] op_code;
	 
	 public Calc() {
	   this.op_sym = "+-*/";
	   this.op_code = new MathOp[] {
	      new OpAdd(),
	      new OpSub(),
	      new OpMul(),
	      new OpDiv() 
	   };
	 }
	
	public String doCalc(String cmd) {
		
		try {
			String[] tab = cmd.trim().split("\\s++");
			for (int i = 0; i < 3; i++){
			    System.out.println(String.format("%d: %s", i, tab[i]));
			}
            int pos = this.op_sym.indexOf(tab[1]);
            System.out.println(String.format("pos is %d", pos));
		} catch (ArrayIndexOutOfBoundsException  e){ 
			return "Invalid command to calc" ;
		}
		
        return "";	  
	}
	
}
