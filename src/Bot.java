public class Bot {
    int id;
    String fullname;
    String difficult;
    long score;

    public Bot() {

    }

    public Bot(int id, String fullname, String difficult, long score) {
        this.id = id;
        this.fullname = fullname;
        this.difficult = difficult;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}
