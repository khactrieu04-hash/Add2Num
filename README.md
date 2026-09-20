# Add2Num

Dự án Java đơn giản để cộng hai số lớn bằng cách xử lý theo kiểu cộng số nguyên dài (big integer-like) từng chữ số một.

## Mô tả

- `Main.java`: điểm bắt đầu chương trình.
- `MyBigNumber.java`: chứa phương thức `sum(String stn1, String stn2)` để cộng hai chuỗi số.
- `module-info.java`: khai báo module Java cho project.

Chương trình mặc định chạy với:

- `stn1 = "1234"`
- `stn2 = "7569"`

Kết quả mẫu: `8803`

## Yêu cầu

- JDK 23 hoặc phiên bản tương thích với project.
- Biến môi trường `JAVA_HOME` đã được thiết lập.
- `javac` và `java` có sẵn trên PATH.

## Cách chạy project

### 1. Mở terminal tại thư mục dự án

```bash
cd e:\Projects\Add2Num
```

### 2. Biên dịch source code

```bash
javac -d bin src\Main\Main.java src\Main\MyBigNumber.java src\module-info.java
```

### 3. Chạy chương trình

```bash
java --module-path bin -m Add2Num/Main.Main
```

## Kết quả mong đợi

Khi chạy thành công, bạn sẽ thấy output tương tự:

```text
Bước: 1 lấy số 4 cộng 9 nhớ 0 = 13 ghi 3,nhớ 1
Bước: 2 lấy số 3 cộng 6 nhớ 1 = 10 ghi 0,nhớ 1
Bước: 3 lấy số 2 cộng 5 nhớ 1 = 8 ghi 8,nhớ 0
Bước: 4 lấy số 1 cộng 7 nhớ 0 = 8 ghi 8,nhớ 0
Kết quả: 8803
```

## Chạy trong IDE

Nếu bạn dùng Eclipse hoặc IntelliJ IDEA:

1. Import project vào IDE.
2. Mở file `src/Main/Main.java`.
3. Nhấn Run hoặc chọn Run As > Java Application.

## Ghi chú

- Project hiện tại đang dùng cấu trúc module Java (`module-info.java`).
- Nếu gặp lỗi "module not found" hoặc "javac not recognized", hãy kiểm tra lại việc cài đặt JDK và PATH.
