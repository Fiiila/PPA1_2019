/**
	*program pro vypocet delky hran a povrchu kvadru
	*@autor:Filip Jasek
	*@datum:09.10.2019
*/
public class Ppa1u01a {
	/** hlavni cast programu, definovani promennych a samotne vypocty */
	public static void main(String[] args){
		int a = 4;
		int b = 3;
		int c = 2;

		int hrana = 4 * ( a + b + c);		//vypocet delky souctu vsech hran
		int povrch = 2 * ((a*b)+(b*c)+(a*c));	//vypocet povrchu kvadru

		System.out.format("a = %d\nb = %d\nc = %d\n------\ns = %d\nd = %d\n",a,b,c,povrch,hrana);
		//System.out.println()

	} 
}
