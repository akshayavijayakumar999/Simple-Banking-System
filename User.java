package bankpkg;

public class User {
	private long accno;// Private members can't be accessed through inheritance,So giving getters and setters  as pulic
	private long ph;
	
	public long getPh() {
		return ph;
	}

	public void setPh(long ph) {
		this.ph = ph;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}
	

}
