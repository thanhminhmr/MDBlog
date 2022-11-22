package model;

public class BlogReaction {
    private int id;
    private int idAccount;
    private String content;

    public BlogReaction(int id, int idAccount, String content) {
        this.id = id;
        this.idAccount = idAccount;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
