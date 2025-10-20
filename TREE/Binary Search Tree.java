// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class BinaryTree{
    
    class Node{
        int value;
        Node l;
        Node r;
        Node(int v){
            this.value=v;
            l=null;
            r=null;
        }
    }
    private Node RootNode=null;
    public void insert(Scanner sc){
        int v =sc.nextInt();
        while(v!=-1){
        RootNode=insert(v,RootNode);
          v = sc.nextInt();
        }
    }
    private Node insert(int v,Node node){
        if(node==null){
            return new Node(v);
        }
       else if(node.value<v){
            node= insert(v,node.r);
        }
       else if(node.value>v){
           node= insert(v,node.l);
        }
        return node;
    }
    
}

 
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Try programiz.pro");
        BinaryTree bt=new BinaryTree();
        bt.insert(sc);
    }
}
