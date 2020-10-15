package domain.ru.netology;

public class LikesInfo {
    private int Count;
    private boolean UserLikes;
    private boolean CanLike;
    private boolean CanPublish;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public boolean isUserLikes() {
        return UserLikes;
    }

    public void setUserLikes(boolean userLikes) {
        UserLikes = userLikes;
    }

    public boolean isCanLike() {
        return CanLike;
    }

    public void setCanLike(boolean canLike) {
        CanLike = canLike;
    }

    public boolean isCanPublish() {
        return CanPublish;
    }

    public void setCanPublish(boolean canPublish) {
        CanPublish = canPublish;
    }
}
