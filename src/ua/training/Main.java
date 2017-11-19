package ua.training;

public class Main {

    public static void main(String[] args) {
        ArrayListCustom<String> myList = new ArrayListCustom<>();
        myList.add("one");
        myList.add("two");
        System.out.println("Current list size: " + myList.size() + "\nList elements:");
        for (String aMyList : myList)
            System.out.println(aMyList);

        System.out.println("Now trying to clear list...");
        try {
            myList.clear();
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Inside catch block, UnsupportedOperationException is thrown! Operation not permitted!s");
        }
    }
}




