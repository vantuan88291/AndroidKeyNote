# AndroidKeyNote

# Các công cụ trong Android
1. Android studio
2. Máy ảo emulator
3. Cách sử dụng file build.gradle để add thư viện
4. Attach debugger trong android studio
5. SDK manager
​
# Những kiến thức cơ bản cần tìm hiểu về android
1. Activity, vòng đời của 1 activity
2. Sử dụng 2 loại layout của android: LinearLayout, RelativeLayout
3. Tìm hiểu những View như TextView, EditText, Button, ImageView, RecyclerView...
4. Các event của các View
5. Sử dụng ArrayList
6. Sử dụng RecyclerView, custom Adapter
7. Vòng đời của Fragment, sử dụng Fragment
8. Sqlite trong android
9. Sử dụng Intent để chuyển activity
10. Tìm hiểu các loại dialog: ArletDialog, DialogFragment, cách custom dialog
11. Cách sử dụng AndroidManifest
12. Tìm hiểu các permission trong android, như quyền đọc danh bạ, quyền đọc ghi bộ nhớ...
​
​
# Những kiến thức nâng cao về android
1. Cách sử dụng thư viện glide
2. Call api sử dụng thư viện Retrofit2 và gson
3. Cách sử dụng tool: http://www.jsonschema2pojo.org/ để convert json sang đối tượng java
4. OkHttp
5. Shared Preferences
6. Tìm hiểu về lớp Application
7. Cách sử dụng interface
8. Sử dụng mô hình MVP trong android
9. Service và Boardcast receiver
10. Cách sử dụng thư viện Room để thay thế cho Sqlite
​
​
# Bài tập thực hành cơ bản
1. Xây dựng app calculator đơn giản sử dụng các view cơ bản như LinearLayout, RelativeLayout, Button, EditText...

2. Xây dựng app như sau: gồm 2 màn hình, màn hình 1 hiện thị list item có thông tin user gồm tên, số điện thoại. List user sử dụng **ArrayList** để lưu dữ liệu,  **RecyclerView** và Adapter để custom item và hiển thị, bên dưới có 1 nút Add, khi ấn nút Add sẽ chuyển sang màn hình 2, gồm: 2 ô edittext để nhập tên và số điện thoại, 1 nút button, khi nhập xong click vào button sẽ thực hiện lưu thông tin vừa nhập vào **Sqlite** và quay lại màn hình 1, hiển thị danh sách mới nhất.

3. Sử dụng file **build.gradle** để add thư viện sau: https://github.com/daimajia/AndroidViewAnimations, sau đó áp dụng thư viện đó vào bài 2.

4. Sử dụng **Fragment** để xây dựng ứng dụng có side menu: navigation drawer activity (Có chọn lúc tạo project mới)

5. Xây dựng app như bài 2, thay đổi như sau: màn hình 1 giữ nguyên, sẽ không có màn hình 2, khi click button Add sẽ hiện lên 1 **dialog** có giao diện và chức năng giống màn hình 2.
​
​
# Bài tập thực hành nâng cao
1. Xây dựng app đơn giản lấy dữ liệu từ api sau: https://jsonplaceholder.typicode.com/photos . Trong api gồm có title, url ảnh và url thumb ảnh. Sử dụng **retrofit2** và **gson** để lấy dữ liệu về, hiện thị dữ liệu lên **RecyclerView**, dùng thư viện glide để hiển thị ảnh từ dữ liệu đã lấy về. Mỗi item sẽ hiện title và ảnh thumb trong api, khi click vào mỗi item sẽ chuyển sang màn hình khác hiển thị ảnh đầy đủ.

2. Xây dựng app giống như bài 5 phần cơ bản, nhưng thay **Sqlite** bằng thư viện **Room** để lưu CSDL, sử dụng interface để truyền dữ liệu nhập vào từ dialog về màn hình 1.

3. Xây dựng app giống bài 1 sử dụng **mô hình MVP**
