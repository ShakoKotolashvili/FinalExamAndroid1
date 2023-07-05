package com.example.finaluri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StatementsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statements)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewItemAdapter(getItemData())


    }
    private fun getItemData(): List<Item>{
        val itemList = ArrayList<Item>()
        itemList.add(
            Item(
                1,
                "https://www.notebookcheck.net/uploads/tx_nbc2/AsusVivobookFlip14-TP470EA__1__01.jpg",
                "ASUS VivoBook Flip 14 TP470EA",
                "იყიდება, g@gmail.com",
            )
        )
        itemList.add(
            Item(
                2,
                "https://www.zdnet.com/a/img/resize/e7d86557b7217933169408b6d091f3a47556b291/2017/06/15/01748d48-6a7b-40c6-ace6-26c13e96f4b2/macbook-13-2017-header.jpg?width=770&height=433&fit=crop&auto=webp",
                "Macbook Pro 13\" (2017) Touchbar",
                "For Sale, a@gmail.com",
            )
        )
        itemList.add(
            Item(
                3,
                "https://www.notebookcheck.net/fileadmin/Notebooks/News/_nc3/Deal_sale_discount_Asus_ROG_Zephyrus_G15.jpg",
                "Asus ROG Zephyrus G15",
                "Contact: t@gmail.com",
            )
        )
        itemList.add(
            Item(
                4,
                "https://img.zoommer.ge/zoommer-images/thumbs/0130255_google-pixel-4a-5g-g025e-single-sim-6gb-ram-128gb_550.png",
                "Google Pixel 4a 5G 6GB/128gb",
                "p@gmail.com",
            )
        )
        itemList.add(
            Item(
                5,
                "https://images.evga.com/products/gallery/png/11G-P4-6390-RX_LG_1.png",
                "GTX 1080 TI Founders Edition",
                "1200$. u@gmail.com",
            )
        )
        itemList.add(
            Item(
                6,
                "https://media.ldlc.com/r1600/ld/products/00/05/85/69/LD0005856909_1.jpg",
                "NVIDIA GeForce RTX 3070",
                "4000GEL. sd@gmail.com",
            )
        )
        itemList.add(
            Item(
                7,
                "https://www.bhphotovideo.com/cdn-cgi/image/format=auto,fit=scale-down,width=500,quality=95/https://www.bhphotovideo.com/images/images500x500/intel_bx8070110900k_core_i9_10900k_processor_20m_1589327172_1558668.jpg",
                "Intel Core i9-10900K 3.7 GHz",
                "My Gmail: m@gmail.com",
            )
        )
        itemList.add(
            Item(
                8,
                "https://www.sngamerzindia.com/image/cache/catalog/pc-components/intel-processors/intel-i3-10th-gen-550x550.png",
                "Intel Core i3 10105 F",
                "Contact: 333@gmail.com"
            )
        )
        itemList.add(
            Item(
                9,
                "https://m.media-amazon.com/images/I/71FeUtw+TPL._SL1500_.jpg",
                "HP Pavilion Gaming Ryzen 5 ",
                "2590$. lk@gmail.com",
            )
        )
        itemList.add(
            Item(
                10,
                "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-13-pro-max-graphite-select?wid=1200&hei=630&fmt=jpeg&qlt=95&.v=1631652956000",
                "iPhone 13 Pro 128GB Graphite",
                "asd@gmail.com",
            )
        )
        itemList.add(
            Item(
                11,
                "https://asset.msi.com/resize/image/global/product/product_1627614604e28301c1ad3af162f52bd79fa5d73900.png62405b38c58fe0f07fcef2367d8a9ba1/1024.png",
                "MSI RX 6600 XT",
                "380$. Contact: vb@gmail.com",
            )
        )
        itemList.add(
            Item(
                12,
                "https://prelovedlaptops.co.uk/wp-content/uploads/2020/08/SSD-ADA-240G630-00.jpg",
                "Adata 240 GB",
                "k@gmail.com. 730GEL",
            )
        )
        itemList.add(
            Item(
                13,
                "https://i.dell.com/is/image/DellContent//content/dam/global-site-design/product_images/peripherals/input_devices/dell/mouse/aw610m/gray/global_spi/ng/mouse-alienware-aw610m_gray-campaign-hero-504x350-ng.psd?fmt=jpg",
                "Alienware 610M Wireless",
                "bvb@gmail.com",
            )
        )
        itemList.add(
            Item(
                14,
                "https://m.media-amazon.com/images/I/61PPti4YSTL._AC_SL1024_.jpg",
                "Biostar-B250",
                "350$. My Gmail: hnb@gmail.com",
            )
        )
        itemList.add(
            Item(
                15,
                "https://media.ldlc.com/r1600/ld/products/00/05/50/58/LD0005505849_2.jpg",
                "MSI X470 Gaming Plus Max",
                "1057GEL. ssdd@gmail.com",
            )
        )
        itemList.add(
            Item(
                16,
                "https://m.media-amazon.com/images/I/71wYNUGGDgL.jpg",
                "HyperX Alloy FPS Pro",
                "70$. vc@gmail.com",
            )
        )
        itemList.add(
            Item(
                17,
                "https://m.media-amazon.com/images/I/81S-yXzvFPL._AC_SL1500_.jpg",
                "DELL XPS 17-9710",
                "6500GEL. svdd@gmail.com",
            )
        )
        itemList.add(
            Item(
                18,
                "https://www.ubuy.ge/productimg/?image=aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL0kvNzFub3psUlR6M0wuX0FDX1NMMTUwMF8uanBn.jpg",
                "HyperX QuadCast",
                "Contact Me: bo@gmail.com",
            )
        )
        itemList.add(
            Item(
                19,
                "https://img.zoommer.ge/zoommer-images/thumbs/0141668_xiaomi-mi-11-lite-6128gb-black_550.jpeg",
                "Xiaomi Mi 11 LITE",
                "1185 GEL. np@gmail.com",
            )
        )
        itemList.add(
            Item(
                20,
                "https://ponteshare.ch/wp-content/uploads/2019/06/xiaomi-mi-9t-1.jpg",
                "Xiaomi Mi 9T 6GB",
                "512GEL. ow@gmail.com",
            )
        )
        itemList.add(
            Item(
                21,
                "https://www.powerplanetonline.com/cdnassets/corsair_vengeance_rgb_pro_16gb_2x8_ddr4_2666mhz_01_l.jpg",
                "Corsair Vengeance Led 2x8 16GB",
                "bw@gmail.com",
            )
        )
        itemList.add(
            Item(
                22,
                "https://ultra.ge/image/cache/catalog/GVANCA/9HLG8LATPE1-600x600.jpg",
                "BenQ Design PD2500Q 25\" 2K QHD",
                "1240GEL. bkv@gmail.com",
            )
        )
        itemList.add(
            Item(
                23,
                "https://ultra.ge/image/cache/catalog/GVANCA/ACME%20BH203001-600x600.jpg",
                "ACME BH203 Headphones",
                "mbg@gmail.com",
            )
        )
        itemList.add(
            Item(
                24,
                "https://ultra.ge/image/cache/catalog/GVANCA/SI-2088V51-600x600.jpg",
                "AULA Fireshock V5 Wired",
                "fbj@gmail.com",
            )
        )
        itemList.add(
            Item(
                25,
                "https://ultra.ge/image/cache/catalog/GVANCA/ZT-T16520F-10L01-750x1000.jpg",
                "Zotac GAMING GTX1650 OC 4GB",
                "Contact: boe@gmail.com",
            )
        )
        itemList.add(
            Item(
                26,
                "https://ultra.ge/image/cache/catalog/GVANCA/ACME%20BH420W02-600x600.jpg",
                "ACME BH420W Wireless",
                "100GEL. woer@gmail.com",
            )
        )
        itemList.add(
            Item(
                27,
                "https://ultra.ge/image/cache/catalog/GVANCA/ZT-A30710J-10P01-600x600.jpg",
                "ZOTAC GeForce RTX3070 Ti",
                "tue@gmail.com",
            )
        )
        itemList.add(
            Item(
                28,
                "https://ultra.ge/image/cache/catalog/Gega/CNPS17X%201-600x600.jpg",
                "Zalman CNPS17X RGB",
                "300GEL. uer@gmail.com",
            )
        )
        itemList.add(
            Item(
                29,
                "https://ultra.ge/image/cache/catalog/GVANCA/2E-D2620W-01.UA01-600x600.jpg",
                "2E D2620W 25.7\" QHD",
                "Monitor. bjf@gmail.com For Details",
            )
        )
        itemList.add(
            Item(
                30,
                "https://ultra.ge/image/cache/catalog/GVANCA/AULA%20G207-600x600.jpg",
                "AULA G20 Reaper",
                "79GEL. bdf@gmail.com",
            )
        )
        itemList.add(
            Item(
                31,
                "https://ultra.ge/image/cache/catalog/GVANCA/Intel%20Core%20i7-1170001-600x600.jpg",
                "Intel Core I7-11700",
                "1300GEL. bhg@gmail.com",
            )
        )
        itemList.add(
            Item(
                32,
                "https://ultra.ge/image/cache/catalog/GVANCA/MZ-77E250BW01-600x600.jpg",
                "Samsung 870 EVO 250GB SSD",
                "lbr@gmail.com",
            )
        )
        itemList.add(
            Item(
                33,
                "https://ultra.ge/image/cache/catalog/GVANCA/KC-S44240-6F1-600x600.jpg",
                "Kingston HyperX FURY 3D 240GB",
                "Contact: bdf@gmail.com",
            )
        )
        itemList.add(
            Item(
                34,
                "https://ultra.ge/image/cache/catalog/GVANCA/Golden%20Field%207265B01-600x600.jpg",
                "Golden Field 7265B ATX",
                "pb@gmail.com",
            )
        )
        itemList.add(
            Item(
                35,
                "https://ultra.ge/image/cache/catalog/Dato/CINOSXX5568-600x600-600x600.jpg",
                "Insta360 ONE X2",
                "asdvf@gmail.com. For sale.",
            )
        )
        itemList.add(
            Item(
                36,
                "https://www.notebookcheck.net/typo3temp/_processed_/5/8/csm_EliteBook_8460w_Rear_Right_Open_new_d4da40647b.jpg",
                "14\" HP Elitebook 8460P",
                "pxc@gmail.com For Info.",
            )
        )
        itemList.add(
            Item(
                37,
                "https://img.zoommer.ge/zoommer-images/thumbs/0138476_xiaomi-redmi-note-10-464gb-gray_550.jpeg",
                "Xiaomi Redmi 10",
                "485GEL. bdfh@gmail.com",
            )
        )
        itemList.add(
            Item(
                38,
                "https://ultra.ge/image/cache/catalog/GVANCA/PSD48G320081S1-600x600.jpg",
                "Patriot SL DDR4 8GB 3200MHz",
                "Contact: bfj@gmail.com",
            )
        )
        itemList.add(
            Item(
                39,
                "https://ultra.ge/image/cache/catalog/GVANCA/LC27G75TQSIXCI1-600x600.jpg",
                "Samsung LC27G75TQSIXCI",
                "2010GEL. pqwe@gmail.com",
            )
        )
        itemList.add(
            Item(
                40,
                "https://ultra.ge/image/cache/catalog/GVANCA/SI-2088V21-600x600.jpg",
                "AULA Fireshock V2 Wired",
                "bphn@gmail.com",
            )
        )



        return itemList
    }

}