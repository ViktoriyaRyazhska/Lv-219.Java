package com.softserve.lv219.homework;

import java.util.LinkedHashMap;
import java.util.Map;


@SuppressWarnings("hiding")
public class Menu<Executable>  {
	
	
	
	Map<String, Executable> menu = new LinkedHashMap<>();

	public  Map<String, Executable> getMenu() {
		return menu;
	}

	@SuppressWarnings("unchecked")
	public void mainMenu() {
		menu.clear();
		menu.put("ex330", (Executable) new Exercise330());
		menu.put("ex86a", (Executable) new Exercise86a());
		menu.put("ex86b", (Executable) new Exercise86b());
		menu.put("exit", (Executable) new Exit());
		
	}
	
	
	

}