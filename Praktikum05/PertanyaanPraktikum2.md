1.	Perhatikan perulangan di dalam bubbleSort() di bawah ini:
for (int i=0; i<listMhs.length-1; i++){
    for (int j=1; j<listMhs.length-i; j++){
a.
Mengapa syarat dari perulangan i adalah i < listMhs.length-1?
Karena dalam n data, setelah n-1 langkah pengurutan selesai, data terakhir otomatis akan berada di posisi yang benar.
b.
Mengapa syarat dari perulangan j adalah j < listMhs.length-i?
 Karena pada setiap tahap i, satu data terbesar/terkecil sudah menempati posisi akhir, sehingga perulangan j tidak perlu lagi memeriksa elemen yang sudah terurut tersebut.
c.
Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
Perulangan i akan berlangsung sebanyak 49 kali dan menempuh 49 tahap.
5.3.7 Pertanyaan 
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
int idxMin = i; 
        for (int j = i + 1; j < listMhs.length; j++) {
            if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                idxMin = j; 
            }
        }
 
Untuk apakah proses tersebut, jelaskan!
mencari indeks dengan nilai IPK terkecil (minimum) dalam sebuah array objek mahasiswa (listMhs) mulai dari posisi tertentu hingga akhir array.
