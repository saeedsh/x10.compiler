public class Q3 {
	public static def Race(P:Int) {
		var results:Long = 0;
		var r:Long = 1;
		finish for(p in 1..P) async {
			
			r += p;
			results += p+r;
		}
	}
}