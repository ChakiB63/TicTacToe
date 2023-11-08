package tp1;

public class RegleSimple {

	public RegleSimple() {
		// TODO Auto-generated constructor stub
	}
	private String premisse;
    private String conclusion;
    public RegleSimple(String premisse, String conclusion)
    {
        this.setPremisse(premisse);
        this.setConclusion(conclusion);
    }
	public String getPremisse() {
		return premisse;
	}
	public void setPremisse(String premisse) {
		this.premisse = premisse;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
}
