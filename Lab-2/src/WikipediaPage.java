
public class WikipediaPage implements Prototype {
	 	String title;
	    String text;

	    void Info() {
	        System.out.printf("Заголовок: %s \tТекст статьи: %s\n", title, text);
	    }

	    WikipediaPage(String title, String text) {
	        this.title = title;
	        this.text = text;
	    }

	    @Override
	    public Prototype clonePrototype() {
	        WikipediaPage copy = new WikipediaPage(title, text);
	        return copy;
	    }
}
