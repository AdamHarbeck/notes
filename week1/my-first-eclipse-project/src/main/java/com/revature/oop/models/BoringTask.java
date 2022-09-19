package com.revature.oop.models;

public final class BoringTask extends Task{

	public BoringTask() {
//		super(); //implicit if not put explicitly
		super("Hello World!");
	}

	public BoringTask(String description) {
		super(description);
	}

	@Override
	public String toString() {
		return "BoringTask Haha [getDescription()=" + getDescription() + ", isCompleted()=" + isCompleted()
				+ ", getDueDate()=" + getDueDate() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	public void boringTaskSpecificMethod() {
		System.out.println("This is only for boring Task.");
	}
	
}
