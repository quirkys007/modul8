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
public class binarytree {
    treeNode root;
        
 public boolean isEmpty(){
    return (root == null);
 }
 //method insert data
 public void insert(treeNode input) {
    if (isEmpty()) {
    root = input;
    } else {
 treeNode current = root; // cari parent yg sesuai dan (kiri/kanan)
 treeNode parent = null;
 boolean diKiri = true;
 while (current != null) {
 parent = current;
    if (current.data < input.data) { // kalau data yang akan diinputkan lebih besar, maka bergerak ke kanan
        current = current.right;
        diKiri = false;
    }else if(current.data > input.data){  // else gerak ke kiri
        current = current.left;
        diKiri = true;
    }else{
        System.out.println("data "+input.data+" sudah ada ");
        break;
}
}
 if (diKiri) { // hubungkan ke parent
 parent.left = input;
 } else {
 parent.right = input;
 }
}
}
 public void preOrder(){
    preOrder(root);
 }
 public void inOrder(){
    inOrder(root);
 }
 public void postOrder(){
    postOrder(root);
 }

 public void preOrder(treeNode akar){
    if(akar != null){
        System.out.print(akar.data+" ");
        preOrder(akar.left);
        preOrder(akar.right);
}
}
 public void inOrder(treeNode akar){
    if(akar != null){
        inOrder(akar.left);
        System.out.print(akar.data+" ");
        inOrder(akar.right);
}
 }
 public void postOrder(treeNode akar){
    if(akar != null){
        postOrder(akar.left);
        postOrder(akar.right);
        System.out.print(akar.data+" ");
}
 }
 //method mencari data
 public treeNode search(int key) {
    treeNode node = null;
    treeNode current = root;
    while (current != null) { // lakukan pencarian selama current bukan null
         if (current.data == key) {
        return node;
    } else {
        if (current.data < key) {
        current = current.right;
    } else {
        current = current.left;
 }
}
}
 return node;
}  
}
    