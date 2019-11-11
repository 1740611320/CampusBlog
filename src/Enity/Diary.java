package Enity;

public class Diary {
    private String writername;
    private String writer;
    private String diary;
    private String date;
    private String path;
    private  String UUID;
    private  String text;
    private  String headpath;

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath;
    }

    public String getWriter() {
        return writer;
    }

    public String getDate() {
        return date;
    }

    public String getDiary() {
        return diary;
    }

    public String getPath() {
        return path;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDiary(String diary) {
        this.diary = diary;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public void setWritername(String writername) {
        this.writername = writername;
    }

    public String getWritername() {
        return writername;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
