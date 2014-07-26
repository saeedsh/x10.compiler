public class Q3 {
	public static def Race(P:Int) {
		var results:Long = 0;
		finish for(p in 1..P) async {
		results += p;
		}
	}
}