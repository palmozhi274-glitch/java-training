package Day8;

class StudentAverage {
    public static void main(String[] args) {

        int[][] marks = {
            {80,70,90,85,75},
            {60,65,70,75,80},
            {90,95,85,80,88},
            {70,75,78,82,85},
            {88,84,80,86,90}
        };

        for(int i=0;i<5;i++){
            int sum = 0;

            for(int j=0;j<5;j++){
                sum += marks[i][j];
            }

            System.out.println("Student " + (i+1) +
                               " Average = " + (sum/5.0));
        }
    }
}
