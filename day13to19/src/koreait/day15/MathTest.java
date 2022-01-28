package koreait.day15;

public class MathTest {

	public static void main(String[] args) {
	/*	소수의 개념 : 1보다 큰 자연 수 중 1과 자기 자식만을 약수로 가지는 수(prime number) 
		예시 : 15는 약수 1,(3,5),15 11의 약수 1,11->소수
		소수 팔별 수식을 생각해보자. 정수 num이 소수일까? 2부터 num-1까지 나눠서 나머지가 0인값이 있으면 소수 아님.
		-> *num이 15일때 2에서 14까지 나눠서 나머지가 0이 있는지? 
		-> 큰값을 판별할떄는 실행속도를 줄이기 위해 ***2 ~ 루트 (제곱근) 값까지 나누기만 하면 된다.
		-> **제곱근 대신에 2부터 num/2까지 나눠서(몫) 할수도 있다. */
		
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(15));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(22));
		
		
		System.out.println("어떤수가 소수인지 확인해보자 어떤수 입력: ");
		int num = 17;
		boolean isPrime = true;
		
		for(int i=2; i<Math.sqrt(num);i++) { //조건은 *i<num, **i<num/2, ***i<Math.sqrt(num)
							//num이 소수일때 반복횟수가 가장 작은 조건식은? i<Math.sqrt(num)
			
			if(num % i ==0) { //나눠 떨어진다(나머지 0)
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+"은 소수입니다.");
		}else
			System.out.println(num+"은 소수가 아닙니다");
		
		
	}

}
