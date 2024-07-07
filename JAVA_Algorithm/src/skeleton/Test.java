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

    // 소수판별
    // 에라토스테네스의 체 활용
    public static boolean isPrime(int num) { // 메모이제이션으로 배열에 소수여부를 지정해둘 수 있음
    	
    	if(num == 0 || num ==1) {
    		return false;
    	}
    	
    	int lim = (int)Math.sqrt(num); // limit 지정
    	
    	for(int i = 2; i <=lim; i++) { // i는 2부터 <= lim 한계까지
    		if(num % i == 0) { // 나뉘게 되면 소수가 아님
    			return false;
    		}
    	}
    	return true;
    }





}
