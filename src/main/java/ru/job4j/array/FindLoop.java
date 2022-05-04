package ru.job4j.array;

public class FindLoop {
    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        int[] cutData = new int[finish - start];
        for (int i = 0; i < finish - start; i++) {
            cutData[i] = data[i + start];
        }
        int index = indexOf(cutData, el);
        return index == -1 ? rst : (index + start);
    }

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
               rst = index;
               break;
            }
        }
        return rst;
    }
}
