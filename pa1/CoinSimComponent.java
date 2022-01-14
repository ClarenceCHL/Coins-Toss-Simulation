// Name: Haolun Cheng
// USC NetID: haolunch
// CS 455 PA1
// Fall 2021

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * class CoinSimComponent
 * 
 * This class defines the layout and format of each labeled bar on the display
 * window.
 */
public class CoinSimComponent extends JComponent {
    private int numTrials; // Number of trials
    private int twoHeads; // Number of two-heads outcome
    private int twoTails; // Number of two-tails outcome
    private int headTails; // Number of a head and a tail outcome
    private static final int BAR_WIDTH = 50; // Bar width
    private static final int VERTICAL_BUFFER = 40; // Vertical buffer
    private static final double PERCENTAGE = 100; // Percentage

    /**
     * Class constructor
     * 
     * @param numTrials Number of trials
     * @param twoHeads  Number of two-heads outcome
     * @param twoTails  Number of two-tails outcome
     * @param headTails Number of a head and a tail outcome
     */
    public CoinSimComponent(int numTrials, int twoHeads, int twoTails, int headTails) {
        this.numTrials = numTrials;
        this.twoHeads = twoHeads;
        this.twoTails = twoTails;
        this.headTails = headTails;
    }

    /**
     * This method draws each labeled bar in a formatted way
     * 
     * @param g the graphics context
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Scale
        double scale = (getHeight() - VERTICAL_BUFFER) / (double) PERCENTAGE;

        // Ratio of each scenario
        int twoHeadsRatio = (int) Math.round(twoHeads / (double) numTrials * PERCENTAGE);
        int twoTailsRatio = (int) Math.round(twoTails / (double) numTrials * PERCENTAGE);
        int headTailsRatio = (int) Math.round(headTails / (double) numTrials * PERCENTAGE);

        // Labels
        String twoHeadsLabel = "Two Heads: " + twoHeads + " (" + twoHeadsRatio + "%)";
        String twoTailsLabel = "Two Tails: " + twoTails + " (" + twoTailsRatio + "%)";
        String headTailsLabel = "A Head and a Tail: " + headTails + " (" + headTailsRatio + "%)";

        // Construct three bar objects
        Bar twoTailsBar = new Bar(getHeight() - VERTICAL_BUFFER, getWidth() * 3 / 4 - BAR_WIDTH / 2, BAR_WIDTH,
                twoTailsRatio, scale, Color.blue, twoTailsLabel);
        Bar twoHeadsBar = new Bar(getHeight() - VERTICAL_BUFFER, getWidth() * 1 / 4 - BAR_WIDTH / 2, BAR_WIDTH,
                twoHeadsRatio, scale, Color.red, twoHeadsLabel);
        Bar headTailsBar = new Bar(getHeight() - VERTICAL_BUFFER, getWidth() * 1 / 2 - BAR_WIDTH / 2, BAR_WIDTH,
                headTailsRatio, scale, Color.green, headTailsLabel);

        // Draw all three bars
        twoHeadsBar.draw(g2);
        twoTailsBar.draw(g2);
        headTailsBar.draw(g2);
    }
}