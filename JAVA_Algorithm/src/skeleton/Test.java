package skeleton;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(2));
		
		int a, b;
		
		a = 4 * (1/2);
		System.out.printf("%d\n", a);
		b = a++;
		System.out.printf("%d", b);
		System.out.printf("%d", b);
		
	}

    // �Ҽ��Ǻ�
    // �����佺�׳׽��� ü Ȱ��
    public static boolean isPrime(int num) { // �޸������̼����� �迭�� �Ҽ����θ� �����ص� �� ����
    	
    	if(num == 0 || num ==1) {
    		return false;
    	}
    	
    	int lim = (int)Math.sqrt(num); // limit ����
    	
    	for(int i = 2; i <=lim; i++) { // i�� 2���� <= lim �Ѱ����
    		if(num % i == 0) { // ������ �Ǹ� �Ҽ��� �ƴ�
    			return false;
    		}
    	}
    	return true;
    }





}
