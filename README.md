





**Nama:** Adrian Valentino
**NIM:** 2481042





Project ini berisi latihan implementasi konsep **Abstraction**, **Interface**, dan **Polymorphism** dalam bahasa pemrograman **Java**.
Mahasiswa diminta memahami bagaimana class dan interface digunakan untuk membangun sistem yang fleksibel, mudah dikembangkan, dan mengikuti prinsip OOP (Object-Oriented Programming).




### 1. **Abstraction (Kelas Abstrak)**

* Digunakan pada package `latihan1` dengan class `Hewan`.
* Kelas abstrak tidak dapat dibuat objek secara langsung, hanya bisa diturunkan ke subclass seperti `Kucing`, `Anjing`, dan `Burung`.
* Tujuannya agar hanya class yang memiliki perilaku spesifik yang bisa digunakan.

### 2. **Interface dan Multiple Inheritance**

* Diterapkan di package `latihan2` dengan interface seperti `Terbang`, `Berenang`, dan `Pembayaran`.
* Class seperti `Bebek` dapat mengimplementasikan **lebih dari satu interface** (multiple inheritance).
* Ini menunjukkan fleksibilitas dalam mendefinisikan perilaku yang berbeda tanpa perlu pewarisan tunggal.

### 3. **Polymorphism (Overriding & Overloading)**

* Package `latihan3` memperlihatkan **method overriding** (seperti pada `Lingkaran`, `PersegiPanjang`, `Segitiga`) dan **method overloading** (seperti pada class `Kalkulator`).
* Polymorphism membuat satu method dapat memiliki perilaku berbeda tergantung objek atau parameter yang digunakan.

### 4. **Constructor Overloading**

* Ditunjukkan pada class `Product` dengan beberapa constructor berbeda untuk menginisialisasi objek.
* Mempermudah pembuatan objek dengan fleksibilitas jumlah parameter.

### 5. **Runtime Polymorphism**

* Terjadi saat array atau variabel bertipe `Bentuk` diisi dengan berbagai objek subclass (`Lingkaran`, `PersegiPanjang`, `Segitiga`).
* Saat dijalankan, method yang sesuai dengan jenis objek aslinya akan dipanggil — meskipun referensinya bertipe parent class.




Dari latihan ini, dapat dipahami bahwa **Abstraction** membantu menyembunyikan detail implementasi, **Interface** memungkinkan struktur kode yang fleksibel, dan **Polymorphism** membuat program lebih dinamis serta mudah diperluas.



Apakah kamu mau saya bantu buatkan file `README.md`-nya langsung (biar bisa kamu download)?
