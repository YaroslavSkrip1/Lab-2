
public class WikipediaPage implements Prototype {
	 	String title;
	    String text;

	    void Info() {
	        System.out.printf("���������: %s \t����� ������: %s\n", title, text);
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
