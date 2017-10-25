import com.brewengine.gv4j.GV;
import com.brewengine.gv4j.Phone;
import com.brewengine.gv4j.Settings;
import javafx.application.Application;
import javafx.stage.Stage;

public class SweepTake extends Application{
    public void start(Stage primaryStage) throws Exception {
        System.out.println("App starting...");

        GV gv = new GV();
        gv.login("MyEmail@gmail.com", "MyPassword");

        Settings settings = gv.fetchSettings();
        for (Phone phone : settings.getPhones()) {
            System.out.println(phone);
        }

    }
}
