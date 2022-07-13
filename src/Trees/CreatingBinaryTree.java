package Trees;

import java.util.*;

//Preorder, inOrder, postordeR, LevelOrder========== time complexity = 0(n)

public class CreatingBinaryTree {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree
	{
		static int idex = -1;
		public static Node buildTree(int nodes[])
		{
			idex++;
			if(nodes[idex] == -1)
			{
				return null;
			}
			Node newNode = new Node(nodes[idex]);
			newNode.left =  buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode; 
		}
	}

	//Preorder
	public static void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//Inorder
	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
	
	//Postorder
		public static void postOrder(Node root)
		{
			if(root==null)
			{
				return;
			}
			
			postOrder(root.left);
			
			postOrder(root.right);
			
			System.out.println(root.data+" ");
		}
		
		//Levelorder  (Different, will do it iteratively)
				public static void levelOrder(Node root)
				{
					if(root==null)
					{
						return;
					}
					Queue<Node> q = new LinkedList<>();
					q.add(root);
					q.add(null);  //For Next Line
					
					while(!q.isEmpty())
					{
						Node currNode = q.remove();
						if(currNode == null)
						{
							System.out.println();
							if(q.isEmpty())
							{
								break;
							}
							else
							{
								q.add(null);
							}
						}
						else
						{
							System.out.print(currNode.data);
							if(currNode.left != null)
							{
								q.add(currNode.left);
							}
							if(currNode.right!=null)
							{
								q.add(currNode.right);
							}
						}
					}
				}
	
	//countNodes
				public static int countNodes(Node root) // time complexity = O(n)
				{
					if(root==null)
					{
						return 0;
					}
					
					int leftNodes = countNodes(root.left);
					int rightNodes = countNodes(root.right);
					
					return leftNodes + rightNodes + 1;
					
				}
				
				
	//Sum of Nodes
				public static int sumOfNodes(Node root) // time complexity = O(n)
				{	
					if(root==null)
					{
						return 0;
					}
					
					int leftNodesSum = sumOfNodes(root.left);
					int rightNodesSum = sumOfNodes(root.right);
					
					return leftNodesSum + rightNodesSum + root.data;
					
				} 
				
	//Height of tree
				public static int heightOfTree(Node root) // time complexity = O(n)
				{	
					if(root==null)
					{
						return 0;
					}
					
					int leftTreeHeight = heightOfTree(root.left);
					int rightTreeHeight = heightOfTree(root.right);
					
					int maxHeight = Math.max(leftTreeHeight, rightTreeHeight)+1;
					
					return maxHeight;
					
//					if(leftTreeHeight>rightTreeHeight)
//						return leftTreeHeight+1;
//					else
//						return rightTreeHeight+1;
				} 
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(heightOfTree(root));

	}

}
