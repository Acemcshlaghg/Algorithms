
public class Teleportation {
	public static void code() {
		int[] input = {10, 3, 8, 2};
		int sum = Math.min(Math.abs(input[0] - input[3]), Math.abs(input[0] - input[2])) + Math.min(Math.abs(input[1] - input[3]), Math.abs(input[1] - input[2]));
		System.out.println(sum);
	}
}
