package homeworks.homework_35;

import _lists.MyList;

public class RectangleUtils {

    public static int removeDuplicates(MyList<Rectangle> myList, Rectangle rectangle) {
        int result = 0;
        while (myList.indexOf(rectangle) != myList.lastIndexOf(rectangle)){
            myList.remove(rectangle);
            result++;
        }
        return result;
    }
//    public static int removeDuplicates(MyList<Rectangle> myList, Rectangle rectangle) {
//        int result = 0;
//        while (myList.contains((rectangle))){
//            myList.remove(rectangle);
//            result++;
//        }
//        if (result > 0) {
//            myList.add(rectangle);
//            result--;
//        }
//
//        return result;
//    }
}
