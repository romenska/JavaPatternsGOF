package romenska.patterns.behavioral.template;

public abstract class WebsiteTemplate {
	private void footer() {
		System.out.println("footer");
	}
	private void header() {
		System.out.println("header");
	}
	public void showPage() {
		footer();
		content();
		header();
	}
	protected abstract void content() ;
}
