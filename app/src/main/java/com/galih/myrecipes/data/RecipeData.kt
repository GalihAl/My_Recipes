package com.galih.myrecipes.data

import com.galih.myrecipes.R
import com.galih.myrecipes.model.Recipe

object RecipeData {
    private val recipeNames = arrayOf(
        "Tongkol Cabai Hijau",
        "Bobor Ayam",
        "Sayur Lombok Tahu",
        "Risoles Roti Tawar",
        "Risoles Sederhana",
        "Risoles Mayo",
        "Risoles Sayur",
        "Risoles Pisang Meses",
        "Soto Mie khas Bogor",
        "Keripik Usus Pedas",
        "Keripik Usus Gurih"
    )
    private val recipeDetails = arrayOf(
        "Olahan tongkol yang nikmat dan lezat untuk keluarga",
        "Sayuran menyehatkan untuk disantap bersama keluarga",
        "Sayuran untuk pecinta pedas",
        "Roti tawar sebagai kulit luar yang membuat renyah",
        "Sederhana namun nikmat disantap",
        "Renyah diluar namun meleleh di dalam",
        "Cocok sebagai cemilah sehat bagi si kecil",
        "Bagaiman rasanya jika di isi dengan pisang",
        "Resep soto khas bogor",
        "Kripik usus untuk pecinta pedas",
        "Renyah dan gurih nikmat untuk disantap bersama keluarga"
    )
    private val recipePhotos = intArrayOf(
        R.drawable.image_tongkolcabaihijau,
        R.drawable.image_boborayam,
        R.drawable.image_sayurlomboktahu,
        R.drawable.image_risolesrotitawar,
        R.drawable.image_risolessederhana,
        R.drawable.image_risolesmayo,
        R.drawable.image_risolessayur,
        R.drawable.image_risolespisang,
        R.drawable.image_sotomiebogor,
        R.drawable.image_keripikususpedas,
        R.drawable.image_keripikususgurih
    )
    private val recipeTimes = intArrayOf(
        25,
        20,
        30,
        25,
        25,
        25,
        24,
        24,
        32,
        24,
        24
    )
    private val recipeIngredientSums = intArrayOf(
        13,
        10,
        15,
        20,
        9,
        15,
        11,
        16,
        22,
        6,
        22

    )
    private val recipeRatings = doubleArrayOf(
        4.1,
        4.2,
        4.0,
        3.9,
        4.1,
        4.0,
        4.0,
        3.7,
        4.2,
        3.7,
        3.2
    )
    private val recipeCalorie = intArrayOf(
        150,
        200,
        200,
        300,
        175,
        210,
        100,
        120,
        120,
        150,
        200
    )
    private val recipeIngredients = arrayOf(
        "3 ekor ikan tongkol\n" +
                "1 buah tahu, potong dadu\n" +
                "65 mL santan kental\n" +
                "300 mL air\n" +
                "1 sdm garam\n" +
                "2 sdt gula\n" +
                "1 ruas lengkuas geprek\n" +
                "10 buah cabai ijo besar\n" +
                "3 siung bawang putih\n" +
                "7 siung bawang merah\n" +
                "1 buah cabe merah besar\n" +
                "12 cabai rawit\n" +
                "1 buah tomat",
        "10 tahu putih, potong dadu\n" +
                "5 buah cabai rawit\n" +
                "5 buah cabai hijau, iris tipis\n" +
                "1 ruas lengkuas, geprek\n" +
                "2 lembar daun salam\n" +
                "1 sdt gula merah\n" +
                "Gula, secukupnya\n" +
                "Garam, secukupnya\n" +
                "Merica, secukupnya\n" +
                "400 mL santan cair\n" +
                "5 butir bawang merah, iris\n" +
                "3 siung bawang putih, iris\n" +
                "2 butir kemiri\n" +
                "1/2 sdt ketumbar\n" +
                "1 ruas kunyit",
        "3 ekor ikan tongkol\n" +
                "1 buah tahu, potong dadu\n" +
                "65 mL santan kental\n" +
                "300 mL air\n" +
                "1 sdm garam\n" +
                "2 sdt gula\n" +
                "1 ruas lengkuas geprek\n" +
                "10 buah cabai ijo besar\n" +
                "3 siung bawang putih\n" +
                "7 siung bawang merah\n" +
                "1 buah cabe merah besar\n" +
                "12 cabai rawit\n" +
                "1 buah tomat",
        "10 tahu putih, potong dadu\n" +
                "5 buah cabai rawit\n" +
                "5 buah cabai hijau, iris tipis\n" +
                "1 ruas lengkuas, geprek\n" +
                "2 lembar daun salam\n" +
                "1 sdt gula merah\n" +
                "Gula, secukupnya\n" +
                "Garam, secukupnya\n" +
                "Merica, secukupnya\n" +
                "400 mL santan cair\n" +
                "5 butir bawang merah, iris\n" +
                "3 siung bawang putih, iris\n" +
                "2 butir kemiri\n" +
                "1/2 sdt ketumbar\n" +
                "1 ruas kunyit",
        "3 ekor ikan tongkol\n" +
                "1 buah tahu, potong dadu\n" +
                "65 mL santan kental\n" +
                "300 mL air\n" +
                "1 sdm garam\n" +
                "2 sdt gula\n" +
                "1 ruas lengkuas geprek\n" +
                "10 buah cabai ijo besar\n" +
                "3 siung bawang putih\n" +
                "7 siung bawang merah\n" +
                "1 buah cabe merah besar\n" +
                "12 cabai rawit\n" +
                "1 buah tomat",
        "10 tahu putih, potong dadu\n" +
                "5 buah cabai rawit\n" +
                "5 buah cabai hijau, iris tipis\n" +
                "1 ruas lengkuas, geprek\n" +
                "2 lembar daun salam\n" +
                "1 sdt gula merah\n" +
                "Gula, secukupnya\n" +
                "Garam, secukupnya\n" +
                "Merica, secukupnya\n" +
                "400 mL santan cair\n" +
                "5 butir bawang merah, iris\n" +
                "3 siung bawang putih, iris\n" +
                "2 butir kemiri\n" +
                "1/2 sdt ketumbar\n" +
                "1 ruas kunyit",
        "3 ekor ikan tongkol\n" +
                "1 buah tahu, potong dadu\n" +
                "65 mL santan kental\n" +
                "300 mL air\n" +
                "1 sdm garam\n" +
                "2 sdt gula\n" +
                "1 ruas lengkuas geprek\n" +
                "10 buah cabai ijo besar\n" +
                "3 siung bawang putih\n" +
                "7 siung bawang merah\n" +
                "1 buah cabe merah besar\n" +
                "12 cabai rawit\n" +
                "1 buah tomat",
        "10 tahu putih, potong dadu\n" +
                "5 buah cabai rawit\n" +
                "5 buah cabai hijau, iris tipis\n" +
                "1 ruas lengkuas, geprek\n" +
                "2 lembar daun salam\n" +
                "1 sdt gula merah\n" +
                "Gula, secukupnya\n" +
                "Garam, secukupnya\n" +
                "Merica, secukupnya\n" +
                "400 mL santan cair\n" +
                "5 butir bawang merah, iris\n" +
                "3 siung bawang putih, iris\n" +
                "2 butir kemiri\n" +
                "1/2 sdt ketumbar\n" +
                "1 ruas kunyit",
        "3 ekor ikan tongkol\n" +
                "1 buah tahu, potong dadu\n" +
                "65 mL santan kental\n" +
                "300 mL air\n" +
                "1 sdm garam\n" +
                "2 sdt gula\n" +
                "1 ruas lengkuas geprek\n" +
                "10 buah cabai ijo besar\n" +
                "3 siung bawang putih\n" +
                "7 siung bawang merah\n" +
                "1 buah cabe merah besar\n" +
                "12 cabai rawit\n" +
                "1 buah tomat",
        "10 tahu putih, potong dadu\n" +
                "5 buah cabai rawit\n" +
                "5 buah cabai hijau, iris tipis\n" +
                "1 ruas lengkuas, geprek\n" +
                "2 lembar daun salam\n" +
                "1 sdt gula merah\n" +
                "Gula, secukupnya\n" +
                "Garam, secukupnya\n" +
                "Merica, secukupnya\n" +
                "400 mL santan cair\n" +
                "5 butir bawang merah, iris\n" +
                "3 siung bawang putih, iris\n" +
                "2 butir kemiri\n" +
                "1/2 sdt ketumbar\n" +
                "1 ruas kunyit",
        "10 tahu putih, potong dadu\n" +
                "5 buah cabai rawit\n" +
                "5 buah cabai hijau, iris tipis\n" +
                "1 ruas lengkuas, geprek\n" +
                "2 lembar daun salam\n" +
                "1 sdt gula merah\n" +
                "Gula, secukupnya\n" +
                "Garam, secukupnya\n" +
                "Merica, secukupnya\n" +
                "400 mL santan cair\n" +
                "5 butir bawang merah, iris\n" +
                "3 siung bawang putih, iris\n" +
                "2 butir kemiri\n" +
                "1/2 sdt ketumbar\n" +
                "1 ruas kunyit"

    )
    private val recipeStepsCook = arrayOf(
        "1. Panaskan wajan, masukkan bawang putih, bawang merah, lengkuas, daun salam. Tumis hingga harum.\n" +
                "2. Masukkan bayam, tempe, santan cair, aduk bumbu agar merata.\n" +
                "3. Masak sampai kuah mendidih.\n" +
                "4. Masukkan garam, kaldu bubuk, dan gula. Lakukan koreksi rasa.\n" +
                "5. Angkat dan sajikan bobor bayam selagi hangat.",
        "1. Goreng tahu hingga setengah matang, sisihkan.\n" +
                "2. Masukkan bumbu halus ke dalam blender, haluskan secara merata.\n" +
                "3. Panaskan sedikit minyak, tumis bumbu halus yang sudah diblender.\n" +
                "4. Masukkan daun salam dan lengkuas. Masak hingga harum.\n" +
                "5. Tuang air, santan cair, tahu, cabai rawit, cabai hijau, dan gula merah. Lalu masukkan gula, garam, dan merica. Aduk agar semua bumbu merata.\n" +
                "6. Tunggu hingga mendidih sambil terus diaduk agar santan tidak pecah.\n" +
                "7. Lakukan koreksi rasa. Matikan kompor.\n" +
                "8. Sayur lombok tahu pun siap disajikan.",
        "1. Panaskan wajan, masukkan bawang putih, bawang merah, lengkuas, daun salam. Tumis hingga harum.\n" +
                "2. Masukkan bayam, tempe, santan cair, aduk bumbu agar merata.\n" +
                "3. Masak sampai kuah mendidih.\n" +
                "4. Masukkan garam, kaldu bubuk, dan gula. Lakukan koreksi rasa.\n" +
                "5. Angkat dan sajikan bobor bayam selagi hangat.",
        "1. Goreng tahu hingga setengah matang, sisihkan.\n" +
                "2. Masukkan bumbu halus ke dalam blender, haluskan secara merata.\n" +
                "3. Panaskan sedikit minyak, tumis bumbu halus yang sudah diblender.\n" +
                "4. Masukkan daun salam dan lengkuas. Masak hingga harum.\n" +
                "5. Tuang air, santan cair, tahu, cabai rawit, cabai hijau, dan gula merah. Lalu masukkan gula, garam, dan merica. Aduk agar semua bumbu merata.\n" +
                "6. Tunggu hingga mendidih sambil terus diaduk agar santan tidak pecah.\n" +
                "7. Lakukan koreksi rasa. Matikan kompor.\n" +
                "8. Sayur lombok tahu pun siap disajikan.",
        "1. Panaskan wajan, masukkan bawang putih, bawang merah, lengkuas, daun salam. Tumis hingga harum.\n" +
                "2. Masukkan bayam, tempe, santan cair, aduk bumbu agar merata.\n" +
                "3. Masak sampai kuah mendidih.\n" +
                "4. Masukkan garam, kaldu bubuk, dan gula. Lakukan koreksi rasa.\n" +
                "5. Angkat dan sajikan bobor bayam selagi hangat.",
        "1. Goreng tahu hingga setengah matang, sisihkan.\n" +
                "2. Masukkan bumbu halus ke dalam blender, haluskan secara merata.\n" +
                "3. Panaskan sedikit minyak, tumis bumbu halus yang sudah diblender.\n" +
                "4. Masukkan daun salam dan lengkuas. Masak hingga harum.\n" +
                "5. Tuang air, santan cair, tahu, cabai rawit, cabai hijau, dan gula merah. Lalu masukkan gula, garam, dan merica. Aduk agar semua bumbu merata.\n" +
                "6. Tunggu hingga mendidih sambil terus diaduk agar santan tidak pecah.\n" +
                "7. Lakukan koreksi rasa. Matikan kompor.\n" +
                "8. Sayur lombok tahu pun siap disajikan.",
        "1. Panaskan wajan, masukkan bawang putih, bawang merah, lengkuas, daun salam. Tumis hingga harum.\n" +
                "2. Masukkan bayam, tempe, santan cair, aduk bumbu agar merata.\n" +
                "3. Masak sampai kuah mendidih.\n" +
                "4. Masukkan garam, kaldu bubuk, dan gula. Lakukan koreksi rasa.\n" +
                "5. Angkat dan sajikan bobor bayam selagi hangat.",
        "1. Goreng tahu hingga setengah matang, sisihkan.\n" +
                "2. Masukkan bumbu halus ke dalam blender, haluskan secara merata.\n" +
                "3. Panaskan sedikit minyak, tumis bumbu halus yang sudah diblender.\n" +
                "4. Masukkan daun salam dan lengkuas. Masak hingga harum.\n" +
                "5. Tuang air, santan cair, tahu, cabai rawit, cabai hijau, dan gula merah. Lalu masukkan gula, garam, dan merica. Aduk agar semua bumbu merata.\n" +
                "6. Tunggu hingga mendidih sambil terus diaduk agar santan tidak pecah.\n" +
                "7. Lakukan koreksi rasa. Matikan kompor.\n" +
                "8. Sayur lombok tahu pun siap disajikan.",
        "1. Panaskan wajan, masukkan bawang putih, bawang merah, lengkuas, daun salam. Tumis hingga harum.\n" +
                "2. Masukkan bayam, tempe, santan cair, aduk bumbu agar merata.\n" +
                "3. Masak sampai kuah mendidih.\n" +
                "4. Masukkan garam, kaldu bubuk, dan gula. Lakukan koreksi rasa.\n" +
                "5. Angkat dan sajikan bobor bayam selagi hangat.",
        "1. Goreng tahu hingga setengah matang, sisihkan.\n" +
                "2. Masukkan bumbu halus ke dalam blender, haluskan secara merata.\n" +
                "3. Panaskan sedikit minyak, tumis bumbu halus yang sudah diblender.\n" +
                "4. Masukkan daun salam dan lengkuas. Masak hingga harum.\n" +
                "5. Tuang air, santan cair, tahu, cabai rawit, cabai hijau, dan gula merah. Lalu masukkan gula, garam, dan merica. Aduk agar semua bumbu merata.\n" +
                "6. Tunggu hingga mendidih sambil terus diaduk agar santan tidak pecah.\n" +
                "7. Lakukan koreksi rasa. Matikan kompor.\n" +
                "8. Sayur lombok tahu pun siap disajikan.",
        "1. Goreng tahu hingga setengah matang, sisihkan.\n" +
                "2. Masukkan bumbu halus ke dalam blender, haluskan secara merata.\n" +
                "3. Panaskan sedikit minyak, tumis bumbu halus yang sudah diblender.\n" +
                "4. Masukkan daun salam dan lengkuas. Masak hingga harum.\n" +
                "5. Tuang air, santan cair, tahu, cabai rawit, cabai hijau, dan gula merah. Lalu masukkan gula, garam, dan merica. Aduk agar semua bumbu merata.\n" +
                "6. Tunggu hingga mendidih sambil terus diaduk agar santan tidak pecah.\n" +
                "7. Lakukan koreksi rasa. Matikan kompor.\n" +
                "8. Sayur lombok tahu pun siap disajikan."
    )
    val listData: ArrayList<Recipe>
        get() {
            val list = arrayListOf<Recipe>()
            for (position in recipeNames.indices){
                val recipe = Recipe()
                recipe.name = recipeNames[position]
                recipe.detail = recipeDetails[position]
                recipe.photo = recipePhotos[position]
                recipe.time = recipeTimes[position]
                recipe.ingredientSum = recipeIngredientSums[position]
                recipe.rating = recipeRatings[position].toInt()
                recipe.ingredient = recipeIngredients[position]
                recipe.stepCook = recipeStepsCook[position]
                recipe.calorie = recipeCalorie[position]
                list.add(recipe)
            }
            return list
        }
}