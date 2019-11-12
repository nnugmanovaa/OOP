package Task4;

import java.util.ArrayList;

public class Sort {
	static <E> void swap(E[] array, int i, int j) {
		E e = array[i];
		array[i] = array[j];
		array[j] = e;
	}

	static <E extends Comparable<E>> void quickSort(E[] array) {
		quickSort(array, 0, array.length - 1);
	}

	static <E extends Comparable<E>> void quickSort(E[] array, int l, int r) {
		int i = l;
		int j = r;
		E m = (E) array[(l + r) / 2];
		while (i < j) {
			while (array[i].compareTo(m) < 0)
				i++;
			while (array[j].compareTo(m) > 0)
				j--;
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		if (l < j)
			quickSort(array, l, j);
		if (i < r)
			quickSort(array, i, r);
	}

	static <E extends Comparable<E>> void mergeSort(E[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	static <E extends Comparable<E>> void mergeSort(E[] array, int l, int r) {
		if (l < r) {
			int m = (r + l) / 2;
			mergeSort(array, l, m);
			mergeSort(array, m + 1, r);
			merge(array, l, m, r);
		}

	}

	static <E extends Comparable<E>> void merge(E[] array, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int uk1 = 0;
		int uk2 = 0;
		int k = l;

		ArrayList<E> L = new ArrayList<>();
		ArrayList<E> R = new ArrayList<>();
		for (int i = 0; i < n1; i++)
			L.add(array[l + i]);
		for (int j = 0; j < n2; j++)
			R.add(array[m + j + 1]);

		while (uk1 < n1 && uk2 < n2) {
			if (L.get(uk1).compareTo(R.get(uk2)) <= 0) {
				array[k] = L.get(uk1);
				uk1++;
			} else {
				array[k] = R.get(uk2);
				uk2++;
			}
			k++;
		}

		while (uk1 < n1) {
			array[k] = L.get(uk1);
			uk1++;
			k++;
		}

		while (uk2 < n2) {
			array[k] = R.get(uk2);
			uk2++;
			k++;
		}
	}

}
