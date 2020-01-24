package com.company;

public enum DayOfWeek {

    SUNDAY ("Воскресенье учеба во вторник"),
    MONDAY ("Понедельник учеба во вторник"),
    TUESDAY ("Вторник сегодня мы учимся"),
    WEDNESDAY ("Среда учеба в четверг"),
    THURSDAY ("Четверг сегодня учеба"),
    FRIDAY ("Пятница завтра учеба"),
    SATURDAY ("Суббота сегодня учеба");

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
