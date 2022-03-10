package lesson_6.data_mapper;

import java.io.Serializable;

public class User implements Serializable {

    private Long userId;
    private String name;


    public User(final long userId, final String name) {
        this.userId = userId;
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(final Object comparingObject) {

        boolean isEqual = false;
        if (this == comparingObject) {
            // сравнить ссылки
            isEqual = true;
        } else if (comparingObject != null && getClass() == comparingObject.getClass()) {
            // если совпадают классы объектов, то сравниваем ID
            final User inputUser = (User) comparingObject;
            if (this.getUserId() == inputUser.getUserId()) {
                isEqual = true; // если совпадают ID, то объекты равны
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return (int) this.getUserId();
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + "]";
    }
}
