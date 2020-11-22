package chap11;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] strSplit = str.split(",");
		for (String i : strSplit) {
			System.out.println(i);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
