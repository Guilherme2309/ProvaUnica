package elementos;

import org.openqa.selenium.By;

public class ElementosLogin {

	private By btnEntrar = By.xpath("//*[@id=\"root-app\"]/div/div[1]/div/div[2]/div[2]/a[2]");

	private By btnContinuar = By.xpath("//*[@id=\"login_user_form\"]/div[2]/button");
	
	private By cpEmail = By.name("user_id");

	private By cpSenha = By.name("password");

	private By btnLogar = By.name("action");

	public By getBtnEntrar() {
		return btnEntrar;
	}

	public By getCpEmail() {
		return cpEmail;
	}

	public By getCpSenha() {
		return cpSenha;
	}

	public By getBtnLogar() {
		return btnLogar;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

}
