package korzo.Structures;

public class Node {
	private Object value;
	private Node node;
	private int index;
	
	public Node(){
		this.value = null;
		this.node = null;
		this.index = 0;
	}
	
	public Node(Node node){
		this.node = node;
	}
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
/*	
	@Override
	public String toString(){
		return "index=" + Integer.toString(this.index) + " this.value=" + this.value.toString();
	}
*/	
	
	
}
