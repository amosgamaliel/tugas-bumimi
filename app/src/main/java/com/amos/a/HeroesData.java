package com.amos.a;

import java.util.ArrayList;

    public class HeroesData {
        private static String[] heroNames = {
                "Adam Satria Nugraha",
                "Adi Wahyudi",
                "Ardiansyah Dwi Anto",
                "Arva Hauzan Radithya",
                "Budiman Budiarja"
        };

        private static String[] heroDetails = {
                "Adam adalah seorang Ketua Murid dari SMKN 2 Cimahi di kelas XI RPL A tahun ini",
                "Adi adalah seorang pemuda yang kalau di lab duduknya dekat adam, kalau di kelas duduknya deket azriel",
                "Ardiansyah adalah ogud, ogud adalah ardiansyah tuan rumah kalau nyate",
                "Arva Hauzan Radhitya gamer ganteng idaman nenek nenek",
                "Budi jago ngitung penikmat film dan game "
        };

        private static int[] heroesImages = {
                R.mipmap.adam_satria_round,
                R.mipmap.adi_wahyudi_round,
                R.mipmap.ogud_round,
                R.mipmap.arva_round,
                R.mipmap.budi_round
        };

        static ArrayList<Hero> getListData() {
            ArrayList<Hero> list = new ArrayList<>();
            for (int position = 0; position < heroNames.length; position++) {
                Hero hero = new Hero();
                hero.setName(heroNames[position]);
                hero.setDetail(heroDetails[position]);
                hero.setPhoto(heroesImages[position]);
                list.add(hero);
            }
            return list;
        }
    }
