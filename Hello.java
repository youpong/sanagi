public class Hello {
    public static void main(String[] args) {
	for(int i = 1; i < 40; i++)
	    nabeatsu(i);
    }
    
    private static void nabeatsu(int i) {
	if (i % 3 == 0 || String.valueOf(i).indexOf("3") != -1) {
	    System.out.println("--" + i);
	} else {
	    System.out.println(i);
	}
    }
}
