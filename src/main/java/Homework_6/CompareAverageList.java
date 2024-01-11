package Homework_6;

import java.util.List;

public class CompareAverageList {

        public double getAverage(List<Integer> list)  {
                if (list.isEmpty()) {
                        throw new RuntimeException("Список пуст");
                }
                double sum = 0;
                for (Integer integer : list) {
                        sum += integer;
                }
                return sum / list.size();
        }

        public String compareAverage(List<Integer> list1, List<Integer> list2) {
                double mean1 = getAverage(list1);
                double mean2 = getAverage(list2);
                if (mean1 > mean2) {
                        return "Первый список имеет большее среднее значение";
                } else if (mean1 < mean2) {
                        return "Второй список имеет большее среднее значение";
                } else {
                        return "Средние значения равны";
                }
        }
}





