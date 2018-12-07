/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice.Trie;

/**
 *
 * @author akshit
 */
public class Trie {
    
   static class TrieNode
{
    int alphabetSize;
    TrieNode node[]=new TrieNode[alphabetSize];
    boolean endOfWord;
    TrieNode()
    {
        alphabetSize=26;
        endOfWord=false;
        for(int i=0;i<alphabetSize;i++)
        {
            node[i]=null;
        }
    }
    
}
   static TrieNode root;
    static void insertion(String key)
    {
        int length;
        int index;
        int level;
        length=key.length();
        TrieNode pcrawl=root;
        for (level=0;level<length;level++)
        {
            index=key.charAt(level)-'a';
            if(pcrawl.node[index]==null)
                pcrawl.node[index]=new TrieNode();
            pcrawl=pcrawl.node[index];
            
        }
        pcrawl.endOfWord=true;
    }
    static boolean search(String key)
    {
        int length;
        int level;
        int index;
        TrieNode pcrawl=root;
        length=key.length();
        for(level=0;level<length;level++)
        {
            index=key.charAt(level)-'a';
            if(pcrawl.node[index]==null)
                return false;
            pcrawl=pcrawl.node[index];
            
        }
        return (pcrawl !=null&&pcrawl.endOfWord);
    }
    
}
