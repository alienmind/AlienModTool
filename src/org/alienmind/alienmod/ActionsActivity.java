package org.alienmind.alienmod;

import android.os.Bundle;

public class ActionsActivity extends ScriptedActivity {
	public boolean onItemSelected(String itemAction, String itemDescription) {
		AlienModTool.getInstance().getTabHost().setCurrentTab(AlienModTool.TAB_CONSOLE);
		return true;
	}
	
	public void onCreate(Bundle savedInstanceState) {		
		this.actions      = getResources().getStringArray(R.array.actions_array);
		this.descriptions = getResources().getStringArray(R.array.descriptions_array);
		super.onCreate(savedInstanceState);		
	}	
}