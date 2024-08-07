package ObjectFundamentals09.Inheritance;

public class Agent extends Person {
    private long agentId;
    private String activiteRegion;

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

    public String getActiviteRegion() {
        return activiteRegion;
    }

    public void setActiviteRegion(String activiteRegion) {
        this.activiteRegion = activiteRegion;
    }

    @Override
    public String getGreetings() {
        return "abee sıcaktır ";
    }
}
