package com.question;


/**
 * Î´Íê³É
 * @author YX
 */
public class EightQueenTheFor {
	static int[][] t = new int[4][4];
	
	
	public static void exe(){
		
		for (int a = 0; a < t.length; a++) {
			
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t.length; j++) {
					for (int j2 = 0; j2 < t.length; j2++) {
						
						if(!check(j,j2)){
							t[j][j2] = 1;
						}
						
						
					}
				}
				int f = 0;
				for (int q = 0; q < t.length; q++) {
					for (int w = 0; w < t.length; w++) {
						System.out.print(t[q][w]);
						f++;
						if(f%t.length==0){
							System.out.println();
						}
					}
				}
				System.out.println();
			}
		}
		
	}
	
	public static boolean check(int x, int y){
		
		//check ¡ª
		for (int i = 0; i < t.length; i++) {
			if(i == y){
				continue;
			}
			if(t[x][i] == 1){
				return true;
			}
		}
		
		
		//check |
		for (int i = 0; i < t.length; i++) {
			if(i == x){
				continue;
			}
			if(t[i][y] == 1){
				return true;
			}
		}
		
		//check \
		int i = 0 ;
		int j = 0 ;
		if(y >= x){
			j = y - x ;
		}else{
			i = x - y ;
		}
		try {
			do{
				if(i != x && j != y){
					if(t[i][j] == 1){
						return true;
					}
				}
				i++;
				j++;
			}while(j<t.length && i<t.length);
		} catch (Exception e) {
			System.out.println("\\x="+x+",y="+y);
			System.out.println("\\i="+i+",j="+j);
		}
		
		//check /
		i = 0;
		j = t.length-1;
		if(y >= x){
			i = Math.abs(x-(j-y));
		}else{
			j = x + 1 == t.length ? x-1 : x+1;
		}
		try {
			do{
				if(i != x && j != y){
					if(t[i][j] == 1){
						return true;
					}
				}
				i++;
				j--;
			}while(j>=0 && i<t.length);
		} catch (Exception e) {
			System.out.println("/x="+x+",y="+y);
			System.out.println("/i="+i+",j="+j);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		exe();
		
	}
}
