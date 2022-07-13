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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		levelOrder(root);

	}

}
