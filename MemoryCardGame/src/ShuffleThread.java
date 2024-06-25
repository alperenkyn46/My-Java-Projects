import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class ShuffleThread extends Thread{
    private Icon [] images;

    public ShuffleThread (Icon [] images){
        this.images=images;
    }

    @Override
    public synchronized void run() {
        Collections.shuffle(List.of(images));
    }
}
