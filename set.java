package Discrete_lab1;

import java.util.LinkedList;

public class set {

	private static String[] array;
	private long s;
	
	public set(String []universal)
	{
		this.array=universal;
	}
	public void addstring(String in)
	{
		int l=array.length;
		for(int i=l-1;i>=0;i--)
		{
			if(array[i].equals(in))
			{
				part1 r=new part1();
				s=r.setbit(s, l-i-1);
				break;
			}
		}
	}
	public set union(set q)
	{
		set union=new set(array);
		union.s=this.s|q.s;
		return union;
		
	}
	public set intersection(set q)
	{
		set intersection=new set(array);
		intersection.s=this.s&q.s;
		return intersection;
	}
	public set complement()
	{
	    set complement=new set(array);
	    complement.s=((int)Math.pow(2, array.length)-1)&(~(this.s));
	    return complement;
	}
	public set difference(set q)
	{
		set difference=new set(array);
		difference.s=this.s&(~(q.s));
		return difference;
	}
	public long cardinality()
	{
		part3 r=new part3();
		return r.bits(this.s);
	}
	public LinkedList<String> get_elements()
	{
		LinkedList<String> ll = new LinkedList<String>();
		int l=array.length;
		part1 w=new part1();
		for(int i=l-1;i>=0;i--)
		{
			if(w.getbit(this.s, l-i-1)==1)
			{
				ll.add(array[i]);
			}
		}
		return ll;
		
	}
}
