package com.question;


/**
 * ˫������-����һ��name��һ��dlink�ҵ������Ӧ�Ľڵ㲢ɾ��
 * @author YX
 *
 */
public class DoubleLink {
	
	public static void main(String[] args) {
		
		//˫�������ʼ��
		Node node = null;
		for (int i = 1; i <= 10 ; i++) {
			if(node == null){
				node = new Node();
			}else{
				Node rightNode = node.getRightNode();
				rightNode.setLeftNode(node);
				node = rightNode;
			}
			node.setRightNode(new Node());
			node.setName(i+"");
		}
		node.setBottomNode(node);
		
		
		
		System.out.println("ɾ��ǰ------------------------------------------------");
		getAll(node.getBottomNode());
		
		del(node.getBottomNode(),"2");
		System.out.println("\nɾ����------------------------------------------------");
		getAll(node.getBottomNode());
		
		del(node.getBottomNode(),"5");
		System.out.println("\nɾ����------------------------------------------------");
		getAll(node.getBottomNode());
		
		del(node.getBottomNode(),"1");
		System.out.println("\nɾ����------------------------------------------------");
		getAll(node.getBottomNode());
		
		del(node.getBottomNode(),"10");
		System.out.println("\nɾ����------------------------------------------------");
		getAll(node.getBottomNode());
	}
	
	//ѭ���������нڵ�
	public static void getAll(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.getName()+"\t");
		getAll(node.getLeftNode());
	}
	
	//����nameɾ�������ڵ�
	public static boolean del(Node node,String name){
		if(node == null){
			return false;
		}
		if(node.getName().equalsIgnoreCase(name)){
			Node leftNode = node.getLeftNode();
			Node rightNode = node.getRightNode();
			if(leftNode != null){
				leftNode.setRightNode(rightNode);	
			}
			if(rightNode != null){
				rightNode.setLeftNode(leftNode);
			}
			if(node == node.getBottomNode()){
				node.setBottomNode(leftNode);
			}
			node = null;
			return true;
		}
		return del(node.getLeftNode(),name);
	}
}

/**
 * �ڵ���
 * @author YX
 *
 */
class Node{
	private String name;
	private Node leftNode;
	private Node rightNode;
	private Node bottomNode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	public Node getBottomNode() {
		return bottomNode;
	}
	public void setBottomNode(Node bottomNode) {
		this.bottomNode = bottomNode;
	}
}
