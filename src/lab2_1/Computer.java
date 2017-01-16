package lab2_1;

public class Computer {
	
	String manufacturer;
	int serialNumber;
	float price;
	int quantityCPU;
	int frequencyCPU;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantityCPU() {
		return quantityCPU;
	}
	public void setQuantityCPU(int quantityCPU) {
		this.quantityCPU = quantityCPU;
	}
	public int getFrequencyCPU() {
		return frequencyCPU;
	}
	public void setFrequencyCPU(int frequencyCPU) {
		this.frequencyCPU = frequencyCPU;
	}
	
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", serialNumber=" + serialNumber + ", price=" + String.format("%.2f",price)
				+ ", quantityCPU=" + quantityCPU + ", frequencyCPU=" + frequencyCPU + "]";
	}
	//2.1.5
	static void view(Computer[] computers){
		for (Computer computer : computers)
		System.out.println(computer.toString());}
	
	public static void main(String[] args){
		Computer [] computers = new Computer[5];//создание пяти пк, присвоение значений переменным пк
			for (int i= 0; i< computers.length; i++){ 
				Computer computer = new Computer();
				computer.setPrice(Math.round(1000*Math.random()));
				computer.setFrequencyCPU((int)Math.round(1000*Math.random()));
				computer.setManufacturer("IBM");
				computer.setQuantityCPU((int)Math.round(10*Math.random()));
				computer.setSerialNumber((int)Math.round(1000*Math.random()));
				computers[i] = computer;
			}
		
			//2.1.4
			System.out.println("Increases price by 10");
			for (int i = 0; i<computers.length; i++){
				float price = computers[i].getPrice();
				computers[i].setPrice(price+(price/10));
			}
			Computer.view(computers);
			
			
	}	
}
