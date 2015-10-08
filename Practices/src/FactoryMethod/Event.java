package FactoryMethod;

import java.io.File;
import java.util.Vector;

public abstract class Event {
	protected int numLanes;  //赛道数
	protected Vector<Swimmer> swimers;
	public Event(String filename, int lanes){
		numLanes = lanes;
		swimers = new Vector<>();
		File f = new File(filename);
		
	}
	
	public abstract Seeding getSeeding();
	public abstract boolean isPrelim();
	public abstract boolean isFinal();
	public abstract boolean isTimeFinal();
}
