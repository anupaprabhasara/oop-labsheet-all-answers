public class Ex6 {
    public static void main(String[] args) {
	int i = 1;
	
	while(i<=5) {
	    int k = 0;
	    while(k<5) {
		System.out.print("* ");
		++k;
	    }

	    System.out.print("    ");

	    for(int j=5; j>i; j--) {
		System.out.print(" ");
	    }
	    for(int j=0; j<i; j++) {
		System.out.print("* ");
	    }
	    
	    System.out.print("\n");
	    ++i;
	}
    }
}