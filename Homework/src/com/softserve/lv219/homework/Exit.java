package com.softserve.lv219.homework;



public class Exit implements Executable {


	
	@Override
	public void execute() {
		System.out.println("Good Bye!");
		System.exit(0);
	}

	
}
