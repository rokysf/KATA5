import java.util.Arrays;

public class Lifo {

	private int llista[];
	private int i = 0;
	private final int limit = 5;
		
	public Lifo() {
		this.llista = new int[limit];
		
	}
	
	public void add(int a) {
		if(i<llista.length) {
			this.llista[i]=a;
		i++;
		}
	}

	@Override
	public String toString() {
		return "Lifo [llista=" + Arrays.toString(llista) + "]";
	}	

	
	

}
