# **Tugas PBO TM 13 (Login dengan Persistence)**
___
## **_Deskripsi:_**

Project ini merupakan lanjutan dari tugas pertemuan keduabelas yakni dengan menambahkan Login untuk dapat mengakses FrameMataKuliah. Dalam project ini saya melanjutkan code pada project PBO_Persistence untuk membuat Login dengan mengganti nama project menjadi PBO_TM13. Pada project sebelumnya (PBO_Persistence) sudah terdapat kelas KoneksiDB, FrameMataKuliah, Matakuliah (sebagai kelas persistence), beserta reportmatakuliah.jrxml sebagai tampilan untuk mencetak data MataKuliah.
___
## **Berikut Langkah-langkah membuat Login menggunakan Persistence:**

1.	Membuat Tabel PasswordLogin pada database Mata_Kuliah dengan atribut username dan password yang nantinya akan digunakan sebagai login untuk membuka FrameMataKuliah.

    ![image](https://github.com/user-attachments/assets/91c5e191-b0c6-4dd6-9bf4-4816f182430a)

2.	Memasukkan data username dan password pada tabel PasswordLogin.

    ![image](https://github.com/user-attachments/assets/00626e18-4a4e-43bc-b36a-5d6e908b58f6)

3.	Membuat kelas Persistence Passwordlogin dengan cara klik kanan pada package TM13 kemudian klik Entity Classes from Database.

    ![image](https://github.com/user-attachments/assets/e7d6cbe5-5421-44ec-ab52-4adf544e404b)

4.	Pilih Database yang akan digunakan pada Database Connection (Menggunakan database Mata_Kuliah).

    ![image](https://github.com/user-attachments/assets/e07a90e4-a48b-417c-858c-a4a4f49ff289)

5.	Karena sebelumnya telah membuat persistence dari tabel MataKuliah serta kelas persistence matakuliah berhasil dibuat, maka untuk membuat login pilih tabel passwordlogin kemudian klik Add>

    ![image](https://github.com/user-attachments/assets/c85474b1-4ef0-4c28-911e-b09255ab7921)

   Tabel passwordlogin telah dipindahkan ke sebelah kanan (Selected Tables) kemudian klik Next.

  ![image](https://github.com/user-attachments/assets/2f1b41d6-d744-41ee-a35b-9b702625dcd9)


6.	Pada tampilan Entity Classes klik Next.

    ![image](https://github.com/user-attachments/assets/46c6417c-8492-4459-a44b-1a16b21f768d)

7.	Pada tampilan Mapping Options berikut klik Finish.

    ![image](https://github.com/user-attachments/assets/90bd0257-91d1-42f8-aae6-3f56fb85422e)

8.	Kelas Persistence Passwordlogin berhasil dibuat.

    ![image](https://github.com/user-attachments/assets/458eab90-5414-475b-85d4-3440e2f5a6d2)

9.	Berikut tampilan dari persistence.xml dengan nama persistence unit “PBO_TM13PU”

    ![image](https://github.com/user-attachments/assets/d5352b78-afed-445e-bd94-e621e86a1b58)

10.	Membuat FrameLogin menggunakan JFrame Form kemudian membuat desain login. Pada desain login berikut berisi Username dan Password yang dapat diisi menggunakan JTextFields, Login menggunakan JButton, serta JLable Forgot Password yang ketika di klik akan masuk ke frame LupaPassword beserta JLable Don’t have an account? Create now! Yang ketika di klik akan masuk ke frame BuatAkun.

    ![image](https://github.com/user-attachments/assets/306736e8-c12b-446a-a7e2-cd8432d61f87)

11.	Berikut code btnLogin. Pada code ini menggunakan 2 import yakni import javax.persistence.*; import javax.swing.*;

    ![image](https://github.com/user-attachments/assets/c1a5be99-9b1f-4520-9726-6d0105a8d5aa)

12.	Berikut code JLable Forgot Password yang ketika di klik akan masuk ke frame LupaPassword beserta JLable Don’t have an account? Create now! Yang ketika di klik akan masuk ke frame BuatAkun.

    ![image](https://github.com/user-attachments/assets/9e165056-a3e6-4d12-91a1-5575f26b91a9)

13.	Membuat Frame LupaPassword menggunakan JFrame Form kemudian membuat desain dari Frame Lupa Password yang berisi JTextFields untuk mengisi Username dan menampilkan Password, JButton untuk button Back, Clear, dan Update. Button back untuk mengarahkan Kembali ke Frame Login, button Clear untuk menghapus text pada tfUsername dan tfPassword, button Update untuk mengupdate Password dari username pengguna.

    ![image](https://github.com/user-attachments/assets/81f4ed32-d039-460b-b6de-ef7d5f707c19)

14.	Berikut code dari tfUsername apabila setelah mengisi username dan klik enter maka akan menampilkan Password user.

    Import yang digunakan:

    ![image](https://github.com/user-attachments/assets/739b0832-b234-44d2-90a2-0a991bfaafca)

    ![image](https://github.com/user-attachments/assets/08aff8ad-b5a0-4b81-9182-06be5dcbceb1)

15. Berikut code button Update untuk mengupdate password user.

    ![image](https://github.com/user-attachments/assets/f55943fe-bd72-455d-ad33-74bfec4b3443)

16.	Berikut code btnBack dan btnClear. BtnBack untuk mengarahkan Kembali ke FrameLogin, btnClear untuk menghapus text pada tfUsername dan tfPassword.

    ![image](https://github.com/user-attachments/assets/522bb192-e0bf-44d8-a59c-8f22b4a3e805)

17.	Membuat Frame BuatAkun yang berisi JTextFields untuk Username dan Password, JButton Create, Delete, Back.

    ![image](https://github.com/user-attachments/assets/8f039af7-22ee-4023-97d4-9b9f9a45b2d2)

18.	Berikut code btnCreate untuk membuat akun baru agar dapat login dan mengakses FrameMataKuliah.

    Import yang digunakan:

    ![image](https://github.com/user-attachments/assets/0be926fe-8051-482d-8bf9-ea0bf7ce6bea)

    ![image](https://github.com/user-attachments/assets/85b91722-344f-475f-ba39-d66441ef97e0)

    Method clear untuk membersihkan text pada JTextFields:

    ![image](https://github.com/user-attachments/assets/a62c7124-807e-487a-be9d-11d31ba8d2ad)

19.	Berikut code btnDelete untuk menghapus akun.

    ![image](https://github.com/user-attachments/assets/afaa15ae-2cfd-4129-ad23-2d5c0ba8dae6)

20.	Berikut code btnBack untuk Kembali ke FrameLogin

    ![image](https://github.com/user-attachments/assets/ecc38e87-7dcb-4e14-a570-8b90328f618d)

21.	Eksekusi Login

    ![image](https://github.com/user-attachments/assets/8a4057cf-3929-47d9-9aa2-f2fb5a01224b)

    FrameMataKuliah berhasil dibuka dan dapat diakses

    ![image](https://github.com/user-attachments/assets/8a81c4df-c964-4c3a-97d2-ef8d9cf9045d)

22.	Eksekusi Lupa Password

    Mengisi username

    ![image](https://github.com/user-attachments/assets/e394b2ec-ffbf-4bab-a61c-5fea75807bed)

    Setelah klik enter password berhasil ditampilkan

    ![image](https://github.com/user-attachments/assets/7e2d6130-e664-4d5e-b118-4d28c0e52e7b)

23.	Eksekusi Update Password

    Mengubah password sebelumnya tanti2112 menjadi tanti11

    ![image](https://github.com/user-attachments/assets/7389157a-3eca-496b-ae0f-04fd1fce46f8)

    Berhasil login menggunakan password baru dari username anisatanti

    ![image](https://github.com/user-attachments/assets/b45d9f6d-5c50-4c1f-8858-0a5576de6135)

24.	Eksekusi Buat Akun baru

    ![image](https://github.com/user-attachments/assets/eee7ab58-a3b2-45bc-ba15-1931c5637f43)

    Login dengan akun baru

    ![image](https://github.com/user-attachments/assets/c792b6e9-1f1a-4c49-aac3-d44797ece70c)

    Berhasil mengakses FrameMataKuliah

    ![image](https://github.com/user-attachments/assets/1401fb49-cadb-452d-b75e-b888fe2d5470)

25.	Eksekusi Hapus Akun

    ![image](https://github.com/user-attachments/assets/1fbb68f1-f47e-4fc3-9695-8fb4178c4272)

    ![image](https://github.com/user-attachments/assets/ff1cd13b-3f58-4253-b10e-e65b97397327)

    Akun terbukti sudah terhapus karena tidak bisa digunakan untuk login

    ![image](https://github.com/user-attachments/assets/3e9edefb-e249-494d-89d4-c936a255c672)


























    













