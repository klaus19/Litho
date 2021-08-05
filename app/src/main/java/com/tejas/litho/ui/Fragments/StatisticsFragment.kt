package com.tejas.litho.ui.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tejas.litho.R
import com.tejas.litho.ui.ViewModels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment:Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()

}