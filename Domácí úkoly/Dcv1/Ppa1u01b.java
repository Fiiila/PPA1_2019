/**
	*program pro vypocitani parametru displeje
	*@autor: Filip Jasek
	*@datum: 09.10.2019
*/

//19.5cm x 34.5cm - velikost obrazovky
//1366 x 768 - rozliseni
//2.54 cm - palec
//url: https://support.hp.com/cz-cs/product/hp-probook-450-g1-notebook-pc/5405421/document/c03963187#AbT2

public class Ppa1u01b {
	/** zadani promennych a vypocty jednotlivych parametru displeje ze zadanych hodnot */
	public static void main(String[] args) {
		int height = 195;		//vyska obrazovky [mm]
		int width = 345;		//sirka obrazovky [mm]
		int heightRes = 768;		//rozliseni pocet pixelu na vysku
		int widthRes = 1366;		//rozliseni pocet pixelu na sirku
		final double INCH = 25.4;	//konstanta palec [mm]		
		int wObrazku = 200;		//sirka obrazku [pixel]
		int hObrazku = 100;		//vyska obrazku [pixel]
		String url = "https://support.hp.com/cz-cs/product/hp-probook-450-g1-notebook-pc/5405421/document/c03963187#AbT2";

		double hPixelPalec = ((double)heightRes/height) * INCH;	//vypocet pixelu na palec na vysku obrazovky
		double wPixelPalec = ((double)widthRes/width) * INCH;	//vypocet pixelu na palec na sirku obrazovky

		double pPixelPalec = wPixelPalec/hPixelPalec;		//pomer horizontalniho ku vertikalnimu poctu pixelu na palec
		double wRoztecPixelu = (double)width/widthRes;		//roztec dvou horizontalnich pixelu
		double hRoztecPixelu = (double)height/heightRes;	//roztec dvou vertikalnich pixelu
		double sObrazku = wRoztecPixelu*wObrazku;		//realna sirka obrazku na obrazovce v mm
		double vObrazku = hRoztecPixelu*hObrazku;		//realna vyska obrazku na obrazovce v mm
		

		System.out.format("hSize [mm] = %d\nvSize [mm] = %d\nhResolution [pixels] = %d\nvResolution = %d\n----------------\n",width,height,widthRes,heightRes);
		System.out.format("hPPI = %f\nvPPI = %f\nrPPI = %f\npitch [mm] = %f\nwidth [mm]= %f\nheight [mm] = %s\nurl: %S\n",hPixelPalec,wPixelPalec,pPixelPalec,wRoztecPixelu,sObrazku,vObrazku,url);
	}
}