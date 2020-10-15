package domain.ru.netology;

public class ButtonActionsWithPost {
    private boolean NotInteresting; //Не интересно
    private String AddToMark; //Добавить в закладки
    private String Report; //Пожаловаться
    private boolean Notify; //Уведомлять о записях

    public boolean isNotInteresting() {
        return NotInteresting;
    }

    public void setNotInteresting(boolean notInteresting) {
        NotInteresting = notInteresting;
    }

    public String getAddToMark() {
        return AddToMark;
    }

    public void setAddToMark(String addToMark) {
        AddToMark = addToMark;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    public boolean isNotify() {
        return Notify;
    }

    public void setNotify(boolean notify) {
        Notify = notify;
    }
}
