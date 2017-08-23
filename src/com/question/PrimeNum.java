package com.question;

/**
 * 2~1000的质数
 * @author YX
 *
 */
public class PrimeNum {

	
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 2; i < 1000; i++) {
			
			if(checkPrime(i)){
				System.out.print(i+"\t");
				count ++;
				if(count % 8 == 0){
					System.out.println();
				}
			}
			
		}
		System.out.println("有"+count+"个");
	}
	
	public static boolean checkPrime(int num){
		if(num == 0 || num == 1){
			return false;
		}
		
		if(num == 2){
			return true;
		}
		
		if(num % 2 == 0){
			return false;
		}
		
		boolean flag = true;
		for (int i = 3; i < num/2; i++) {
			if(num % i == 0){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
