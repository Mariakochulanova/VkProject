package domain.ru.netology;

public class Vk {
    private int PostId;
    private String AuthorName;
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


}

