# Bài tập Login (Cookies / Session)

## Mục tiêu
Chạy demo login cơ bản với **Cookies** hoặc **Session**.  

Người dùng đăng nhập bằng **username** và **password** cố định. Với bài tập Cookies thì chỉ có login, còn Session thì gồm login và logout.

---

## Thông tin đăng nhập
- **Username:** kikaho  
- **Password:** kikaho

---
<img width="473" height="558" alt="image" src="https://github.com/user-attachments/assets/3a191d3b-68ef-4386-b107-3fc241edf6d7" />

---

Ghi chú:
### 1. Chức năng Đăng nhập bằng Cookie

- **`Login.html`**: Form giao diện cho người dùng nhập thông tin đăng nhập.
- **`LoginServlet.java`**: Xử lý logic đăng nhập. Nếu thành công, servlet này sẽ tạo và gửi một `Cookie` về trình duyệt của người dùng để lưu trữ.
- **`HelloServlet.java`**: Trang chào mừng người dùng. Servlet này đọc `Cookie` từ request để xác thực và lấy thông tin người dùng đã đăng nhập.

### 2. Chức năng Đăng nhập bằng Session

- **`loginSession.html`**: Form giao diện đăng nhập dành cho luồng xử lý bằng session.
- **`LoginServletSession.java`**: Xử lý logic đăng nhập. Nếu thành công, servlet này sẽ tạo một `Session` trên server để lưu trữ trạng thái đăng nhập.
- **`Profile.java`**: Trang thông tin cá nhân. Yêu cầu người dùng phải có `Session` hợp lệ mới có thể truy cập.
- **`Logout.java`**: Xử lý chức năng đăng xuất bằng cách tìm và hủy `Session` của người dùng trên server.


