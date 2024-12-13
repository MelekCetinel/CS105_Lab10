public static void main(String[]args) {
    Library ICL = new Library("Istanbul City Library");
    Branch Taksim = ILR.openBranch("Taksim");
    Branch Kadikoy = ILR.openBranch("Kadikoy");
    Branch Levent = ILR.openBranch("Levent");
    Book LOR = new Book("Lord of the Rings", Taksim, 30);
    Book HG = new Book ("Hunger Games", Taksim, 10);
    Book EPL = new Book("Eat, Pray and Love", Kadikoy, 45);
    Book MNR = new Book("My Name is Red", Levent, 20);
    Member Ali = new Member("Ali Okur");
    ILR.addMember(Ali);
    Member Veli = new Member("Veli Bilir");
    ILR.addMember(Veli);
    Date date1 = new Date(24, 12, 2016);
    Ali.borrowBook(LOR, date1);
    Veli.borrowBook(HG, date1);
    Veli.borrowBook(LOR, date1);
    Veli.borrowBook(MNR, date1);
    Date date2 = new Date(14, 1, 2017);
    Ali.returnBook(LOR, date2);
    Veli.returnBook(HG, date2);
    ILR.listBooks();
    ILR.closeBranch(Levent, Kadikoy);
    ILR.listBooks();
    System.out.println(ILR.findBook("Hunger Games"));
    System.out.println(ILR.findBook("Snow"));
    Veli.listBooks();
    ILR.printBranchBalances();
}




   
