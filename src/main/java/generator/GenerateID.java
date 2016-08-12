package generator;

import java.util.concurrent.atomic.AtomicLong;

/*
 * Raul Barth
 * Memory-efficient ID type and ID generator (Pure Java approach).
 * This JAR is to be imported from other projects, having two methods:
 * 		getID: which generates 1 ID
 * 		getBatchID: which generates a batch of ids based on the <iterations> parameter
 */

public class GenerateID {

	public long getID(){
			final AtomicLong counter = new AtomicLong(System.nanoTime() * 1000);
			return counter.getAndIncrement();
	}
	
	public long[] getBatchID(int iterations){
		long[] ids = new long[iterations];
		for(int i=0;i<iterations;i++){
			final AtomicLong counter = new AtomicLong(System.nanoTime() * 1000);
			ids[i] =  counter.getAndIncrement();
		}
		return ids;
	}
}
