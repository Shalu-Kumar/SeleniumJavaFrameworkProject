package htmlunitdriver;

public class HtmlUnitDriverTest {

	
	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver(BROWSER); // here you need to press BROWSER CTRL+Press Space Key and choose BrowserVersion - com.gargoylesoftware.htmlUnit) nd then pression . next to n of version word inside the bracket and then it will list out all the versions and choose any browser)
		driver.get("https://selenium.dev/");
		
		System.out.println("Tilte is:"+driver.getTitle());
		WebClient webClient = (WebClient) get(driver, "webClient");
		
		
		System.out.println("Browsr ver is:"+webClient.getBrwowserVersion());
		System.out.println("Is browser Edge:"+webClient.getBrwowserVersion.Edge());
		System.out.println("Is browser Firefox:"+webClient.getBrwowserVersion.fireFox());
		
	
		driver.quit();
		
	}
	private static Object get(Object object, String field) throws 
	Exception {
	Field f = object.getClass().getDeclaredField(field); 
	f.setAccessible(true);
	 return f.get(object); } 



	
}
