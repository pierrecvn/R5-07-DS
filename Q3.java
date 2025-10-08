public class Q3 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("utilisation: java Q3 N");
			return;
		}

		int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			if (i < n) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
