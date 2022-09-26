package br.com.steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsCadastroComSucesso {

	@Before

	public void before() {
		System.setProperty("webdriver.chomer.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@After

	public void finalizar() {
		WebDriver driver = null;
		driver.quit();
	}

	@Dado("^que esteja na tela de cadastro gratis \"([^\"]*)\"$")
	public void que_esteja_na_pagina(String url) {

		WebDriver driver = null;
		driver.get("");

	}

	@Quando("^informar os campos obrigatorios$")
	public void alterar_o_ComboBox() {

	}

	@E("^clicar na opção \"Eu aceito os termos de serviço, Politica de privacidade e Cookies\"$")
	public void clicar_em_Add_Customer() {

	}

	@E("^acionar o clique no botão \"cadastre grátis\"$")
	public void preencher_os_campos() {

	}

	@Entao("^valido a mensagem de cadastro com sucesso	")
	public void valido_a_mensagem_de_sucesso() {

	}

}
