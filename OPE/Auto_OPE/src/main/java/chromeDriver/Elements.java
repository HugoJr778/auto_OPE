package chromeDriver;

import org.openqa.selenium.By;

public class Elements {
	
	public String scriptScroll() {return "window.scrollBy";}
	
	//Elementos Genéricos
	public By inputUser() {return By.xpath("//input[@id='id_username']");}
	public By inputPassword() {return By.xpath("//input[@id='id_password']");}
	public By btnLogin() {return By.xpath("//button[@class='btn btn-primary btn-block']");}
	public By verifyHomePage() {return By.xpath("//h2[contains(text(),'Inicial')]");}
	
	//Elementos OPE001 
	public By goRegister() {return By.xpath("//a[@class='nav-link js-scroll-trigger active']");}
	public By inputName() {return By.xpath("//form[@class='form_cliente']//input[@placeholder='Nome Completo']");}
	public By inputCEP() {return By.xpath("//form[@class='form_cliente']//input[@id='inputCEP']");}
	public By inputCPF() {return By.xpath("//form[@class='form_cliente']//input[@id='inputCpf']");}
	public By inputTel() {return By.xpath("//form[@class='form_cliente']//input[@id='telefone']");}
	public By checkBoxCar() {return By.xpath("//body[@id='page-top']/div/div[@id='html']/section[@id='CadCli']/div[@class='w-100']/form[@class='form_cliente']/div[@id='app']/input[1]");}
	public By inputModelCar() {return By.xpath("//input[@id='ModCarro']");}
	public By inputBoard() {return By.xpath("//input[@id='PlacaCarro']");}
	public By inputColor() {return By.xpath("//input[@id='CorCarro']");}
	public By btnRegister() {return By.xpath("//button[@id='cadastra_cliente']");} 
	public By goReport() {return By.xpath("//a[contains(text(),'Relatório')]");}
	public By searchReport() {return By.xpath("//div[@id='tabela_relatorio_filter']//input");}
	public By fieldReport() {return By.xpath("//section[@id='Relatorio']//tr[1]//td[1]");}
	
	//Elementos OPE002
	public By goRegisterFunc() {return By.xpath("//a[contains(text(),'Cadastro Funcionário')]");}
	public By inputFuncUser() {return By.xpath("//form[@id='cadastra_funcionarioform']//input[@placeholder='Nome do Usuário']");}
	public By inputFuncPassword() {return By.xpath("//form[@id='cadastra_funcionarioform']//input[@id='password']");}
	public By boxIsSelect() {return By.xpath("//input[@id='defaultCheck1']");}
	public By btnRegisterFunc() {return By.xpath("//button[@id='cadastra_func']");}
	public By btnLogout() {return By.xpath("//a[contains(text(),'Logout')]");}
}