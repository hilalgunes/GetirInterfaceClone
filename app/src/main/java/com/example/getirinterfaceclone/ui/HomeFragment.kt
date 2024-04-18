package com.example.getirinterfaceclone.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirinterfaceclone.R
import com.example.getirinterfaceclone.adapter.CatagoriesAdapter
import com.example.getirinterfaceclone.adapter.OfferAdapter
import com.example.getirinterfaceclone.data.entity.Catagories
import com.example.getirinterfaceclone.data.entity.Offer
import com.example.getirinterfaceclone.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.recyclerViewCategories.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerViewCategories.isNestedScrollingEnabled = false


        val campaigns = ArrayList<Offer>()
        campaigns.add(Offer(1,"offer_one"))
        campaigns.add(Offer(2,"offer_two"))
        campaigns.add(Offer(3,"offer_three"))
        campaigns.add(Offer(4,"offer_four"))

        val offerAdapter: OfferAdapter = OfferAdapter(requireContext(), campaigns)
        binding.recyclerView.adapter = offerAdapter

        val catagories = ArrayList<Catagories>()
        catagories.add(Catagories(1, "Süper İkili", "super_ikili"))
        catagories.add(Catagories(2, "Kazandıranlar", "kazandiranlar"))
        catagories.add(Catagories(3, "İndirimler", "indirimler"))
        catagories.add(Catagories(4, "Yeni Ürünler", "yeni_urunler"))
        catagories.add(Catagories(5, "Su & İçecek", "su_icecek"))
        catagories.add(Catagories(6, "Atıştırmalık", "atistirmalik"))
        catagories.add(Catagories(7, "Dondurma", "dondurma"))
        catagories.add(Catagories(8, "Temel Gıda", "temel_gida"))
        catagories.add(Catagories(9, "Kahvaltılık", "kahvaltilik"))
        catagories.add(Catagories(10, "Yiyecek", "yiyecek"))
        catagories.add(Catagories(11, "Kişisel Bakım", "kisisel_bakim"))
        catagories.add(Catagories(12, "Ev Bakım", "ev_bakim"))
        catagories.add(Catagories(13, "Ev Yaşam", "ev_yasam"))
        catagories.add(Catagories(14,"Bebek Bakım", "bebek"))


        val catagoriesAdapter: CatagoriesAdapter = CatagoriesAdapter(requireContext(), catagories)
        binding.recyclerViewCategories.adapter = catagoriesAdapter



        return binding.root
    }

}