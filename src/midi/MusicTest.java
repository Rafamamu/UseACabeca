package midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MusicTest mt = new MusicTest();
        mt.play();
    }

}
