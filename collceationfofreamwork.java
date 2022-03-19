import java.util.*;
class collceationfofreamwork
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(90);
		al.add(20);
		al.add(60);
		al.add(50);
		al.add(90);
		System.out.println(al);
		HashSet<Integer> al1 = new HashSet<Integer>();
		al1.add(90);
		al1.add(20);
		al1.add(60);
		al1.add(50);
		al1.add(90);
		System.out.println(al1);
		
		/*HashMap<Integer,Integer> al2 = new HashMap<Integer>();
		al2.put(90,10);
		al2.put(20,20);
		al2.put(60,30);
		al2.put(50,50);
		al2.put(90,60);
		System.out.println(al2);
*/
		HashMap<Integer,String> hm  = new HashSet<>();
		hm.put(10,"bhushan1");
		hm.put(150,"bhushan2");
		hm.put(50,"bhushan2");
		hm.put(50,"bhushan3");
		hm.put(90,"bhushan4");
		hm.put(10,"bhushan5");
		hm.put(30,"bhushan6");

		
	}
}