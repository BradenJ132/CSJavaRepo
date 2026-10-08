import javax.swing.*;
public class fluidsimulation
{



	public static void main(String[] args)
	{
		JFrame window = new JFrame("Fluid sim");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setLocationRelativeTo(null);
	
		
		window.setVisible(true);
	
		
		boolean running = true;
		double PHdeltatime = 0;
		double fGravity = -9.81;
		double x_Particle_Velocity = 0;
		double y_Particle_Velocity = 0;
		double y_particlePosition;
		double x_particlePosition = 0;
		double damping = 0.5;
		
		double floorPosition = -5;
	double wallRPos = 10;
	double wallLPos = -10;
	double roofPos = 5;
	
		while (running = true)
		{
		//this needs to be updated every second.
		y_particlePosition = y_Particle_Velocity + fGravity * PHdeltatime; 
		
		// all of this code is somewhat pseduo code right now, floor pos must be defined in the jframe but idk how to do it
		// so does the the actual variables affected the ball 
	
		//checks for floor collision plus damping when flipping velocity
		if (y_particlePosition < floorPosition)
		{
			y_particlePosition = floorPosition;
			y_Particle_Velocity = y_Particle_Velocity * -damping;
		}
		//same but for roof
		if (y_particlePosition > roofPos)
		{
			y_particlePosition = roofPos;
			y_Particle_Velocity = y_Particle_Velocity * -damping;
		}
		//left wall collision
		if (x_particlePosition < wallLPos)
		{
			x_particlePosition = wallLPos;
			x_Particle_Velocity = x_Particle_Velocity * -damping;
		}
		//right wall collision
		if (x_particlePosition > wallRPos)
		{
			x_particlePosition = wallRPos;
			x_Particle_Velocity = x_Particle_Velocity * -damping;
		}

		}
		
	}

}
