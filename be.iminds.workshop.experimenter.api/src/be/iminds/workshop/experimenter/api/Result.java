package be.iminds.workshop.experimenter.api;

public class Result {

	public final long timeStarted;
	public final long timeEnded;
	public final String result;
	
	public Result(final long t1, final long t2, final String s){
		this.timeStarted = t1;
		this.timeEnded = t2;
		this.result = s;
	}
}
