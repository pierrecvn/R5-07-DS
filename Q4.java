public class Q4 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Q4 N");
			return;
		}

		int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if (j < i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
