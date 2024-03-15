package com.tnsif.multilevel;

public class WordPad extends Notepad
{
	private boolean isBold;

	public WordPad()
	{
		this.isBold=false;
	}
	public void formatText(boolean bold)
	{
		if(bold)
		{
			content="<b>"+content+"<b>";
		}
		isBold=bold;

	}
	public boolean isBold()
	{
		return isBold;
	}
	
}

