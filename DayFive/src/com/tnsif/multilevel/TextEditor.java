package com.tnsif.multilevel;

public class TextEditor {
	public static void main(String[] args) {
		Word w=new Word();
		w.write("Hello");
		w.display();
		w.formatText(true);
		w.display();

		w.spellCheck();
		w.enableSpellCheck(false);
		w.spellCheck();


	}
}
