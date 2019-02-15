import java.awt.*;

public class DogEnclosure {

    private String dogNicknameTag;
    private boolean empty;
    private boolean cleaned;

    public DogEnclosure(String dogNicknameTag) {
        this.dogNicknameTag = dogNicknameTag;
    }
    public String getDogNicknameTag() {
        return dogNicknameTag;
    }

    public void setDogNicknameTag(String dogNicknameTag) {
        this.dogNicknameTag = dogNicknameTag;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isCleaned() {
        return cleaned;
    }

    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
    }
}
