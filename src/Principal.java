
import com.observer.editor.Editor;
import com.observer.listener.EmailNotificationListener;
import com.observer.listener.LogOpenListener;

public class Principal {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("abrir", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("salvar", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
