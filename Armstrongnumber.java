package guviset3;

public class Armstrongnumber {
public static void main(String[] args){
	int a,b=0,c,d,e,sum=0;
	System.out.println("Armstrong number btw 10 to 90:");
	for(int i=1;i<=100;i++){
		a=i;
		while(a>0){
			b=a%10;
			sum=sum+(b*b*b);
			a=a/10;
		}
		if(sum==i){
			System.out.println(i+" ");
		}
		
	}
}
}
