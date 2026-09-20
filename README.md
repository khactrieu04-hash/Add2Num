# Add2Num

## 1. Giới thiệu

Add2Num là project Java thực hiện phép cộng hai số lớn bằng cách xử lý từng chữ số từ phải sang trái, tương tự cách cộng thủ công của con người. Project không dùng `BigInteger`, mà cộng theo chuỗi ký tự và quản lý số nhớ (`carry`) ở từng bước.

Ví dụ:

```text
  1234
+ 7569
------
  8803
```

---

## 2. Link Repository

Project đã được lưu trên Git Server công khai:

- GitHub: https://github.com/khactrieu04-hash/Add2Num.git

Repository này có thể clone về máy khác và chạy lại theo hướng dẫn trong README.

---

## 3. Version

Phiên bản hoàn thành để đánh giá là:

```text
0.0.1
```

Project đã được đánh tag theo version này:

```bash
git tag
```

Kết quả hiện có là:

```text
0.0.1
```

---

## 4. Cấu trúc project

```text
Add2Num/
├── bin/
├── src/
│   ├── module-info.java
│   └── Main/
│       ├── Main.java
│       └── MyBigNumber.java
├── .classpath
├── .project
├── README.md
├── .git/
└── .github/
```

---

## 5. Yêu cầu môi trường

Trước khi chạy project, cần có:

- JDK 23 hoặc phiên bản tương thích
- `javac` và `java` đã có trên `PATH`
- GIT đã được cài đặt nếu muốn clone repo

---

## 6. Clone source code từ Git

Để clone project về đúng theo quy ước của đề bài, hãy thực hiện như sau:

### Windows

```bash
cd D:\Projects
mkdir github.com
cd github.com
mkdir khactrieu04-hash
cd khactrieu04-hash
git clone https://github.com/khactrieu04-hash/Add2Num.git
```

Sau khi clone xong, thư mục sẽ ở:

```text
D:\Projects\github.com\khactrieu04-hash\Add2Num
```

### macOS / Linux

```bash
cd ~/Projects
mkdir -p github.com/khactrieu04-hash
cd github.com/khactrieu04-hash
git clone https://github.com/khactrieu04-hash/Add2Num.git
```

Sau khi clone xong, thư mục sẽ ở:

```text
~/Projects/github.com/khactrieu04-hash/Add2Num
```

---

## 7. Biên dịch project

Mở terminal tại thư mục dự án và chạy:

```bash
cd E:\Projects\Add2Num
javac -d bin src\Main\Main.java src\Main\MyBigNumber.java src\module-info.java
```

Nếu đang ở thư mục clone mới (ví dụ `D:\Projects\github.com\khactrieu04-hash\Add2Num`), lệnh tương đương là:

```bash
cd D:\Projects\github.com\khactrieu04-hash\Add2Num
javac -d bin src\Main\Main.java src\Main\MyBigNumber.java src\module-info.java
```

---

## 8. Chạy project

```bash
java --module-path bin -m Add2Num/Main.Main
```

---

## 9. Kết quả đầu ra mẫu

Khi chạy thành công, chương trình sẽ in ra các bước cộng và kết quả cuối cùng như sau:

```text
Bước: 1 lấy số 4 cộng 9 nhớ 0 = 13 ghi 3, nhớ 1
Bước: 2 lấy số 3 cộng 6 nhớ 1 = 10 ghi 0, nhớ 1
Bước: 3 lấy số 2 cộng 5 nhớ 1 = 8 ghi 8, nhớ 0
Bước: 4 lấy số 1 cộng 7 nhớ 0 = 8 ghi 8, nhớ 0
Kết quả: 8803
```

---

## 10. Unit Testing

Project hiện tại không có Unit Testing được lưu riêng trong thư mục test để kiểm tra `sum()` theo cách chuẩn. Việc kiểm thử đã được thực hiện bằng cách chạy trực tiếp chương trình chính (`Main.java`) và kiểm tra output đầu ra.

Nếu muốn bổ sung Unit Testing trong tương lai, nên tạo thư mục riêng như:

```text
src/test/
```

hoặc

```text
tests/
```

tách biệt với thư mục mã nguồn chính `src/Main`.

---

## 11. Cách chạy trong IDE

Nếu dùng Eclipse hoặc IntelliJ IDEA:

1. Import project vào IDE.
2. Mở file `src/Main/Main.java`.
3. Chọn Run hoặc Run As > Java Application.

---

## 12. Lưu ý

- Project là Java module-based (`module-info.java`).
- Khi clone về từ Git, hãy đảm bảo JDK đã được cài đặt và `PATH` đã được cấu hình đúng.
- Nếu gặp lỗi `javac: not recognized` hoặc `java: not recognized`, hãy kiểm tra lại JDK trên máy.
- Dự án này đã được kiểm thử thành công bằng lệnh compile + run như hướng dẫn ở trên.

---

## 13. Tóm tắt nhanh

```bash
git clone https://github.com/khactrieu04-hash/Add2Num.git
cd Add2Num
javac -d bin src\Main\Main.java src\Main\MyBigNumber.java src\module-info.java
java --module-path bin -m Add2Num/Main.Main
```
