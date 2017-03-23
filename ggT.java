package ggT;

public class ggT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=342;
		int b=384;
		int ergebnis = ggT(a,b);
		System.out.println(ergebnis);

	}
	static int ggT (int a, int b){
		if(a==b){
			return a;
		}
		else if(a<b){
			return ggT(a,b-a);
		}
		else{
			return ggT(b,a);
		}
	}

}
