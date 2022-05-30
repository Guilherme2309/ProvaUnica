package elementos;

import org.openqa.selenium.By;

public class ElementosPesquisaProduto {

	
	private By cpPesquisa = By.name("as_word");
	
	private By btnLupa = By.xpath("/html/body/header/div/form/button");

	public By getCpPesquisa() {
		return cpPesquisa;
	}

	public By getBtnLupa() {
		return btnLupa;
	}
	
	
}
