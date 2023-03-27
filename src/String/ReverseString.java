package String;

public class ReverseString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		char[] ch = str.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		System.out.println(new String(ch));
	}

}
