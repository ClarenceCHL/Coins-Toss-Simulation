// Name: Haolun Cheng
// USC NetID: haolunch
// CS 455 PA1
// Fall 2021

import javax.swing.JFrame;
import java.util.Scanner;

/**
 * class CoinSimViewer
 * 
 * This class serves as a launcher of the whole project as it contains a main
 * method to run everything.
 */
public class CoinSimViewer {
    private static final int WINDOWWIDTH = 800;
    private static final int WINDOWHEIGHT = 500;

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numberOfTrails;
        Scanner in = new Scanner(System.in);

        // Error checking for the number of trials input
        while (true) {
            System.out.print("Enter number of trails: ");
            numberOfTrails = in.nextInt();
            if (numberOfTrails > 0)
                break;
            System.out.println("ERROR: Number entered must be greater than 0.");
        }
        in.close();

        JFrame frame = new JFrame();

        frame.setSize(WINDOWWIDTH, WINDOWHEIGHT); // Frame size is 500 tall and 800 wide
        frame.setTitle("CoinSim"); // Set frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Run the coin toss simulation
        CoinTossSimulator simulator = new CoinTossSimulator();
        simulator.run(numberOfTrails);

        int twoHeads = simulator.getTwoHeads();
        int twoTails = simulator.getTwoTails();
        int headTails = simulator.getHeadTails();

        // Display the simulation result on the window
        CoinSimComponent component = new CoinSimComponent(numberOfTrails, twoHeads, twoTails, headTails);
        frame.add(component);
        frame.setVisible(true);
    }
}
