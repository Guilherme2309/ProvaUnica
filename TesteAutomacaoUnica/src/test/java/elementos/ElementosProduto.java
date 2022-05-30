package elementos;

import org.openqa.selenium.By;

public class ElementosProduto {

    private By produtoSelecionado = By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[1]/div/div/div[1]/a/div/div/div/div/div/img");
	
	private By btnAddCarrinho = By.xpath("/html/body/main/div[2]/div[3]/div[1]/div[2]/div/div[1]/form/div[5]/div/button[2]/span");
    
	private By modalPopUp = By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]");
	
	public By getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public By getBtnAddCarrinho() {
		return btnAddCarrinho;
	}

	public By getModalPopUp() {
		return modalPopUp;
	}
	 
}
