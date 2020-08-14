import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		Integer[] list = { 1, 14, 15, 24, 55, 59, 73, 90, 94, 99 };

		int min = 0;
		int mid = 0;
		int max = list.length - 1;

		int target = 73;
		boolean found = false;

		// Confirm list is sorted
		// (not necessary in this example but included to emphasize this point)
		Arrays.sort(list);

		System.out.println("List (sorted): " + Arrays.toString(list));

		int iteration = 1;

		while (!found && min <= max) {
			System.out.println();
			System.out.println("Iteration #" + iteration);
			mid = (min + max) / 2;
			System.out.println("Middle element: " + list[mid]);
			System.out.println("Left bound: " + list[min]);
			System.out.println("Right bound: " + list[max]);

			if (list[mid].equals(target)) {
				found = true;
			} else if (target < list[mid]) {
				max = mid - 1;
			} else
				min = mid + 1;

			iteration++;

		}

		if (found)
			System.out.print("Target found!");

	}

}
