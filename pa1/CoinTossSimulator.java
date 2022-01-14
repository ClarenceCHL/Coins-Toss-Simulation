// Name: Haolun Cheng
// USC NetID: haolunch
// CS 455 PA1
// Fall 2021

import java.util.Random;

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to
 * access the cumulative results.
 * 
 * NOTE: we have provided the public interface for this class. Do not change the
 * public interface. You can add private instance variables, constants, and
 * private methods to the class. You will also be completing the implementation
 * of the methods given.
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {
   private int numTrails, twoHeads, twoTails, headTails;
   private Random random;

   /**
    * Creates a coin toss simulator with no trials done yet.
    */
   public CoinTossSimulator() {
      this.numTrails = 0;
      this.twoHeads = 0;
      this.twoTails = 0;
      this.headTails = 0;
      this.random = new Random();
   }

   /**
    * Runs the simulation for numTrials more trials. Multiple calls to this method
    * without a reset() between them *add* these trials to the current simulation.
    * 
    * @param numTrials number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
      this.numTrails += numTrials;
      for (int i = 0; i < numTrials; i++) {
         int coin1Toss = random.nextInt(2);
         int coin2Toss = random.nextInt(2);
         if(coin1Toss == 0 && coin2Toss == 0){
            this.twoHeads++;
         } else if(coin1Toss == 1 && coin2Toss == 1){
            this.twoTails++;
         }else{
            this.headTails++;
         }
      }
   }

   /**
    * Get number of trials performed since last reset.
    */
   public int getNumTrials() {
      return this.numTrails;
   }

   /**
    * Get number of trials that came up two heads since last reset.
    */
   public int getTwoHeads() {
      return this.twoHeads;
   }

   /**
    * Get number of trials that came up two tails since last reset.
    */
   public int getTwoTails() {
      return this.twoTails;
   }

   /**
    * Get number of trials that came up one head and one tail since last reset.
    */
   public int getHeadTails() {
      return this.headTails;
   }

   /**
    * Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      this.numTrails = 0;
      this.twoHeads = 0;
      this.twoTails = 0;
      this.headTails = 0;
   }

}
