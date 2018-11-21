package clipboard_project;

public class elementInt extends elementnumber{

	private int content;
	
	public elementInt(int input)
	{
		content = input;
	}
	
	public double getContent() {
		// TODO Auto-generated method stub
		return (double)content;
	}
	
	public void display()
	{
		System.out.println(content);
	}

}
