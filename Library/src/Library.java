import java.util.Date;

public class Library {
	private Book[] _books;
	private Student[] _students;
	
	//to keep track of the total books and students
	private int _tBooks;
	private int _tStudents;
	
	Library(){
		_books = new Book[20];
		_tBooks = 0;
		_students = new Student[20];
		_tStudents = 0;
		
	}
	
	public boolean GetAvailability(String idNum) {
		for(int i = 0; i < _tBooks; i++) {
			//look for the book whose availability we want to check
			if(_books[i].GetID() == idNum) {
				Date currentDate = new Date();
				//convert current date to time stamp so we can easily compare the dates
				long currentTimeStamp = currentDate.getTime();
				//return the boolean: if the current Date is after the returned date OR if the current Date is before the borrowedDate
				return currentTimeStamp > _books[i].GetReturnDate().getTime() || currentTimeStamp > _books[i].GetBorrowedDate().getTime();
			}
		}
		return false;
	}
	
	public int GetBooksToBeReturned(Date returnDate) {
		//Initialize count to 0
		int count = 0;
		//loop through all the books
		for(int i = 0 ; i < _tBooks; i++) {
			//if the book's return date is equal to the date passed as an argument, increment the count
			if(_books[i].GetReturnDate() == returnDate) {
				count++;
			}
		}
		//return the final count
		return count;
	}
	
	
}
