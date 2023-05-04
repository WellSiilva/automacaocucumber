package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String, url) throws Throwable 
		m.executarNavegador(url, "Abrindo Navegador");
	}

	@Given("^selecione o botao abrir nova  conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
		m.click(e.getBtnPopUp(), "Clicar" );
		m.pausa(4000, "Esperar para clicar o botao abrir nova conta");
		m.click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");

	}

	@Given("^selecionar o botao abrir conta para voce$")
	public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
		m.pausa(3000, "Pausa para carregar o botao abrir conta");
		m.click(e.getBtnParaVoce(), "Selecionar botao para voce");

	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
		m.pausa(3000, "Pausa para iniciar o preenchimento de formulario");
		m.preencher(e.getCampoNome(), "FlashCode", "Preenchendo Nome Completo");
		m.preencher(e.getCampoTelefone(), "11111111111", "Preenchendo Celular");
		m.preencher(e.getCampoEmail(), "teste@flash.com.br", "Preenchendo Email");
		m.preencher(e.getCampoCpf(), "21400929962", "Preenchendo CPF");

	}

	@When("^selecionar o botão quero ser cliente$")
	public void selecionar_o_botão_quero_ser_cliente() throws Throwable {
		m.click(e.getBtnQueroSerCliente(), "Selecionar botao Quero ser cliente");

	}

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {

	}

}
