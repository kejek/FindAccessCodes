package com.google.find_the_access_codes;

public class Answer {

	public static int answer(int[] l) {

		if (l.length < 3) {
			return 0;
		}

		int cnt = 0;
		Integer[] arr = new Integer[l.length];
		for (int i = l.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (l[i] % l[j] == 0) {
					if (arr[j] != null) {
						cnt += arr[j];
					} else {
						int scndcnt = 0;
						for (int k = j - 1; k >= 0; k--) {
							if (l[j] % l[k] == 0) {
								scndcnt++;
							}
						}
						arr[j] = scndcnt;
						cnt += scndcnt;
					}
				}
			}
		}
		return cnt;
	}
}
