public class Q5 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Q5 N");
			return;
		}

		int n = Integer.parseInt(args[0]);

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("x");
				if (j < i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
