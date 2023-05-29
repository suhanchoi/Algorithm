package skeleton;

public class Math {

    public static void main(String[] args){

        Math.max(10,2);
        Math.min(3,2);

        Math.abs(-5);

        Math.ceil(-3.2);  // 올림
        Math.floor(-3.2); // 내림
        Math.round(-3.2); // 반올림

        // 3-1. 소수 둘째, 셋째 자리에서 반올림 하고 싶다면
        double a = 1.23456;
        String b = String.format("%.1f", a);	// .1f는 둘째자리에서 반올림

        // 4. 제곱 제곱근
        Math.pow(2, 2);		// 2^2 = 4
        Math.sqrt(4);		// 2


    }


}
