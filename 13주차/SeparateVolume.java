class SeparateVolume  {
    String requestNo;      // 청구번호
    String bookTitle;      // 제목
    String writer;         // 저자
    String borrower;       // 대출인
    String checkOutDate;   // 대출일
    byte state;            // 대출상태
    SeparateVolume(String requestNo, String bookTitle, 
                   String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }
}
