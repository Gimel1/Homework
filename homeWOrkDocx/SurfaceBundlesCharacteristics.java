package homeWOrkDocx;

public class SurfaceBundlesCharacteristics {

	public static void main(String[] args) {
		SurfaceBundles SurfaceGo2;
		SurfaceBundles SurfacePro7Plus;
		SurfaceBundles SurfaceBook;
		
		SurfaceGo2 = new SurfaceBundles();
		SurfacePro7Plus = new SurfaceBundles();
		SurfaceBook = new SurfaceBundles();
		
		SurfaceGo2.dDisplay=7.2;
		SurfaceGo2.fPrice=200.99f;
		SurfaceGo2.iDiskSpace=256;
		SurfaceGo2.iRam=6;
		
		SurfacePro7Plus.dDisplay=12.7;
		SurfacePro7Plus.fPrice=555.99f;
		SurfacePro7Plus.iDiskSpace=512;
		SurfacePro7Plus.iRam=16;
		
		SurfaceBook.dDisplay=10.2;
		SurfaceBook.fPrice=329.99f;
		SurfaceBook.iDiskSpace=128;
		SurfaceBook.iRam=4;
		
		SurfaceGo2.DisplayCharacteristics();
		System.out.println("=======================");
		SurfacePro7Plus.DisplayCharacteristics();
		System.out.println("=======================");
		SurfaceBook.DisplayCharacteristics();
		System.out.println("=======================");
		
		
		

	}

}
