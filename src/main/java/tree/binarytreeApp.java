/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Prisma Alamsyah
 */
public class binarytreeApp {
  public static void main(String[] args) {
        var tree = new binarytree();
        
        treeNode node;
        node = new treeNode('D');
        tree.insert(node);
        
        node = new treeNode('B');
        tree.insert(node);
        
        node = new treeNode('A');
        tree.insert(node);
        
        node = new treeNode('C');
        tree.insert(node);
        
        node = new treeNode('F');
        tree.insert(node);
        
        node = new treeNode('E');
        tree.insert(node);
        
        node = new treeNode('G');
        tree.insert(node);
        
    
        System.out.println("Traversal dengan Pre Order : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan Post Order : " );
        tree.postOrder();
        System.out.println("\nTraversal dengan In Order : " );
        tree.inOrder();
        System.out.println();
       
        
  }
}
    
