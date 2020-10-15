package domain.ru.netology;

public class RepostsInfo {
    private int Count;
    private boolean CurrentUserReposted;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public boolean isCurrentUserReposted() {
        return CurrentUserReposted;
    }

    public void setCurrentUserReposted(boolean currentUserReposted) {
        CurrentUserReposted = currentUserReposted;
    }
}
