package domain.ru.netology;

public class CommentsInfo {
    private int Count;
    private boolean CanPost;
    private boolean GroupsCanPost;
    private boolean CanClose;
    private boolean CanOpen;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public boolean isCanPost() {
        return CanPost;
    }

    public void setCanPost(boolean canPost) {
        CanPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return GroupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        GroupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return CanClose;
    }

    public boolean isCanOpen() {
        return CanOpen;
    }

    public void setCanOpen(boolean canOpen) {
        CanOpen = canOpen;
    }

    public void setCanClose(boolean canClose) {
        CanClose = canClose;

    }
}
