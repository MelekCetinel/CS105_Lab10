
public class Book {
    private String name;
    private Branch branch;
    private int borrowDuration;
    private boolean isAvailable;
    private Member currentMember;
    private Date lastBorrowDate;

    public Book(String name, Branch branch, int borrowDuration) {
        this.name = name;
        this.branch = branch;
        this.borrowDuration = borrowDuration;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return this.branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getBorrowDuration() {
        return this.borrowDuration;
    }

    public void setBorrowDuration(int borrowDuration) {
        this.borrowDuration = borrowDuration;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Member getCurrentMember() {
        return this.currentMember;
    }

    public void setCurrentMember(Member currentMember) {
        this.currentMember = currentMember;
    }

    public Date getLastBorrowDate() {
        return this.lastBorrowDate;
    }

    public void setLastBorrowDate(Date lastBorrowDate) {
        this.lastBorrowDate = lastBorrowDate;
    }

}    
