/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVL;

/**
 *
 * @author akshit
 */
public class AvlTree {
    
    class Node{
        int data;
        Node right;
        Node left;
        int height;
        Node(int value)
        {
            data=value;
            right=null;
            left=null;
            height=0;
        }
    }
    int nodeheight(Node node)
    {
        if(node.right.height>node.left.height)
        {
            return (node.right.height+1);
            
        }
        else 
        {
            return (node.left.height+1);
        }
    }
    int height(Node root)
    {
        return root.height;
    }
    Node rightRotate(Node root)
    {
        Node newroot =root.left;
        root.left=newroot.right;
        newroot.right=root;
        root.height=nodeheight(root);
        newroot.height=nodeheight(newroot);
        return newroot;
    }
    Node leftRotate(Node root)
    {
        Node newroot=root.right;
        newroot.left.left=root;
        root.height=nodeheight(root);
        newroot.height=nodeheight(newroot);
        return newroot;
        
    }
}
