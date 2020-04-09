package creating_classes;

public class interview {
  private  String candidateName;
    private   double candidateScore;
    private  String finalDecision;
    private  int javaPoint;
    private  int SQLPoint;
    private  int SoftSkillPoint;

    public interview(String candidateName,int javaPoint,int SQLPoint,int SoftSkillPoint){
        this.candidateName=candidateName;
        this.candidateScore=0;
        this.finalDecision=null;
        this.javaPoint=javaPoint;
        this.SQLPoint=SQLPoint;
        this.SoftSkillPoint=SoftSkillPoint;
    }

    @Override
    public String toString() {
        return "interview{" +
                "candidateName='" + candidateName + '\'' +
                ", candidateScore=" + candidateScore +
                ", finalDecision=" + finalDecision +
                ", javaPoint=" + javaPoint +
                ", SQLPoint=" + SQLPoint +
                ", SoftSkillPoint=" + SoftSkillPoint +
                '}';
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public double getCandidateScore() {
        return candidateScore;
    }

    public void setCandidateScore(int candidateScore) {
        this.candidateScore = candidateScore;
    }

    public String getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    public int getJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(int javaPoint) {
        this.javaPoint = javaPoint;
    }

    public int getSQLPoint() {
        return SQLPoint;
    }

    public void setSQLPoint(int SQLPoint) {
        this.SQLPoint = SQLPoint;
    }

    public int getSoftSkillPoint() {
        return SoftSkillPoint;
    }

    public void setSoftSkillPoint(int softSkillPoint) {
        SoftSkillPoint = softSkillPoint;
    }
    public double calculateScore(){
        this.candidateScore=this.javaPoint+this.SQLPoint+this.SoftSkillPoint;
        return this.candidateScore;
    }
    public String decideResult(){
        if(this.candidateScore>100){
            this.finalDecision="Congrats";
        }
        else{
            this.finalDecision="Try again";

        }
        return this.finalDecision;
    }
}
