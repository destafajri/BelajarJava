package app;

import master.*;

public class App {
	public static void main(String[] args) {
		Product elektronik = new Product();
		Elektronik charger= new Elektronik();
		
		elektronik.jenisProduct="Charger";
		elektronik.merk="Xiaomi";
		elektronik.displayProduct();
		
		charger.vol= 200;
		charger.displayVoltase();
		
	}

}
