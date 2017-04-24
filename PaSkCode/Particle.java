package PaSkCode;

import java.awt.Graphics;
import java.awt.Color;

class Particle{
	int rad;	//radius of the particle
	int npx;	// xposition
	int npy;	//y position
	int nvx;	//velocity along x axis
	int nvy;	//velocity along y axis

	Particle(){
		rad = 0;
		npx = 0;
		npy = 0;
		nvx = 0;
		nvy = 0;
	}
	
	Particle(int rad, int x, int y, int vx, int vy){
		this.rad = rad;
		this.npx = x;
		this.npy = y;
		this.nvx = vx;
		this.nvy = vy;
	}
	
	public void update(int bw, int nh){
		npx+=nvx;
		npy+=nvy;
		
		if(npx <= 0){
			npx = 0;
			nvx *= -1;
		}
		else if(npx+rad >= bw){
			npx = bw-rad;
			nvx *= -1;
		}
		
		if(npy <= 0){
			npy = 0;
			nvy *= -1;
		}
		else if(npy+rad >= nh){
			npy = nh-rad;
			nvy *= -1;
		}		
	}
	
	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(npx, npy, rad, rad);
    }
	
	void dump(){
		System.out.printf("%d %d %d %d %d\n", rad, npx, npy, nvx, nvy);
	}

}