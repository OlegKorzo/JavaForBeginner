package korzo.Structures;

public class HashSet implements HashSetInterface{
	
	private int base = 8;
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
	
	public HashSet(){
		LinkedList[] ll = new LinkedList[base];
		System.out.println("default");
		for (int i=0; i < this.base; i++)
			ll[i] = new LinkedList();
	}
	
	public HashSet(int base){
		this.base = base;
		
		LinkedList[] ll = new LinkedList[base];
		System.out.println("base");
	}
	
	public void add(Object t){
		
		int i = hash(t);
		
		//this.ll[0] = new LinkedList();
		
		//LinkedList newv = new LinkedList();
		
		//System.out.println(newv.getSize());
		
		//ll[0] = newv;
		
		System.out.println(ll.length);
		
		System.out.println(ll[0].getSize());
		
		
//		
//		int j = 0;
//		System.out.println(ll[i].getSize());
//		while (j <= ll[i].getSize())
//			if (ll[i].get(j).equals(t))
//				return;
//		
//		ll[i].add(t);
		
	};
	
	public boolean contains(Object t){
		return false;
	};
	
	public Object remove(Object t){
		return new Object();
	};
	
	
	public static void main(String[] args){
		
		HashSet h = new HashSet();
		
		h.add("123");
		
		
		
	}

}
