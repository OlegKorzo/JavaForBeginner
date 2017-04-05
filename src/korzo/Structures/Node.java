package korzo.Structures;

public class Node {
	private Object value;
	private Node node;
	
	public Node(){
		this.value = null;
		this.node = null;
	}
	
	public Node(Node node){
		setNode(node.getNode());
		setValue(node.getValue());
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

}
