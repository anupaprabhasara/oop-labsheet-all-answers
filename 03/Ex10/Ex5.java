public class Ex5 {
    public static void main(String[] args) {
	int i = 0;
	
	while(i<5) {
	    int j = 0;
	    while(j<5) {
		System.out.print("* ");
		++j;
	    }
	    System.out.print("\n");
	    ++i;
	}
	
	System.out.print("\n");

	for(i=1; i<=5; i++) {
	    for(int j=5; j>i; j--) {
		System.out.print(" ");
	    }
	    for(int j=0; j<i; j++) {
		System.out.print("* ");
	    }
	    System.out.print("\n");
	}
    }
}