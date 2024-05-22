import com.org.example.InterfaceConflict1;
import com.org.example.InterfaceConflict2;

public class Conflict implements InterfaceConflict1, InterfaceConflict2 {
    @Override
    public void run() {
        InterfaceConflict2.super.run();
    }
}
