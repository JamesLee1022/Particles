package PaSkCode;

import java.util.ArrayList;
import java.awt.Graphics;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
	ArrayList<Particle> particles;
	
    PSysModel() {
		particles = new ArrayList<Particle>();
	// instantiate list of particles
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {
		particles.add(new Particle(rad, x, y, vx, vy));
    }


    // update state of each particle in list
    void update(int bw, int bh) {
		for(Particle p : particles){
			p.update(bw, bh);
		}
    }
	
	// draw all particles
    void draw(Graphics g) {
		for(Particle p : particles){
			p.draw(g);
		}
    }
	
	// dump all data
    void dump() {
		for(Particle p : particles){
			p.dump();
		}
    }
}
