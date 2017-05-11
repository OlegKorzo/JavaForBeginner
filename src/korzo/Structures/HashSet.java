package korzo.Structures;

public class HashSet implements HashSetInterface{
	
	private int base = 256;
	private LinkedList[] ll;
	
	public int hash(Object ob){
		String s = ob.toString();
		int ret = 0;
		
		for (char x : s.toString().toCharArray())
			ret +=  (int)x;
		

		while (ret > base){
			ret = ret / 2;
		} 
		return ret;
	}
	
	private void InitializeHashSet(){
		LinkedList[] initArray = new LinkedList[base];
		for (int i=0; i < this.base; i++)
			initArray[i] = new LinkedList();
		this.ll = initArray;
	}
	public HashSet(){
		InitializeHashSet();
	}
	
	
	public HashSet(int base){
		this.base = base;
		InitializeHashSet();
	}
	
	public void add(Object t){
		
		int i = hash(t);
		
		int j = 0;

		while (j < ll[i].getSize())
			if (ll[i].get(j).equals(t))
				return;
		
		ll[i].add(t);
		
	};
	
	public boolean contains(Object t){
		int i = hash(t);
		return this.ll[i].contains(t);
	};
	
	public void remove(Object t) {
		int i = hash(t);
		
		this.ll[i].remove(this.ll[i].int_contains(t));
		
	}	
	
	
	public static void main(String[] args){
		
		HashSet h = new HashSet();
		
		h.add("123");

		
		System.out.println("found 123? " + h.contains("123"));
		System.out.println("found 124? " + h.contains("124"));
		h.remove("123");
		h.add("124");
		h.add("125");
		System.out.println(h.contains("123"));
		System.out.println(h.contains("124"));
		System.out.println(h.contains("125"));
		System.out.println(h.contains("126"));
		
		
		
	}



}
