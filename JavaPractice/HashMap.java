/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;

/**
 *
 * @author akshit
 *
 */
    abstract class HashMap {
    int capacity;
    float loadfactor;
    int count;
    Node ns[]=new Node[16];
    
    HashMap()
    {
        capacity=16;
        loadfactor=(float)0.75;
        System.out.println("kindly create hash function with "+capacity+"capacity");
        
    }
    void HashMap(int capacity)
    {
        this.capacity=capacity;
        loadfactor=(float)0.75;
        System.out.println("kindly create hash function with "+capacity+"capacity");
    }
    HashMap(int capacity,float loadfactor)
    {
        this.capacity=capacity;
        this.loadfactor=loadfactor;
        System.out.println("kindly create hash function with "+capacity+"capacity");
    }
    abstract int hashFunction(String key);
    
    void insertion(String value,String key)
    {
        Node node=new Node();
        node.value=value;
        node.key=key;
        int index=hashFunction(key);
        boolean found=keyEqual(key,ns,value);
        if(found==true)
        {
            System.out.println("value updated successfully");
        }
        else
        {
            if(ns[index]==null)
            {
                ns[index]=node;
                count++;
                System.out.println("v alue in ");
               /// updateSize();//not completed 
            }
            else
            {
                Node temp,parent=new Node();
                temp=ns[index];
                while(temp!=null)
                {
                    parent=temp;
                    temp=temp.next;
                }
            parent.next=node;
                
            }
            System.out.println("value inserted successfully");
        }
           
        
    }
    boolean keyEqual(String key,Node ns[],String value)//function return false if key not found
    {
        boolean result=false;
        System.out.println("");
        int index=hashFunction(key);
        while(ns[index]!=null)
        {
            if((ns[index].key).equals(key))//updating value in given key
            {
                ns[index].value=value;
                result=true;
                return result;
            }
            ns[index]=ns[index].next;
        }
     
        return result;
        
    }
    void showMap(String key)
    {
        int intkey=hashFunction(key);
        if(ns[intkey]==null)
        {
            System.out.println("value in given node is NULL!!!");
        }
        else
        {
            System.out.println("value in node is "+ns[intkey].value);
        }
    }
    /**void updateSize() //not completed
    {
        if(count>(loadfactor*capacity))
        {
            Node newnode[]=new Node[2*capacity];
            System.arraycopy(ns,0,newnode,0,ns.length);
            
            
            
            
        }
    }**/
    void delete(String key)
    {
        boolean flag=false;
        int index=hashFunction(key);
        System.out.println("value of index is "+index);
        if(ns[index]==null)
        {
            System.out.println("sorry given key doesnt exist in hash table");
        }
        else
        {
            Node temp,parent=new Node();
            temp=ns[index];
            parent=ns[index];
            while(temp!=null)
            {
                
                if((temp.key).equals(key))
                {
                    parent.next=null;
                    parent.next=temp.next;
                    temp.value=null;
                    temp.key=null;
                    temp.next=null;
                    flag=true;
                    System.out.println("value deleted successfully");
                    break;
                }
                parent=temp;
                temp=temp.next;
            }
            
            if(flag==false)
            {
                System.out.println("value not found");
            }
            
        }
        
    }
        
}

class Node
{
    String key;
    String value;
    Node next;
    Node()
    {
        int value =0;
        
    }
}
