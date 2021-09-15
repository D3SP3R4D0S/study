import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
		// 소수만들기
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //int cnt = 0;
		boolean isPrime = true;
		
        for (int k=2; k<number; k++){
            if(number % k == 0){
				isPrime = false;
				break;
			}
        }
        if(isPrime)
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다");
    }
}
