
public class main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		ts ts = new ts();
		//ts.add(1, true, new String[] {"v"}, new int[] {2});
		//ts.add(2, false, new String[] {"v"}, new int[] {5});
		//ts.add(3, false, new String[] {"c"}, new int[] {3});
		//ts.add(4, false, new String[] {"c"}, new int[] {4});
		//ts.add(5, false, new String[] {"v"}, new int[] {1,2});
		
		ts.add(1, true, new String[] {"v"}, new int[] {2});
		ts.add(2, false, new String[] {"v"}, new int[] {1,4});
		ts.add(3, false, new String[] {"c"}, new int[] {3});
		ts.add(4, false, new String[] {"c"}, new int[] {4});
		

		//System.out.println(ts.notes);
		
		//ts.AP("v");
		
		System.out.println("");
		System.out.println("This is output");
		System.out.println(ts);
		
		
		System.out.println(ts.EX(ts.AP("c"),"c"));
		
		
		//System.out.println(ts.AF(ts.AP("c"),"c"));

		
		
		
		
	}
}
