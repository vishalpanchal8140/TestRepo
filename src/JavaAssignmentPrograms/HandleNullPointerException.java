package JavaAssignmentPrograms;

public class HandleNullPointerException {

	public static void main(String[] args) {
		String m = null;

		try {
            if (m.equals("Hello")) {
                System.out.println("YES");
            }
        }
        catch (NullPointerException e) {
            System.out.println("Object reference cannot be null");
        }
	}
}
