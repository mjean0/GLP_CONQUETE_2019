package conquete;

public class Rounds{
	//Attributes
	private boolean begin;
	private boolean end;
	private TechnicalSheet technicalSheet;
	public Rounds(){
		begin = false;
		end = false;
	}
	public Rounds(boolean begin, boolean end){
		this.begin = begin;
		this.end = end;
	}
	public Rounds(boolean begin, boolean end, TechnicalSheet technicalSheet) {
		super();
		this.begin = begin;
		this.end = end;
		this.technicalSheet = technicalSheet;
	}
	
}
