import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		WikipediaPage[] pages = new WikipediaPage[3];
        pages[0] = new WikipediaPage("Prototype Pattern", "Tutorial Prototype Pattern");
        pages[1] = new WikipediaPage("Builder Pattern  ", "Tutorial Builder Pattern");
        pages[2] = new WikipediaPage("Singleton Pattern", "Tutorial Singleton Pattern");
        int counter = 1;
        for (WikipediaPage i : pages) {
            System.out.print(counter + ". ");
            counter++;
            i.Info();
        }
        System.out.println("�������� ������ ��� ���������:");
        Scanner choice = new Scanner(System.in);
        int i = choice.nextInt() - 1;
        WikipediaPage editPage = (WikipediaPage) pages[i].clonePrototype();
        System.out.println("�������� ������:");
        editPage.Info();
        System.out.println("�������������� ���������:");
        Scanner editTitle = new Scanner(System.in);
        editPage.title = editTitle.nextLine();
        System.out.println("�������������� ������ ������:");
        Scanner editText = new Scanner(System.in);
        editPage.text = editText.nextLine();
        System.out.println("���������� �������� ������:");
        editPage.Info();
        System.out.println("������������ ������:");
        pages[i].Info();

	}

}
