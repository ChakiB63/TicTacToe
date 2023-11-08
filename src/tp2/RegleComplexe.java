package tp2;

public class RegleComplexe {

	private String[] premisse;
    private String conclusion;
    public RegleComplexe(String premisse, String conclusion)
    {
        this.setPremisse(premisse.split("&"));
        this.setConclusion(conclusion);
    }
    public void RegleComplexeZ(String[] premisseZ, String conclusion)
    {
    	this.setPremisse(premisseZ);
        this.setConclusion(conclusion);
    }
	public String[] getPremisse() {
		return premisse;
	}
	public void setPremisse(String[] pre) {
		this.premisse = pre;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
}
