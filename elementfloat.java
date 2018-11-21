package clipboard_project;

public class elementfloat extends elementnumber{
	
	private double content;
	
	public elementfloat(double input)
	{
		content = input;
	}
	
	public double getContent() {
		// TODO Auto-generated method stub
		return content;
	}
	
	public void display()
	{
		System.out.println(content);
	}

}
