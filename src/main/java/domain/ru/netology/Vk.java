package domain.ru.netology;

public class Vk {
    private int PostId;
    private String AuthorName;
    private int AuthorID;
    private AvatarInfo avatarInfo;
    private int date;
    private int time;
    private String text;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private ButtonActionsWithPost buttonActionsWithPost;
    //Кнопка в виде галочки в правом углу;
    private RepostsInfo repostsInfo;
    private int view;
    private AttachmentsInfo attachmentsInfo;
    private boolean CanPin;
    private boolean CanDelete;
    private boolean CanEdit;
    private boolean IsPinned;
    private boolean MarkedAsAds;
    private String Copyright;
    private int FriendsOnly;

    public int getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public AvatarInfo getAvatarInfo() {
        return avatarInfo;
    }

    public void setAvatarInfo(AvatarInfo avatarInfo) {
        this.avatarInfo = avatarInfo;
    }

    public boolean isCanPin() {
        return CanPin;
    }

    public void setCanPin(boolean canPin) {
        CanPin = canPin;
    }

    public boolean isCanDelete() {
        return CanDelete;
    }

    public void setCanDelete(boolean canDelete) {
        CanDelete = canDelete;
    }

    public boolean isCanEdit() {
        return CanEdit;
    }

    public void setCanEdit(boolean canEdit) {
        CanEdit = canEdit;
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public ButtonActionsWithPost getButtonActionsWithPost() {
        return buttonActionsWithPost;
    }

    public void setButtonActionsWithPost(ButtonActionsWithPost buttonActionsWithPost) {
        this.buttonActionsWithPost = buttonActionsWithPost;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    public void setAttachmentsInfo(AttachmentsInfo attachmentsInfo) {
        this.attachmentsInfo = attachmentsInfo;
    }

    public boolean isPinned() {
        return IsPinned;
    }

    public void setPinned(boolean pinned) {
        IsPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return MarkedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        MarkedAsAds = markedAsAds;
    }

    public String getCopyright() {
        return Copyright;
    }

    public void setCopyright(String copyright) {
        Copyright = copyright;
    }

    public int getFriendsOnly() {
        return FriendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        FriendsOnly = friendsOnly;
    }
}

