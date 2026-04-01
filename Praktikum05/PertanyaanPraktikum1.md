1. Jelaskan fungsi kode program berikut
 if (data[j-1] > data[j]) {
    temp = data[j];
    data[j] = data[j-1];
    data[j-1] = temp;
}
Kode tersebut berfungsi untuk menukar posisi dua elemen (swap) dalam array jika elemen di sebelah kiri (data[j-1]) lebih besar daripada elemen di sebelah kanan (data[j]).
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
int min = i; 
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
while (j >= 0 && data[j] > temp)
data[j] > temp: Merupakan syarat untuk melakukan pergeseran data. Selama data di sebelah kiri (data[j]) lebih besar dari nilai yang sedang diproses (temp), maka data tersebut harus digeser ke kanan.
4. Pada Insertion sort, apakah tujuan dari perintah data[j + 1] = data[j];
menggeser elemen array ke posisi sebelah kanan guna memberi ruang kosong bagi variabel temp.
