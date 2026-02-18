package ExecptionHandlingExample;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class Main {
    public void play() throws Exception{

            Sequencer seq = MidiSystem.getSequencer();


    }

    public static void main(String[] args) throws Exception {
        Main obj = new Main();
        obj.play();
    }
}
