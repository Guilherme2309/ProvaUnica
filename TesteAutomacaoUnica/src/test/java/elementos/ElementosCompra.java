package elementos;

import org.openqa.selenium.By;

public class ElementosCompra {
	
	private By btnComprarDoCarrinho = By.xpath("//*[@id=\"root-app\"]/div/div/div[1]/div/div[3]/a[2]/span/span");
	
	private By btnContinuarEndereco = By.xpath("//*[@id=\"app-container\"]/div/div/div[5]/div/div/section/form/div[2]/input");
	
	private By checkBoxBoleto = By.xpath("//*[@id=\"app-container\"]/div/section/div/form/article[3]/ul/li/div/label/div[1]/input[1]");
	
	private By comfirmarCompra = By.xpath("//*[@id=\"aside-container\"]/div/div/aside/section/form/button");

	public By getBtnComprarDoCarrinho() {
		return btnComprarDoCarrinho;
	}

	public By getBtnContinuarEndereco() {
		return btnContinuarEndereco;
	}

	public By getCheckBoxBoleto() {
		return checkBoxBoleto;
	}

	public By getComfirmarCompra() {
		return comfirmarCompra;
	}
	
}
