package romenska.patterns.behavioral.template;

import org.junit.jupiter.api.Test;

public class TemplateTest {
	
	@Test
	public void testWebsite(){
		WebNews newsPage = new  WebNews();
		WebContacts contactsPage = new WebContacts();
		
		newsPage.showPage();
		System.out.println("---------------");
		contactsPage.showPage();
	}
}
