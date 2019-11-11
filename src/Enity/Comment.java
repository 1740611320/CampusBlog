package Enity;

public class Comment {
    private String writer;
    private String address;
    private String words;
    private String data;
    private String writerID;
    private String UUID;

    public void setWriter(String writer) {
            this.writer = writer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getWriter() {
        return writer;
    }

    public String getAddress() {
        return address;
    }

    public String getData() {
        return data;
    }

    public String getWords() {
        return words;
    }

    public String getUUID() {
        return UUID;
    }

    public String getWriterID() {
        return writerID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public void setWriterID(String writerID) {
        this.writerID = writerID;
    }
}

