package noticiaprincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NoticiaPrincipal {
	
	public static void main (String[] args) {
		buscarNoticia();
	}
	
	public static void buscarNoticia() {
		System.setProperty("webdriver.gecko.driver", System.getenv("GECKODRIVER"));
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cnnbrasil.com.br/");
		
		WebElement elementA = driver.findElement(By.className("jsx-659602535"))
				.findElement(By.tagName("A"));
		
		WebElement elementH2 = driver.findElement(By.className("news-item-header__title-above"));
		WebElement elementImg = driver
				.findElement(By.className("news-item-header__image"));
		
		System.out.println("Título: " + elementH2.getText());
		System.out.println("Link da notícia: " + elementA.getAttribute("href"));
		System.out.println("Link da imagem: " + elementImg.getAttribute("src"));
		System.out.println("Título da imagem: " + elementImg.getAttribute("title"));
		
		driver.quit();
	}
}
