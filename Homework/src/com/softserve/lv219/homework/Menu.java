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
		menu.put("ex178d", (Executable) new Exercise178d());
		menu.put("ex178e", (Executable) new Exercise178e());
		menu.put("ex182", (Executable) new Exercise182());
		menu.put("ex555", (Executable) new Exercise555());
		menu.put("ex87_1", (Executable) new Exercise87_1());
		menu.put("ex323_b", (Executable) new Exercise323_b());
		menu.put("ex324", (Executable) new Exercise324());
		menu.put("ex560", (Executable) new Exercise560());
		menu.put("ex560_b", (Executable) new Exercise560_b());
		menu.put("ex87", (Executable) new Exercise87());
		menu.put("ex323", (Executable) new Exercise323());
		menu.put("ex88a", (Executable) new Exercise88a());
		menu.put("ex243a", (Executable) new Exercise243a());
		menu.put("ex88b", (Executable) new Exercise88b());
		menu.put("ex322", (Executable) new Exercise322());
		menu.put("ex108", (Executable) new Exercise108());
		menu.put("ex325", (Executable) new Exercise325());
		menu.put("ex561", (Executable) new Exercise561());
		menu.put("ex559", (Executable) new Exercise559());
		menu.put("ex107", (Executable) new Exercise107());
		menu.put("exit", (Executable) new Exit());
		
		
	}
	
}
