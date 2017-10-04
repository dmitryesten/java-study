package net.thumbtack.denisenko.trainee.figure.box;

public class Box <T> {

    private T content;

    Box(T content){
        this.content = content;
    }


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}
