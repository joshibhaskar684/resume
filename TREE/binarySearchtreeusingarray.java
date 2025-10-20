// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;
class BST{
    class Node{
        int value;
        Node right ;
        Node left;
        int height;
        Node(int v){
            this.value=v;
            right=null;
            left=null;
        }
    }
    Node root;
    
    // public void insert(Scanner sc){
    //          System.out.println("enter the value");
    //     int v=sc.nextInt();
    //     while(v!=-1){
    //         root=insert(v,root);
    //         v=sc.nextInt();
            
    //     }
        
    //     display(root);
    //   System.out.println("height"+ height(root));
        
    // }
    
    
    // insert using array
    
    public void insert(int a[]){
        for(int i=0;i<a.length-1;i++){
           root= insert(a[i],root);
        }
        display(root);
        System.out.println("height"+ height(root));
    }
    public Node insert(int v,Node node){
        if(node==null){
            return new Node(v);
        }
        if(v<=node.value){
            node.left=insert(v,node.left);
        }
        if(v>=node.value){
            node.right=insert(v,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    public void display(Node node){
        if(node==null){
            return;
        }
        d(node,"root node ");
    }
    public void d(Node node ,String d){
        if(node==null){
            return;
        }
          System.out.println(d +node.value);
          d(node.left,"left node of "+node.value+"is ");
             d(node.right,"right node of "+node.value+"is ");
        
    }
    public boolean balanced(){
        
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
       return  Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
    }
    
    
    
}
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Try programiz.pro");
        int a[]={50,100,25,30,35,20,15,40,60,70,80,90};
        BST obj=new BST();
        obj.insert(a);
         System.out.println(obj.balanced());
        
        
    }
}
