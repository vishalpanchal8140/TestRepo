package JavaAssignmentPrograms;

interface Vishal {
    void method1();
}

interface Dashrath {
    void method2();
}

class Friend implements Vishal, Dashrath {
    
    public void method1() {
        System.out.println("Vishal is a Tester");
    }

    
    public void method2() {
        System.out.println("Dashrath is Devloper");
    }

    
    public void childMethod() {
        System.out.println("Both are good friends!");
    }
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Friend frd = new Friend();

		frd.method1();
		frd.method2();
		frd.childMethod();
    }
}
