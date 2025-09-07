public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;   // Number of ages to generate
        final int MAXAGE = 35;           // Maximum age


        int[][] ageTable = {
                {16, 20}, {34, 21}, {52, 22}, {68, 23}, {82, 24},
                {89, 25}, {94, 26}, {96, 28}, {98, 30}, {100, MAXAGE}
        };


        int[] ageCount = new int[MAXAGE + 1];


        for (int i = 0; i < REITERATIONS; i++) {
            int x = (int)(Math.random() * 100) + 1;  // Random number 1–100
            int j = 0;
            while (x > ageTable[j][0]) j++;          // Find matching age
            ageCount[ageTable[j][1]]++;             // Increment count for that age
        }


        System.out.println("Age\tCount\t%-Share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (ageCount[age] != 0) {
                double share = ((double) ageCount[age] / REITERATIONS) * 100;
                System.out.printf("%d\t%d\t%.2f%%\n", age, ageCount[age], share);
            }
        }
    }
}

