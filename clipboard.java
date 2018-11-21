package clipboard_project;

import java.util.LinkedList;
import java.util.List;

public class clipboard {
	
	List<element> elements;
	int size;
	int nb_element;
	
	public clipboard(int i_size)
	{
		size = i_size;
		nb_element=0;
		elements = new LinkedList<element>();
	}
	
	public void add_element(int input)
	{
		if(nb_element < size)
		{
			elements.add(new elementInt(input));
			nb_element++;
		}
		
		else
		{
			elements.add(new elementInt(input));
			elements.remove(0);
			
		}
		
	}
	
	public void add_element(double input)
	{
		if(nb_element < size)
		{
			elements.add(new elementfloat(input));
			nb_element++;
		}
		
		else
		{
			elements.add(new elementfloat(input));
			elements.remove(0);
			
		}
		
	}
	
	public void add_element(String input)
	{
		if(nb_element < size)
		{
			elements.add(new elementString(input));
			nb_element++;
		}
		
		else
		{
			elements.add(new elementString(input));
			elements.remove(0);
			
		}
		
		
		
	}
	
	public void display()
	{
		for(element e : elements)
		{
			e.display();
		}
	}
	
	public int getNumberCount()
	{
		int count=0;
		
		for(element e : elements)
		{
			if(e.isNumber())
				count ++;
		}
		
		return count;
		
	}
	
	public double getNumberSum()
	{
		double sum=0;
		
		for(element e : elements)
		{
			if(e.isNumber())
			{
				elementnumber a = (elementnumber) e;
				sum = sum + a.getContent();
				
			}
		}
		
		return sum;
		
	}

}
