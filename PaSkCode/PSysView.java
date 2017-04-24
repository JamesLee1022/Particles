package PaSkCode;
import java.awt.Graphics;

public class PSysView {
    
    PSysView() {
    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {
		psm.draw(g);
    }

    // dump information on all particles in psm
    void dump(PSysModel psm, int lc) {
		psm.dump();
    }
}
