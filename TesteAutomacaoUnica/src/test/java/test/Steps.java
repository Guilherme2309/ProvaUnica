package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.ElementosCompra;
import elementos.ElementosLogin;
import elementos.ElementosPesquisaProduto;
import elementos.ElementosProduto;
import pages.Metodos;

public class Steps {
	Metodos Met = new Metodos();
	ElementosPesquisaProduto pesquisaProduto = new ElementosPesquisaProduto();
	ElementosProduto produto = new ElementosProduto();
	ElementosLogin login = new ElementosLogin();
	ElementosCompra compra = new ElementosCompra();

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
		Met.esperar(2000);
	}

	@Given("^pesquisar o produto$")
	public void pesquisar_o_produto() throws Throwable {
		Met.prencher(pesquisaProduto.getCpPesquisa(), "Iphone 13 pro Max");
	}

	@Given("^clicar no botao de pesquisa$")
	public void clicar_no_botao_de_pesquisa() throws Throwable {
		Met.clicar(pesquisaProduto.getBtnLupa());
	}

	@When("^selecionar o produto$")
	public void selecionar_o_produto() throws Throwable {
		Met.clicar(produto.getProdutoSelecionado());
		Met.esperar(5000);
	}

	@When("^adicionar ao carrinho$")
	public void adicionar_ao_carrinho() throws Throwable {
		Met.clicar(produto.getBtnAddCarrinho());
	}

	@When("^comfirmar o endereco$")
	public void comfirmar_o_endereco() throws Throwable {
		Met.clicar(compra.getBtnComprarDoCarrinho());	
	}
	
	@When("^logue com usuario e senha$")
	public void logue_com_usuario_e_senha() throws Throwable {
	    Met.clicar(login.getBtnEntrar());
		Met.prencher(login.getCpEmail(), "isleey2013@gmail.com");
		Met.esperar(1000);
		Met.clicar(login.getBtnContinuar());
		Met.esperar(1000);
		Met.prencher(login.getCpSenha(), "Fc230978@");
		Met.clicar(login.getBtnLogar());
	}

	@When("^selecionar metodo de pagamento$")
	public void selecionar_metodo_de_pagamento() throws Throwable {
		Met.clicar(compra.getBtnContinuarEndereco());
		Met.clicar(compra.getCheckBoxBoleto());
	}

	@Then("^a compra sera concluida$")
	public void a_compra_sera_concluida() throws Throwable {
		Met.clicar(compra.getComfirmarCompra());
		Met.esperar(3000);
	}

	@Then("^sera enviado um email de com o boleto da compra$")
	public void sera_enviado_um_email_de_com_o_boleto_da_compra() throws Throwable {
		Met.screnShoot("CT-Validação boleto enviado para email com sucesso");
	}

}
