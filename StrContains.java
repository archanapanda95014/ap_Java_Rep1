package aparrays;

public class StrContains {

	public static void main(String[] args) {
		System.out.println(strStr("fdg", ""));
	}

	public static int strStr(String haystack, String needle) {

		if (haystack.indexOf(needle) != -1) {
			return haystack.indexOf(needle);
		} else if ((needle.isEmpty())&&(haystack.isEmpty())) {
			return 0;
		} else 
			return -1;
		}
	}


