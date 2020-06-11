import java.util.Random;

public class StopWatchMain {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }
        StopWatch.start();
        SelectionSort.sort(array);
        StopWatch.end();

        System.out.println("Time start: " + StopWatch.getStartTime());
        System.out.println("Time finish: " + StopWatch.getEndTime());
        System.out.println("Elapsed Time: " + StopWatch.getElapsedTime());
    }
}

