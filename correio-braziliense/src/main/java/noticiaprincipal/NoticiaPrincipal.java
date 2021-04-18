package noticiaprincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NoticiaPrincipal {

	public static void main (String[] args) {
		buscarNoticia();
	}

	private static void buscarNoticia() {
		System.setProperty("webdriver.gecko.driver", System.getenv("GECKODRIVER"));
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.correiobraziliense.com.br/");
		
		WebElement element = driver
				.findElement(By.cssSelector("body > div.cb-main-wrap > div.cb-content.cb-content-home > div.hardnews-duo > div.manch-01 > article > a:nth-child(3)"));		
		String titulo = element.getText();
		String linkNoticia = element.getAttribute("href");
		
		element = driver
				.findElement(By.cssSelector("body > div.cb-main-wrap > div.cb-content.cb-content-home > div.hardnews-duo > div.manch-01 > article > a:nth-child(1) > picture > img"));	
		String srcImg = element.getAttribute("src");
		String titleImg = element.getAttribute("title");
		
		System.out.println("Título: " + titulo);
		System.out.println("Link da notícia: " + linkNoticia);
		System.out.println("Link da imagem: " + srcImg);
		System.out.println("Título da imagem: " + titleImg);

		driver.quit();
	}
}
