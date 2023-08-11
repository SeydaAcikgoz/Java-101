package maas_hesaplayici;

public class employee {
	String name;
	int salary;
	int workHours ;
	int hireYear;
	
	
	public employee(String name,int salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public int tax(){
		if(this.salary>1000) {
			System.out.println("Maasin %3 u kadar vergi uygulanıyor.");
			return (this.salary*3/100);
		}else {
			System.out.println("Vergi uygulanmıyor.");
			return 0;
		}
		
	}
	
	public int bonus() {
		if(this.workHours >40) {
			this.salary+=(workHours-40)*30;
			return (workHours-40)*30;
		}
		return 0;
	}
	public int raiseSalary() {
		int nowYear=2021;
		if(nowYear-this.hireYear<10) {
			this.salary+=this.salary*5/100;
			return this.salary*5/100; 
		}else if(nowYear-this.hireYear >9 && nowYear-this.hireYear<20) {
			this.salary+=this.salary*10/100;
			return this.salary*10/100;
		}else if(nowYear-this.hireYear >19) {
			this.salary+=this.salary*15/100;
			return this.salary*15/100;
		}
		return 0;
	}
	public void tostring() {
		System.out.println("Adi:"+this.name+"\r"+"Maasi:"+this.salary+"\r"+
		"Calisma Saati:"+this.workHours+"\r"+"Baslangic Yili:"+this.hireYear+"\r"+
		"Vergi:"+this.tax()+"\r"+"Bonus:"+this.bonus()+"\r"+"Maas artisi:"+this.raiseSalary()+"\r"+
		"Maasi:"+this.salary);
	}
}
