class SeparateVolume  {
    String requestNo;      // û����ȣ
    String bookTitle;      // ����
    String writer;         // ����
    String borrower;       // ������
    String checkOutDate;   // ������
    byte state;            // �������
    SeparateVolume(String requestNo, String bookTitle, 
                   String writer) {
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }
}
