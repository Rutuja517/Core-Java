package com.tnsif.multilevel;

public class Word extends WordPad{
	private boolean spellCheckEnabled;

	public Word() {
		this.spellCheckEnabled=true;
	}
	public void spellCheck() {
		if(spellCheckEnabled) {
			System.out.println("Running Spelling Check.....");
		}else {
			System.out.println("Spelling Check is Disable");
		}
	}
	public void enableSpellCheck(boolean enable)
	{
		spellCheckEnabled=enable;
	}
	

}
