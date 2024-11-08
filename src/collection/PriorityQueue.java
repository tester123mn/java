package collection;

public class PriorityQueue {

	public static void main(String[] args) {

		java.util.PriorityQueue pq=new java.util.PriorityQueue();
		
		pq.add("smith");
		pq.add("allan");
		pq.add("adam");
		pq.add("miller");
		pq.add("scott");
//		pq.add(1,"miller");CTE
//		pq.add(null);//RTE NPE
//		pq.add(10);//RTE CCE
		pq.add("adam");
		System.out.println(pq);
	}

}
