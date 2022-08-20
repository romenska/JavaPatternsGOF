package romenska.patterns.behavioral.template;

public class WebNews extends WebsiteTemplate {
	@Override
	protected void content() {
		System.out.println("news");
	}
}
