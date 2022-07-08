package master;

public class Elektronik extends Product{

	public int vol;

	public Elektronik(){
		
	}
	
	public void displayJenisProduct() {
		System.out.println("Nama " + this.jenisProduct);
	}
	
	public void displayMerk() {
		System.out.println("merk " + this.merk);
	}
	
	public void displayVoltase() {
		System.out.println("voltase " + this.vol);
	}
	

}
