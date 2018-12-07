/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment_tree;

/**
 *
 * @author akshit
 */
public class SegmentTree {
    int st[];
    SegmentTree(int arr[],int n)
    {
        int x=(int)Math.ceil(Math.log(n)/Math.log(2));
        int maxSize=2*(int)(Math.pow(2,x));
        st=new int[maxSize];
        st[0]=0;
        int b=buildSegmentTree(0,n-1,arr,1);
    }
    int getMid(int start,int end)
    {
        int mid=start+(end-start)/2;
        return mid;
    }
    int buildSegmentTree(int start,int end,int value[],int n )
    {
        if(start==end)
        {
            st[n]=value[start];
            return value[start];
        }
        int mid=getMid(start,end);
        st[n]=buildSegmentTree(start,mid,value,2*n)+buildSegmentTree(mid+1,end,value,2*n+1);
        return st[n];
        
    }
    void showSegmentTree()
    {
        int l=st.length;
        for(int i=0;i<l;i++)
        {    
            System.out.println("value in location"+i+"   "+st[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int arraysize=array.length;
        SegmentTree st=new SegmentTree(array,arraysize);
        st.showSegmentTree();
    }
}
