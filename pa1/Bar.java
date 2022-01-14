// Name: Haolun Cheng
// USC NetID: haolunch
// CS 455 PA1
// Fall 2021

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class A labeled bar that can serve as a single bar in a bar graph. The
 * text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change the
 * public interface. You can add private instance variables, constants, and
 * private methods to the class. You will also be completing the implementation
 * of the methods given.
 * 
 */
public class Bar {
   private int bottom; // location of the bottom of the bar
   private int left; // location of the left side of the bar
   private int width; // width of the bar (in pixels)
   private int applicationHeight; // height of the bar in application units
   private double scale; // how many pixels per application unit
   private Color color; // the color of the bar
   private String label; // the label under the bar
   private static final int BAR_WIDTH = 50;

   /**
    * Creates a labeled bar. You give the height of the bar in application units
    * (e.g., population of a particular state), and then a scale for how tall to
    * display it on the screen (parameter scale).
    * 
    * @param bottom            location of the bottom of the bar
    * @param left              location of the left side of the bar
    * @param width             width of the bar (in pixels)
    * @param applicationHeight height of the bar in application units
    * @param scale             how many pixels per application unit
    * @param color             the color of the bar
    * @param label             the label under the bar
    */
   public Bar(int bottom, int left, int width, int applicationHeight, double scale, Color color, String label) {
      this.bottom = bottom;
      this.left = left;
      this.width = width;
      this.applicationHeight = applicationHeight;
      this.scale = scale;
      this.color = color;
      this.label = label;
   }

   /**
    * Draw the labeled bar.
    * 
    * @param g2 the graphics context
    */
   public void draw(Graphics2D g2) {
      // Set and draw label
      g2.setColor(Color.BLACK);
      Font font = g2.getFont();
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D labelBounds = font.getStringBounds(label, context);
      int widthOfLabel = (int) labelBounds.getWidth();
      int heightOfLabel = (int) labelBounds.getHeight();
      g2.drawString(this.label, left - (widthOfLabel - BAR_WIDTH) / 2, bottom + heightOfLabel);

      // Set and draw bar
      g2.setColor(this.color);
      int height = (int) (this.applicationHeight * scale - heightOfLabel);
      int yCoordinate = this.bottom - height;
      Rectangle bar = new Rectangle(this.left, yCoordinate, this.width, height);
      g2.draw(bar);
      g2.fill(bar);
   }
}
