import java.util.Scanner;

public class Main{
	public static void es1(){
		// ESERCIZIO 1
		
		int x, y;
		x = 3;
		y = 5;
		
		System.out.println("Valore di x e': " + x);
		System.out.println("Valore di y e': " + y);
		
		/*
			1) Errore in Runtime, variabili non inizializzate
			2) 3.0 e 5.0 essendo valori double, quindi "più grandi" di valori di tipo intero, non possono essere assegnate senza un cast esplicito
			3) le variabili x e y assumeranno il valore UNICODE dei caratteri 'a' e 'b'
		*/
	}
	
	public static void es2(){
		// ESERCIZIO 2
		
		double x, y;
		x = 125.0;
		y = 85.3;
		
		double prodotto = x * y;
		double divisione = x / y;
		
		System.out.println("Valore x: " + x + ", valore y: " + y + ", prodotto: " + prodotto + ", divisione: " + divisione);
		
		/*
			1) Nonostante vengano inizializzate con valori interi, la variabile double essendo più grande di un intero durante l'esecuzione in automatico effettura' un cast implicito, quindi avranno i valori 125.0 e 85.0
		*/
	}
	
	public static void es3(){
		// ESERCIZIO 3
		
		int x, y;
		double a, b;
		x = 7;
		y = 2;
		a = 7.0;
		b = 2.0;
		
		int quoziente = x / y;
		double divisione = a / b;
		double resto = divisione - quoziente;
		
		
		System.out.println("La divisione tra i numeri " + x + " e " + y + " risulta: " + quoziente + " con resto: " + resto);
		System.out.println("La divisione tra i numeri " + a + " e " + b + " risulta: " + divisione);
	}
	
	public static void es4(){
		char x, y;
		x = 'a';
		y = 'b';
		
		System.out.println(x + "" + y);	
	}
	
	public static void es5(){
		int x, y;
		x = 2;
		y = 8;
		int areaRettangolo = x*y;
		
		System.out.println("Lato1 = " + x);
		System.out.println("Lato2 = " + y);
		System.out.println("Area = " + areaRettangolo);
	}
	
	public static void es6(){
		int x, y, h, areaTrapezio;

		x = 5;
		y = 4;
		h = 9;
		areaTrapezio = (x+y)*h/2;
		
		System.out.println("Base1 = " + x + " Base2 = " + y + " Altezza = " + h);
		System.out.println("Area = "+areaTrapezio);
	}
	
	public static void es7(){
		int x = 3;
		int y = 9;
		
		int espressione1 = (13+9+6-7)*2;
		double espressione2 = ((2+3)*5)+((2.0/3+5)*4)+(3*(7+5-13));
		double espressione3 = ((3.4+5-6.3)*4.3+(3.5*(-4)))*6;
		int espressione4 = (x+y)*(x-y);
		int espressione5 = x^2 + y^2;
		int espressione6 = ((x+y)*(x-y))/(2*x+y)^2;
		
		System.out.println("(13+9+6-7)*2="+espressione1);
		System.out.println("((2+3)*5)+((2/3+5)*4)+(3*(7+5-13))="+espressione2);
		System.out.println("((3.4+5-6.3)*4.3+(3.5*(-4)))*6="+espressione3);
		System.out.println("(x+y)*(x-y)="+espressione4);
		System.out.println("x^2+y^2="+espressione5);
		System.out.println("((x+y)*(x-y))/(2*x+y)^2="+espressione6);
	}
	
	public static void cartaOro1(){
		Scanner tastiera = new Scanner(System.in);
		int nValue = 0;
		int ao = 2;
		int an = 0;
		Boolean check = true;
		
		System.out.println("Inserire un intero maggiore di 0");
		
		do{
			try{
				nValue = tastiera.nextInt();
				if(nValue > 0)
					check = false;
				else
					tastiera.next();
			}catch(Exception e){
				tastiera.next();
			}
		}while(check);
		
		for(int i = 0; i <= nValue; i++){
			System.out.println("a" + i + " = " + ao);
			ao = 3*ao-2;
		}
	}
	
	public static void cartaOro2(){
		Scanner tastiera = new Scanner(System.in);
		double epsilon = 0;
		Boolean check = true;
		Boolean intorno = true;
		double n = 0;
		
		System.out.println("Inserire un epsilon maggiore di 0");
		
		do{
			try{
				epsilon = tastiera.nextDouble();
				if(epsilon > 0)
					check = false;
				else
					tastiera.next();
			}catch(Exception e){
				tastiera.next();
			}
		}while(check);
		
		/*while((n/(n+1))){
			if(){

			}
			System.out.println("Prova n = " + n);
			n++;
		}*/
		do{
			System.out.println("Prova n = " + n);
			if(checkCondition(n, epsilon))
				n++;
			else
				intorno = false;
			
		}while(intorno);
	}
	
	public static Boolean checkCondition(double n, double epsilon){
		double espressione = n/(n+1);
		
		if(espressione > (1-epsilon) && espressione <= 1)
			return false;
		return true;
	}
	
	public static void main(String[] args){
		
		
		cartaOro2();
		
	}
}