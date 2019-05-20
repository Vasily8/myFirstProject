package lesson3.lesson13;

public class Table {
    private int height;
    private int leight;
    private int widht;

    public Table() {
    }

    public Table(int height, int leight, int widht) {
        this.height = height;
        this.leight = leight;
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLeight() {
        return leight;
    }

    public void setLeight(int leight) {
        this.leight = leight;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (height != table.height) return false;
        if (leight != table.leight) return false;
        return widht == table.widht;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + leight;
        result = 31 * result + widht;
        return result;


    }

    @Override
    public String toString() {
        return "Table{" + "height=" + height + ", leight=" + leight + ", widht=" + widht + '}';
    }
}
