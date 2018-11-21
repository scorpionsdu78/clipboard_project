package clipboard_project;

public class elementString extends element  {

	private String content;
	
	public elementString(String input)
	{
		content = input;
	}
	
	
	/*public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}*/
	
	public void display()
	{
		System.out.println(content);
	}

}
