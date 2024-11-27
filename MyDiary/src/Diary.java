public class Diary {
    private boolean isUnlocked = true;
    private boolean isEmpty = true;
    private int numberOfEntries = 0;

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public void lock() {
        isUnlocked = false;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int size() {
        return numberOfEntries;
    }

    public void add() {
        if (isUnlocked()) numberOfEntries++;
    }
}
