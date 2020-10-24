package prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Promart {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navega a la página
		driver.get("https://www.ebay.com/");
		
		//maximiza pantalla de navegador
		driver.manage().window().maximize();
		
		//busca zapatos
		driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("zapatos");
		
		//click al botón buscar
		driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
		
		//seleccionar talla 10
		driver.findElement(By.xpath("//input[@aria-label='10']")).click();
		
		//seleccionar marca PUMA
		driver.findElement(By.xpath("//input[@aria-label='PUMA']")).click();
		
		//imprime los resultados de la búsqueda en consola
		WebElement Resultado = driver.findElement(By.className("srp-controls__count-heading")); 
		System.out.println(Resultado.getText()+"\n"); 
		
		//Expande lista plegable
		driver.findElement(By.xpath("(//span[@class='expand-btn__cell'])[4]")).click();
		
		//Selecciona precio menor a mayor
		driver.findElement(By.xpath("//a[@_sp='p2351460.m4116.l5869.c4']")).click();
		
		//Ubicar lista de 5 productos
		List<WebElement> prodasc = driver.findElements(By.xpath("//li[@data-view='mi:1686|iid:1']"));
		prodasc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:2']")));
		prodasc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:3']")));
		prodasc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:4']")));
		prodasc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:5']")));
		
		//Cantidad de productos del arreglo
		System.out.println("Número de productos: " + prodasc.size()+"\n");
		
	    //Recorre todos los productos e imprime 
	    for (int i=0; i<prodasc.size(); i++){
	        System.out.println(prodasc.get(i).getText()+"\n");
	      }
	    System.out.println("Final Precio Ascendente"+"\n");
	    
	    
	    
	    
	    //Expande lista plegable
	  	driver.findElement(By.xpath("(//span[@class='expand-btn__cell'])[4]")).click();
	    
	    //Selecciona duración primero en finalizar
	  	driver.findElement(By.xpath("//a[@_sp='p2351460.m4116.l5869.c2']")).click();
	  		
	  	//Ubicar lista de 5 productos
	  	List<WebElement> duracionpri = driver.findElements(By.xpath("//li[@data-view='mi:1686|iid:1']"));
	  	duracionpri.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:2']")));
	  	duracionpri.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:3']")));
	  	duracionpri.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:4']")));
	  	duracionpri.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:5']")));
	  		
	  	//Cantidad de productos del arreglo
	  	System.out.println("Número de productos: " + duracionpri.size()+"\n");
	  		
	  	//Recorre todos los productos e imprime 
	  	for (int i=0; i<duracionpri.size(); i++){
	  	      System.out.println(duracionpri.get(i).getText()+"\n");
	  	    }
	  	System.out.println("Final Duración Primero en finalizar"+"\n"); 
	    
	  	
	  	
	  	
	  	
	    //Expande lista plegable
	  	driver.findElement(By.xpath("(//span[@class='expand-btn__cell'])[4]")).click();
	    
	    //Selecciona duración precio mayor a menor
	  	driver.findElement(By.xpath("//a[@_sp='p2351460.m4116.l5869.c5']")).click();
	  		
	  	//Ubicar lista de 5 productos
	  	List<WebElement> proddesc = driver.findElements(By.xpath("//li[@data-view='mi:1686|iid:1']"));
	  	proddesc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:2']")));
	  	proddesc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:3']")));
	  	proddesc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:4']")));
	  	proddesc.add(driver.findElement(By.xpath("//li[@data-view='mi:1686|iid:5']")));
	  		
	  	//Cantidad de productos del arreglo
	  	System.out.println("Número de productos: " + proddesc.size()+"\n");
	  		
	  	//Recorre todos los productos e imprime 
	  	for (int i=0; i<proddesc.size(); i++){
	  	      System.out.println(proddesc.get(i).getText()+"\n");
	  	    }
	  	System.out.println("Final Precio Descendente"+"\n"); 
	    	    
	    
	  
	
	}

}
