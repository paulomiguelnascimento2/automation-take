package br.com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsLoginComSucesso {

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

	@Dado("^que esteja na tela de Login \"([^\"]*)\"$")
	public void que_esteja_na_pagina(String url) {

		WebDriver driver = null;
		driver.get("");

	}

	@Quando("^informar os campos email e senha$")
	public void alterar_o_ComboBox() {

	}

	@E("^clicar no botão \"Entrar\"$")
	public void preencher_os_campos() {

	}

	@Entao("^valido a mensagem de sucesso	")
	public void valido_a_mensagem_de_sucesso() {

	}

}
