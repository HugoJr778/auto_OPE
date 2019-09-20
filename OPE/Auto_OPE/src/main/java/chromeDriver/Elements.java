package chromeDriver;

import org.openqa.selenium.By;

public class Elements {
	
	public By inputUser() {return By.xpath("//input[@id='id_username']");}
	public By inputPassword() {return By.xpath("//input[@id='id_password']");}
	public By btnLogin() {return By.xpath("//button[@class='btn btn-primary btn-block']");}
	
	public By verifyHomePage() {return By.xpath("//h2[contains(text(),'inicial:')]");}
	public By goRegister() {return By.xpath("//a[@class='nav-link js-scroll-trigger active']");}

	public By inputName() {return By.xpath("//form[@class='form_cliente']//input[@placeholder='Digite seu Nome']");}
	public By inputCPF() {return By.xpath("//input[@id='inputCpf']");}
	public By inputCity() {return By.xpath("//input[@id='inputCity2']");}
	public By inputState() {return By.xpath("//select[@id='inputEstado2']");}
	public By inputCEP() {return By.xpath("//input[@id='inputCEP']");}
	public By checkBoxCar() {return By.xpath("//body[@id='page-top']/div/div[@id='html']/section[@id='CadCli']/div[@class='w-100']/form[@class='form_cliente']/div[@id='app']/input[1]");}
	public By inputModelCar() {return By.xpath("//input[@id='ModCarro']");}
	public By inputBoard() {return By.xpath("//input[@id='PlacaCarro']");}
	public By inputColor() {return By.xpath("//input[@id='CorCarro']");}
	public By btnRegister() {return By.xpath("//button[@id='cadastra_cliente']");} 
	
	public By goReport() {return By.xpath("//a[@class='nav-link js-scroll-trigger active']");}
}