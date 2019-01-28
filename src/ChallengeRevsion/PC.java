package ChallengeRevsion;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private  MotherBoard motherBoard;
    public  PC(Case  theCase ,Monitor monitor ,MotherBoard motherBoard)
    {
        this.monitor=monitor;
        this.theCase=theCase;
        this.motherBoard=motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }
}
