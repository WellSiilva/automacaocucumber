package Metodos;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Metodos {
	// Trazer o driver
	public static WebDriver driver;

	public void screnShoot(String print) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File Desfile = new File(print);
		FileUtils.copyFile(srcFile, Desfile);

	}

	public void pausa(int tempo, String descricaoPasso) throws InterruptedException {
		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaoPasso);
		}

	}

	public void preencher(By elemento, String texto, String descricaoPasso) throws IOException {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaoPasso);
			screnShoot(descricaoPasso);
		}
	}

	public void click(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaoPasso);
			screnShoot(descricaoPasso);
		}
	}

	public void fecharNavegador(String descricaoPasso) throws IOException {
		try {
			driver.quit();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "Erro no passo" + descricaoPasso);
			screnShoot(descricaoPasso);
		}
	}

	public void executarNavegador(String url, String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
}
