package mainPack;

public enum Cities {

    MOSCOW("Москва"),
    KRASNODAR("Краснодар"),
    SAINT_PETERSBURG("Санкт-Петербург"),
    UFA("Уфа"),
    VLADIVOSTOK("Владивосток");

    private String title;

    Cities(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
