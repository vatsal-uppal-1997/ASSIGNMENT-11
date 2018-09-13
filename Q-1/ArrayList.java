
public class ArrayList {
	
	private int size;
	private int arr[];
	private int curr_index;
	
	public ArrayList(){
		this(10);
	}
	
	public ArrayList(int size) {
		
		this.size = size;
		this.arr = new int[size];
		this.curr_index = -1;
		
	}
	
	public void add(int element) {
	
		if (curr_index >= size-1)
			resize();
		arr[++this.curr_index] = element;
		
	}
	
	private void resize() {
		
		int temp[] = arr;
		int i=0;
		this.size = (int)(this.size * 1.5);
		this.arr = new int[this.size];
		for (int j: temp)
			this.arr[i++] = j;
		
	}
	
	public int get(int indx) {
		
		if (this.curr_index != -1)
			return arr[indx];
		else
			return -1;
		
	}	
	
	public int size() {
		return (this.curr_index+1);
	}
}