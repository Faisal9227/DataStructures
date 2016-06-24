import java.util.Iterator;

public class WorkingwithGenerics {

	public static <T> Iterator<T> iterate(T s, int count) {
		final T t=s;
		final int num=count;
		return new Iterator<T>(){
			private T object = t;
			private int repeat_number=num;
			private int counter=0;
			
			@Override
			public boolean hasNext() {
				return counter<repeat_number;
			}

			@Override
			public T next() {
				counter++;
				return object;
			}
		};
		
	}
	
	
	public static void main(String args[]){
		Iterator<String> it= iterate("Faisal",8);
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}
