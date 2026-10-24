package pr1.part4.task3;

public enum Category {
    ELECTRONICS("Электроника"),
    BOOKS("Книги"),
    CLOTHING("Одежда");

    private final String title;

    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
