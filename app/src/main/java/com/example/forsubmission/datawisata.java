package com.example.forsubmission;

import java.util.ArrayList;

public class datawisata {
    private static String[] namaTempat = {
            "Danau Linting",
            "Air Terjun Dua Warna",
            "Gunung Sibayak",
            "Bukit Lawang",
            "Masjid Raya Medan",
            "Air Terjun Sipiso Piso",
            "Rahmat Gallery Medan",
            "Air Terjun Tangkahan",
            "Danau Lau Kawar",
            "Meseum Sumatera Utara",
    };

    private static String[] tempatDetail = {
            "Danau ini memiliki warna air yang biru dan kehijau-hijauan ini tidak hanya terlihat indah, namun di sekitar Danau Linting ini terasa sejuk dan asri karena di sekitar danau ini dikelilingi oleh pepohonan yang hijau dan rimbun.Danau Linting, meski tergolong danau vulkanik dan warna air di Danau Linting ini kehijau-hijauan, Danau Linting ini sama sekali tidak berbau seperti danau vulkanik yang lainnya.",
            "Air Terjun Dua Warna terletak di Kecamatan Sibolangit, Sumatera Utara. Airnya berasal dari Gunung Sibayak. Ketinggian Air Terjun Dua Warna berada pada 1270 meter dpl. Kenapa dikatakan Air Terjun Dua Warna? Jawabannya adalah karena air terjun indah ini memang memiliki dua gradasi warna yang berbeda",
            "Gunung Sibayak adalah kelas gunung berapi aktif yang memiliki uap panas. Selain itu, letusan yang terjadi beberapa waktu lalu cukup mengguncang bebatuan di puncak gunung. Kondisi yang cukup “tidak beraturan” pada bebatuan puncak nya ini, justru menjadi keunikan tersendiri yang menarik wisatawan yang senang menguji adrenalinnya untuk berusaha menaklukkan Gunung Sibayak hingga mencapai puncaknya.",
            "Bukit Lawang adalah sebuah bukit yang memiliki keunikan kesendiri yang mempunyai sebuah sungai dan hutan yang masih asri ",
            "Masjid Raya Medan atau Masjid Raya Al Mashun merupakan sebuah masjid yang terletak di Medan, Indonesia. Masjid ini dibangun pada tahun 1906 dan selesai pada tahun 1909.",
            "Air Terjun Sipiso-piso merupakan salah satu air terjun tertinggi di Indonesia, dengan ketinggian sekitar 120 meter. Terletak di Desa Tongging, Sumatra Utara.",
            "Rahmat” Museum & Gallery ini memiliki koleksi ±2600 spesies yang berasal dari : Perburuan legal dengan konsep “Konservasi dengan Pemanfaatan” yang telah di lakukan oleh hampir seluruh negara, untuk mencegah kepunahan dan menambah populasi satwa liar dan lingkungannya.",
            "Air Terjun Tangkahan. Air Terjun Tangkahan. [image source] Untuk mencapainya harus menyeberangi sungai karena berada di tengah rerimbunan hutan. Airnya hangat karena bercampur dengan mata air panas yang di atas tebing",
            "Danau Lau Kawar, adalah satu danau yang berada di berada di Desa Kutagugung, Kecamatan Naman Teran (dulu Kecamatan Simpang Empat), di bawah kaki gunung berapi Sinabung, Kabupaten Karo, Provinsi Sumatra Utara.",
            "Museum Sumatra Utara atau yang lebih dikenal warga Sumut Museum Negeri Provinsi Sumatra Utara (disingkat Museum Negeri Provsu) ini terletak di Jln. H.M. Jhoni No. 51 Medan.[1] Merupakan Museum terbesar di Sumatra Utara yang berbagai peninggalan sejarah budaya bangsa, hasil seni dan kerajinan dari berbagai suku di Sumatra Utara. Museum ini dibangun pada tahun 1954 dan diresmikan pada tanggal 19 April 1982 oleh Menteri Pendidikan dan Kebudayaan Daoed Joesoef.[2][1] Museum ini merupakan salah satu museum terbaik di Indonesia.",
    };

    private static int[] wisataimage = {
            R.drawable.danaulinting,
            R.drawable.airterjunduawarnasibolangit,
            R.drawable.gunungsibayaksumaterautara,
            R.drawable.destinasiwisatabukitlawangdisumaterautara,
            R.drawable.wisatareligikemasjidrayamedan,
            R.drawable.wisataalamairterjunsipisopisotongging,
            R.drawable.tempatwisatamenarikrahmatgallerymedan,
            R.drawable.menikmatipesonakeindahanairterjuntangkahan,
            R.drawable.tempatwisataserudanaulaukawar,
            R.drawable.wisatasejarahmuseumsumaterautara,
    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < namaTempat.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(namaTempat[position]);
            wisata.setDetail(tempatDetail[position]);
            wisata.setPhoto(wisataimage[position]);
            list.add(wisata);
        }
        return list;
    }
}
