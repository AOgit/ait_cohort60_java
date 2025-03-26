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

    public static void removeDuplicates1(MyList<Rectangle> list, Rectangle rectangle) {
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).equals(rectangle)) {
               list.remove(i);
               i--; // корректирую индекс после удаления
           }
        }
    }


//    public static int removeDuplicates(MyList<Rectangle> myList, Rectangle rectangle) {
//        int result = 0;
//        while (myList.contains((rectangle))){
//            myList.remove(rectangle);
//            result++;
//        }
//    while(myList.remove(rectangle)){
//        result++;
//    }

//        if (result > 0) {
//            myList.add(rectangle);
//            result--;
//        }
//
//        return result;
//    }
}
