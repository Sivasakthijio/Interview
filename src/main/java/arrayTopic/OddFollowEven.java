package arrayTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFollowEven {

	public static void main(String[] args) {
		int a[] = { 9, 10, 20, 12, 13, 15, 38, 45, 21, 87 };

		Arrays.sort(a);

		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> Rearr = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				even.add(a[i]);
			} else {
				odd.add(a[i]);
			}
		}
		System.out.println(even);
		System.out.println(odd);

		int k = 0;

		while (Rearr.size() < even.size() + odd.size()) {
			
				if (k < even.size()) {
					Rearr.add(even.get(k));
				}
				if (k < odd.size()) {
					Rearr.add(odd.get(k));
				}
				k++;
			}
		System.out.println(Rearr);
			
		}
	}
