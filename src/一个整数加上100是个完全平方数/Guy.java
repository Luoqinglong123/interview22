package һ����������100�Ǹ���ȫƽ����;

public class Guy {
	public static void main(String[] args) {
		int i = 0;
		while (i < 100000) {
			if (Math.sqrt(i + 100) % 1 == 0
					&& Math.sqrt(i + 100 + 168) % 1 == 0) {
				System.out.println(i);
			}
			i++;
		}
	
	}
}