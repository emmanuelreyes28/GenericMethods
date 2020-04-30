
public class GenericMethods
{
	public static <T> T getLastItem(T[] array){
		if(array.length > 0){
			return array[array.length - 1];
		}
		return null;
	}
	

	
	

}
