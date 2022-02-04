import domain.AverageScoreComparator;
import domain.ScoreResults;

import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        new Main().init();
    }

    public void init() {
        var list1 = List.of(6, 3, 7, 7, 2, 6, 8, 4, 8);
        var list2 = List.of(8, 9, 10, 4, 8, 7, 8, 9, 8);
        var list3 = List.of(1, 4, 6, 2, 3, 4, 1, 2, 5);
        var list4 = List.of(6, 5, 7, 8, 4, 7, 6, 8, 10);
        var list5 = List.of(4, 7, 4, 6, 6, 8, 7, 8, 10);

        var average1 = new ScoreResults("James", list1);
        var average2 = new ScoreResults("Anna", list2);
        var average3 = new ScoreResults("Roger", list3);
        var average4 = new ScoreResults("Luna", list4);
        var average5 = new ScoreResults("Lizzy", list5);

        var averages = List.of(average1, average2, average3, average4, average5);
        averages.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        PriorityQueue<ScoreResults> scoreQ = new PriorityQueue<>(new AverageScoreComparator());
        scoreQ.addAll(averages);
        while(!scoreQ.isEmpty()) {
            System.out.println(scoreQ.poll());
        }
        System.out.println("----------------------------------------------------");
        AverageScoreComparator.ascendingOrder = false;
        scoreQ.addAll(averages);
        while(!scoreQ.isEmpty()) {
            System.out.println(scoreQ.poll().toStringCustomDecimals(4));
        }
    }
}
