package GreedyAlgo;

import java.util.*;  
import java.util.Comparator;

 class HuffmanTree
{
    char data;
    int freq;
    HuffmanTree left,right;
    
    public HuffmanTree(char d,int i)
    {
        data = d;
        freq =i;
        left =null;
        right = null;
    }
    public HuffmanTree(char d,int i,HuffmanTree l,HuffmanTree r)
    {
        data = d;
        freq = i;
        left = l;
        right = r;
    }

    public char getData() {
        return data;
    }

    public int getFreq() {
        return freq;
    }
}



public  class HuffmanEncoding {

    
    public void huffmanCode(PriorityQueue<HuffmanTree> q)
    {
    	HuffmanTree l = null;
        HuffmanTree r = null;
        HuffmanTree top = null;
        
        while(q.size()>1)
        {
           l = q.poll();
           r = q.poll();
           int d = l.getFreq() + r.getFreq();
           top = new HuffmanTree('$', d,l,r);            // $ special value for internal nodes
           q.add(top);
        }
        PriorityQueue<HuffmanTree> s=new PriorityQueue<HuffmanTree> (q);
        printCodes(q.poll(), "");
        decode("100101", s.poll());
    }
    
    void printCodes(HuffmanTree tree,String str)
    {
        if(tree == null)
            return;
        if(tree.data !='$')
            System.out.println(tree.data+" "+str);
        printCodes(tree.left, str+"0");
        printCodes(tree.right, str+"1");
    }
    void decode(String S ,HuffmanTree root)
    {
         StringBuilder sb = new StringBuilder();
         HuffmanTree c = root;
    for (int i = 0; i < S.length(); i++) {
        c = S.charAt(i) == '1' ? c.right : c.left;
        if (c.left == null && c.right == null) {
            sb.append(c.data);
            c = root;
        }
    }
    System.out.print(sb);

       
    }
    
    public static void main(String[] args) {
        
    	HuffmanEncoding hh = new HuffmanEncoding();
        Comparator<HuffmanTree> cmp = new Comparator<HuffmanTree>()
        {
            @Override 
            public int compare(HuffmanTree o1,HuffmanTree o2)
            {
                return Integer.compare(o1.getFreq(), o2.getFreq());
            }
        };
        
        PriorityQueue<HuffmanTree> h = new PriorityQueue<HuffmanTree>(cmp);
        
        h.add(new HuffmanTree('a', 5));
        h.add(new HuffmanTree('b', 9));
        h.add(new HuffmanTree('c', 12));
        h.add(new HuffmanTree('d', 13)); 
        h.add(new HuffmanTree('e', 16));
        h.add(new HuffmanTree('f', 45));
   
        
        hh.huffmanCode(h);
      
    }
    
}