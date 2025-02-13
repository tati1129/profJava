package javaPro._02_13;

import java.lang.reflect.Type;

public class Example<T> {
    private T field;

    public Example() {
    }

    public Example(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
