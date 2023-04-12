import java.util.Arrays;
import java.util.Scanner;

public class Letters {

    private  String letters;

    private StringBuilder afterEditing = new StringBuilder();

    public void enterText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть текст: ");
        letters = scanner.nextLine();
    }

    public void textEditing() {
        StringBuilder text = new StringBuilder(letters);
        String[] textEdit = text.toString().split(" ");

        for (int i = 0; i < textEdit.length; i++) {
            textEdit[i] = textEdit[i].replaceAll("[[\\p{Punct}\\p{So}\\p{Sc}0-9]]", "");
        }
        System.out.println("текст до редагування: " + Arrays.toString(textEdit));
    }

    public void textOut(){
        System.out.println("текст після редагування: " + letters);
    }
}