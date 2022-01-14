// Name: Haolun Cheng
// USC NetID: haolunch
// CS 455 PA1
// Fall 2021

/**
 * Class CoinTossSimulatorTester
 * 
 * This class runs a unit test on class CoinTossSimulator. The goal of this test
 * program is to test the full functionality of the CoinTossSimulator class.
 */
public class CoinTossSimulatorTester {
        /**
         * Main method to run the unit test
         * 
         * @param args
         */
        public static void main(String[] args) {

                // Construct a tester
                CoinTossSimulator tester = new CoinTossSimulator();
                // Test constructor
                System.out.println("\nAfter constructor:");
                System.out.println("Number of trails [exp:0]: " + tester.getNumTrials());
                System.out.println("Two-head tosses: " + tester.getTwoHeads());
                System.out.println("Two-tail tosses: " + tester.getTwoTails());
                System.out.println("One-head one-tail tosses: " + tester.getHeadTails());
                System.out.println("Tosses add up correctly? " + (tester.getTwoHeads() + tester.getTwoTails()
                                + tester.getHeadTails() == tester.getNumTrials()));

                tester.run(1);
                // Test run 1
                System.out.println("\nAfter run(1):");
                System.out.println("Number of trails [exp:1]: " + tester.getNumTrials());
                System.out.println("Two-head tosses: " + tester.getTwoHeads());
                System.out.println("Two-tail tosses: " + tester.getTwoTails());
                System.out.println("One-head one-tail tosses: " + tester.getHeadTails());
                System.out.println("Tosses add up correctly? " + (tester.getTwoHeads() + tester.getTwoTails()
                                + tester.getHeadTails() == tester.getNumTrials()));

                tester.run(10);
                // Test run 10
                System.out.println("\nAfter run(10):");
                System.out.println("Number of trails [exp:11]: " + tester.getNumTrials());
                System.out.println("Two-head tosses: " + tester.getTwoHeads());
                System.out.println("Two-tail tosses: " + tester.getTwoTails());
                System.out.println("One-head one-tail tosses: " + tester.getHeadTails());
                System.out.println("Tosses add up correctly? " + (tester.getTwoHeads() + tester.getTwoTails()
                                + tester.getHeadTails() == tester.getNumTrials()));

                tester.run(100);
                // Test run 100
                System.out.println("\nAfter run(100):");
                System.out.println("Number of trails [exp:111]: " + tester.getNumTrials());
                System.out.println("Two-head tosses: " + tester.getTwoHeads());
                System.out.println("Two-tail tosses: " + tester.getTwoTails());
                System.out.println("One-head one-tail tosses: " + tester.getHeadTails());
                System.out.println("Tosses add up correctly? " + (tester.getTwoHeads() + tester.getTwoTails()
                                + tester.getHeadTails() == tester.getNumTrials()));

                System.out.println("\n[ . . . output for tests with different number of trials would be here . . .]");

                tester.reset();
                // Test reset
                System.out.println("\nAfter reset:");
                System.out.println("Number of trails [exp:0]: " + tester.getNumTrials());
                System.out.println("Two-head tosses: " + tester.getTwoHeads());
                System.out.println("Two-tail tosses: " + tester.getTwoTails());
                System.out.println("One-head one-tail tosses: " + tester.getHeadTails());
                System.out.println("Tosses add up correctly? " + (tester.getTwoHeads() + tester.getTwoTails()
                                + tester.getHeadTails() == tester.getNumTrials()));

                tester.run(1000);
                // Test run 1000
                System.out.println("\nAfter run(1000):");
                System.out.println("Number of trails [exp:1000]: " + tester.getNumTrials());
                System.out.println("Two-head tosses: " + tester.getTwoHeads());
                System.out.println("Two-tail tosses: " + tester.getTwoTails());
                System.out.println("One-head one-tail tosses: " + tester.getHeadTails());
                System.out.println("Tosses add up correctly? " + (tester.getTwoHeads() + tester.getTwoTails()
                                + tester.getHeadTails() == tester.getNumTrials()));

                System.out.println("\n[ . . . output for other tests would be here . . .]");
        }
}
