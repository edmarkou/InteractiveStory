package com.edmarkou.interactivestory.model;

public class Page {
    private int ImageId;
    private int textId;
    private Choices choice1;
    private Choices choice2;
    public boolean isFinalPage = false;

    public Page(int imageId, int textId) {
        ImageId = imageId;
        this.textId = textId;
        this.isFinalPage = true;
    }

    public Page(int imageId, int textId, Choices choice1, Choices choice2) {
        ImageId = imageId;
        this.textId = textId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public Choices getChoice1() {
        return choice1;
    }

    public void setChoice1(Choices choice1) {
        this.choice1 = choice1;
    }

    public Choices getChoice2() {
        return choice2;
    }

    public void setChoice2(Choices choice2) {
        this.choice2 = choice2;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

}
