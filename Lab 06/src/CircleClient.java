public class CircleClient {

	public static void main(String[] args) {
		
		ColoredCircle p1 = new ColoredCircle(2, 3, 4, " yellow");
		ColoredCircle p2 = new ColoredCircle (2, 6, 21, " pink");
		
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
	}

}
