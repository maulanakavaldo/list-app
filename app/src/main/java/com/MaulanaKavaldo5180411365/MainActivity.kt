/**
 * Created by maulana kavaldo on 18/12/2020.
 */
 
 package com.MaulanaKavaldo5180411365

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mencari listview
        val listView = findViewById<ListView>(R.id.listview)

        //customadapter
        val customAdapter = CustomAdapter(this)
        listView.adapter = customAdapter

        //set click listener
        listView.setOnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
            Toast.makeText(applicationContext, customAdapter.names[position], Toast.LENGTH_SHORT) .show()

            //mengambil data
            val intent = Intent(this, HasilActivity::class.java)

            intent.putExtra("Judul", customAdapter.names[position])
            intent.putExtra("desc", customAdapter.desc[position])
            intent.putExtra("Img", customAdapter.image[position])
            startActivity(intent)
        }
    }
}

class CustomAdapter(private val context: Activity) : BaseAdapter() {
    var names = arrayOf(
            "Nehalem",
            "Sandybridge",
            "Ivybridge",
            "Hasswell",
            "Broadwell",
            "Skylake",
            "Kabylake",
            "Coffelake",
            "AMD K5",
            "AMD K 6",
            "AMD Duron",
            "AMD Athlon"
    )

    val desc = arrayOf(
            "Nehalem ini merupakan generasi yang pertama di prosesor intel. Pada generasi nehalem ini prosesornya memakai teknologi fabrikasi 45nm serta menjadikan satu komponen controller RAM di chipset prosesor.",
            "Merupakan generasi yang nomor dua dalam prosesor intel. Pada generasi  sandy bridge ini prosesornya memakai teknologi fabrikasi 32 nm. Dimana prosesornya lebih efektif jika dibandingkan dengan pendahulunya. Fitur baru dibawa oleh generasi prosesor sandy bridge ini yakni dengan membenamkannya di dalam prosesor pengolah data grafis  dan juga CPU.",
            "Generasi ini adalah generasi yang nomor tiga dalam prosesor intel. Pada generasi  Ivy bridge ini prosesornya memakai teknologi fabrikasi 22nm. Dimana prosesornya  sangat lebih efektif jika dibandingkan dengan pendahulunya. Dukungan port USB 3.0 serta PCLe 3.0 adalah dukungan yang dibawa oleh generasi ivy bridge ini.",
            "Generasi keempat ini adalah generasi Haswell, dimana generasi ini dirilis di tahun 2013.  Pada prosesor generasi Haswell ini mengalami peningkatan yaitu dengan sangat kencangnya grafis  yang digunakan. Pada generasi ini, kecepatan dari prosesor ini mencapai 3,4 GHz.   Dan Pada generasi   Haswell ini prosesornya memakai teknologi fabrikasi 22nm.",
            "Generasi yang kelima ini adalah generasi Broadwell, dimana prosesor generasi ini teknologi vibrasi yang dimilikinya yaitu 14nm. Dimana ini merupakan teknologi vibrasi yang sangat kecil dan juga hemat terhadap penggunaan daya. Teknologi fibrasinya didesain lebih kecil karena laptop atau komputer yang diciptakan juga semakin kecil.  Untuk performa dari generasi prosesor Broadwell ini hingga 20 %. Yang merupakan lebih bagus dari prosesor di generasi-generasi yang dahulu.",
            "Generasi Skylake adalah generasi yang nomor enam dari generasi prosesor intel. Teknologi vibrasi yang dipakai dalam prosesor generasi skylake ini adalah 14 nm. Performa yang ditingkatkan dari prosesor generasi ini yaitu disertakannya teknologi   berupa speed shift. Dan akhirnya kecepatan prosesor dari generasi skylake ini hingga 50 %. Dimana kecepatan ini lebih besar dari prosesor generasi yang dahulu. Namun, meskipun besar prosesor ini masih bisa hemat daya. Streaming video dengan kualitas 4K UHD merupakan sebuah dukungan yang diberikan oleh prosesor dari generasi Skylake ini.",
            "Generasi yang ketujuh yaitu generasi kaby lake. Dimana generasi ini memakai teknologi vibrasi 14 nm. Kecepatan pada prosesor generasi kaby lake ini mencapai 12 % yang ,mana ini lebih bagus jika dibandingkan dengan generasi skylake. Dengan begitu, pada prosesor generasi Kaby lake ini, kalian sudah dapat menonton hiburan multimedia yang sangat bagus, dalam game kemampuan grafisnya juga lebih bagus. Dan bahkan kalian juga dapat menikmati streaming dengan lancar.",
            "Generasi coffee lake ini adalah generasi prosesor intel yang ke delapan dan juga kesembilan. Pada generasi prosesor ini ada yang sebagian memakai teknologi fabrikasi yang 14nm dan juga sudah ada yang memakai 10 nm. Pada teknologi fabrikasi yang 10 nm ini, prosesornya sangat canggih dan sangat efisien. Core yang dimiliki prosesor generasi ini lebih banyak serta tingkat kecepatannya yang sangat tinggi sampai mencapai 5.0 GHz.",
            "AMD K5 awalnya dibuat supaya dapat bekerja pada semua motherboard yg mendukung Intel. Jadi motherboard yg mendukung Intel akan mendukung pula AMD K5. Pada waktu itu tidak semua motherboard dapat langsung mengenali AMD dan harus dilakukan Upgrade BIOS untuk bisa mengenali AMD.",
            "Prosesor AMD K6 merupakan prosesor generasi ke-6 dengan peforma tinggi dan dapat diinstalasi pada motherboard yg mendukung Intel Pentium. AMD K6 sendiri masih dibagi lagi modelnya nya yaitu : AMD K6, AMD K6-2, AMD K6-III.",
            "AMD Duron merupakan keluarga prosesor versi murah yang dikenal pada tahun 2000, awalnya prosesor ini memiliki code nama Spitfire yg dibuat berdasarkan Core Thunderbird. AMD Duron merupakan versi AMD Athlon yg “diringkas” ia memiliki semua arsitektur yg dimiliki AMD Athlon. Kinerja AMD Duron dengan AMD Athlon hampir sama hanya beda 7%-10% lebih tinggi AMD Athlon sedikit. Sa’at ini AMD sudah menghentikan produksi AMD Duron.",
            "AMD Athlon merupakan pengganti dari mikroprosesor seri AMD K6. Prosessor ini merupakan aksi come-back AMD ke pasar industri mikro-prosesor high-end dan AMD ingin menggeser Intel sebagai pemimpin pasar industri mikroprosesor. Prosesor ini mengungguli Intel Pentium III Katmai dan baru dapat didekati oleh Intel Pentium III Coppermine. Fitur lainya prosesor ini adalah AMD Athlon dapat dijadikan prosesor untuk system multiprosesor seperti halnya prosesor generasi keenam intel (P6). Dengan menggunakan chipset AMD 750 MP (Iron Gate) dan AMD 760 MPX, prosesor AMD mewujudkan komputer yg memiliki dua prosesor AMD Athlon."
    )

    val image = intArrayOf(
            R.drawable.nehalem,
            R.drawable.sandybridge,
            R.drawable.ivybridge,
            R.drawable.broadwell,
            R.drawable.haswell,
            R.drawable.skylake,
            R.drawable.kabylake,
            R.drawable.coffelake,
            R.drawable.amdk5,
            R.drawable.amdk6,
            R.drawable.amdduron,
            R.drawable.amdathlon
    )

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.layoutInflater
        val view = inflater.run { inflate(R.layout.list,null) }

        //find view in row
        val  fName = view.findViewById<TextView>(R.id.fname)
        val fDesc = view.findViewById<TextView>(R.id.fdesc)
        val fImage = view.findViewById<ImageView>(R.id.fimg)

        fName.text = names[position]
        fDesc.text = desc[position]
        fImage.setImageResource(image[position])
        return view
    }

    override fun getItem(position: Int): Any {
        return image[position]
    }

    override fun getItemId(position: Int): Long {
        return image[position].toLong()
    }

    override fun getCount(): Int {
        return image.size
    }
}
