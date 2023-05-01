public class Statistics {
    long score;
    int countGames;
    long timingPlay;

    public Statistics() {
    }

    public Statistics(long score, int countGames, long timingPlay) {
        this.score = score;
        this.countGames = countGames;
        this.timingPlay = timingPlay;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public int getCountGames() {
        return countGames;
    }

    public void setCountGames(int countGames) {
        this.countGames = countGames;
    }

    public long getTimingPlay() {
        return timingPlay;
    }

    public void setTimingPlay(long timingPlay) {
        this.timingPlay = timingPlay;
    }
}
