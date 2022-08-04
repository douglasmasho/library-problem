import java.util.Date;

public class Book {
	private String _name;
	private String _idNum;
	private Date _borrowedDate;
	private Date _returnedDate;
	
	
	Book(String newN, String newID){
		this._name = newN;
		this._idNum = newID;
	}
	
	public String GetID() {
		return _idNum;
	}
	public Date GetReturnDate() {
		return _returnedDate;
	}
	public Date GetBorrowedDate() {
		return _borrowedDate;
	}
	
}
