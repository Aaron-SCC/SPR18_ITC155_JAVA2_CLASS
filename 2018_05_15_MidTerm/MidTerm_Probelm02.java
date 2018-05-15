import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.awt.*;


public class MidTerm_Probelm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("THIS IS A TEMPLATE MidTerm Problem #02 \n\n");
		
		Scanner console = new Scanner(System.in);
		
		System.out.println(mystery3(6));
		System.out.println(mystery3(17));
	}
	
	
	public static int mystery3(int n) {
		if (n < 0) {
			return -mystery3(-n);
		} else if (n < 10) {
			return n;
		} else {
			return mystery3(n / 10 + n % 10);
		}
		
	}
	

}
