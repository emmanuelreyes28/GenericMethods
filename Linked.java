import java.util.LinkedList;

public class Linked
{

	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		list.remove(1); //removes 10 from the list 
		list.remove(new Integer(10)); //removes first occurrence of 10
		list.add(25); //adds to ends of the list (also list.addLast(item))
		list.addFirst(0); //adds to head of the list
		System.out.println(list.contains(25)); //checks if item exists
		//list.clear(); //removes all elements in the list
		
		System.out.println("");
		
		//for(int x = 0; x < list.size(); x++){
			//System.out.println(list.get(x));
		//}
		
		//Only works for objects that implement the Iterable Interface 
		//Which includes ArrayLists and LinkedLists 
		for(int x: list){
			System.out.println(x);
		}
		
		Integer[] intArray = {1,2,3}; //int[] error, requires integer
		Double[] doubleArray = {1.1, 2.2, 3.3};
		String[] stringArray = {"I", "<3", "ICS45J"};
		
		System.out.println(GenericMethods.getLastItem(intArray));
		System.out.println(GenericMethods.getLastItem(doubleArray));
		System.out.println(GenericMethods.getLastItem(stringArray));
		
/*		Pair<Integer> pair = new Pair<Integer>(1,2);
		System.out.println(pair.getFirst() + pair.getSecond());
		pair.print();*/
		
		Pair<Integer, String> p1 = new Pair<Integer,String>(0,"Richert");
		Pair<Integer, String> p2 = new Pair<Integer,String>(1, "Mr.E");
		
		System.out.println(p1.getFirst() + " - " + p1.getSecond());
		System.out.println(p2.getFirst() + " - " + p2.getSecond());
		
		p1.print();
		p2.print();
		
		//2D Arrays
		int[][] int2d = new int[4][5];
		
		//System.out.println(int2d.length);
		
		//traverse the entire 2D array structure and print it out in a matrix
		for(int b = 0; b < int2d.length; b++){
			for(int c = 0; c < int2d[b].length; c++){
				System.out.println(int2d[b][c] + " ");
			}
			System.out.println();
		}
	}

}
