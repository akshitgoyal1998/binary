/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;
import java.util.*;
import JavaPractice.HashMap;
/**
 *
 * @author akshit
 */
public class JavaPractice {
    
    public static void main(String[] args) {
        Hash hs=new Hash();
        System.out.println(""+hs.hashCode());
        int choice;
        do
        {   System.out.println("eneter the correct option which you want to perform");
            System.out.println("1.insert in hash map");
            System.out.println("2.delete in hashmap");
            System.out.println("3.for exit");
            System.out.println("4.to show at location");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            String key=new String();
            String value=new String();
            switch(choice)
                {
                    case 1:
                    {
                        System.out.println("for insertion");
                        System.out.println("enter the value");
                        
                        value=sc.next();
                        System.out.println("enter the key");
                        
                        key=sc.next();
                        hs.insertion(value, key);
                        
                    }
                    break;
                    case 2:
                    {
                        System.out.println("for deletion");
                        System.out.println("enter the key");
                        key=sc.next();
                        hs.delete(key);
                        
                    }
                    break;
                    case 3: System.exit(0);
                    break;
                    case 4:
                    {
                        System.out.println("enter key");
                        key=sc.next();
                        hs.showMap(key);
                    }
                    break;
                    default:
                        System.out.println("wrong input");
                }
        }while(choice!=3);
        
    }
    
}
class Hash extends HashMap
{
    @Override
    int hashFunction(String key)
    {
        int intkey=Integer.parseInt(key);
        System.out.println("value of key is"+intkey);
        return intkey;
        
    }
}